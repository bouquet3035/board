package com.board;

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
        vo.setTitle("제목입니다.");
        vo.setContent("내용입니다.");
        vo.setWriter("작성자");
        vo.setRegdate("2018.12.01");
        vo.setViewcnt(0);
        mapper.boardInsert(vo);
	}
	
	@Test
	public void testSelect() throws Exception{
		mapper.boardSelect();
	}
}

