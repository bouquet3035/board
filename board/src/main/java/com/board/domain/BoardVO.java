package com.board.domain;

import java.util.ArrayList;
import java.util.List;

public class BoardVO {
	private Integer bno;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	private Integer viewcnt;
	
	private ArrayList<Integer> bnoArray;
	private ArrayList<String> titleArray;
	private ArrayList<BoardVO> BoardVoArray;
	
	public Integer getBno() {
		return bno;
	}

	public void setBno(Integer bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public Integer getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(Integer viewcnt) {
		this.viewcnt = viewcnt;
	}

	public List<Integer> getBnoArray() {
		return bnoArray;
	}

	public ArrayList<String> getTitleArray() {
		return titleArray;
	}

	public void setTitleArray(ArrayList<String> titleArray) {
		this.titleArray = titleArray;
	}

	public void setBnoArray(ArrayList<Integer> bnoArray) {
		this.bnoArray = bnoArray;
	}

	public ArrayList<BoardVO> getBoardVoArray() {
		return BoardVoArray;
	}

	public void setBoardVoArray(ArrayList<BoardVO> boardVoArray) {
		BoardVoArray = boardVoArray;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", viewcnt=" + viewcnt + ", bnoArray=" + bnoArray + ", titleArray=" + titleArray
				+ ", BoardVoArray=" + BoardVoArray + "]";
	}
	
}
