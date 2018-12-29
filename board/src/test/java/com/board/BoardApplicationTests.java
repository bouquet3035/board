package com.board;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.board.domain.BoardVO;
import com.board.mapper.BoardMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardApplicationTests {

	@Test
	public void contextLoads() {
		
	}
	@Autowired
    private SqlSessionFactory sqlSession; //작성
	
	@Autowired
    private BoardMapper mapper;
	
	@Test
    public void testSqlSession() throws Exception{//작성
        
        System.out.println("sqlSession : "+sqlSession);
        
    }

	@Test
    public void testMapper() throws Exception{//작성
        BoardVO vo = new BoardVO();
        vo.setTitle("제목입니다.1");
        vo.setContent("내용입니다.1");
        vo.setWriter("작성자");
        vo.setRegdate("2018.12.01");
        vo.setViewcnt(0);
        mapper.boardInsert(vo);
	}
	
	@Test
    public void testMapperForeach() throws Exception{//작성
		BoardVO realVo = new BoardVO();
		ArrayList<BoardVO> listVO = new ArrayList<BoardVO>();
        BoardVO vo1 = new BoardVO();
        vo1.setTitle("제목입니다.2");
        vo1.setContent("내용입니다.2");
        vo1.setWriter("작성자2");
        vo1.setRegdate("2018.12.02");
        vo1.setViewcnt(0);
        
        BoardVO vo2 = new BoardVO();
        vo2.setTitle("제목입니다.3");
        vo2.setContent("내용입니다.3");
        vo2.setWriter("작성자3");
        vo2.setRegdate("2018.12.03");
        vo2.setViewcnt(0);
        
        listVO.add(vo1);
        listVO.add(vo2);
        realVo.setBoardVoArray(listVO);
        mapper.boardInsertForEach(realVo);
        
        
	}
	
	@Test
	public void testSelect() throws Exception{
		mapper.boardSelect();
	}
	
	@Test
	public void testWhere() throws Exception{
		BoardVO vo = new BoardVO();
		ArrayList<String> bnoArray = new ArrayList<String>();
		bnoArray.add("제목입니다.");
		bnoArray.add("제목입니다.1");
		vo.setTitleArray(bnoArray);
		mapper.boardSelectWhere(vo);
	}
	
	
}

