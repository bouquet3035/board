package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.domain.BoardVO;
@Mapper
public interface BoardMapper {
	public void boardInsert(BoardVO board) throws Exception;
	public List<BoardVO> boardSelect () throws Exception;
}
