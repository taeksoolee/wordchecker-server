package com.wordchecker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordchecker.dao.BoardDao;
import com.wordchecker.dto.Board;
import com.wordchecker.dto.BoardFilter;
import com.wordchecker.dto.BoardMember;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDao boardDao;
	
	@Override
	public List<BoardMember> getBoardMember(BoardFilter filter) {
		
		return boardDao.selectBoardMember(filter);
	}

	@Override
	public Board getBoardNo(int no) {
		return boardDao.selectBoardNo(no);
	}

	@Override
	public int addBoard(Board board) {
		return boardDao.insertBoard(board);
	}

	@Override
	public int modifyBoard(Board board) {
		return boardDao.updateBoard(board);
	}

	@Override
	public int modifyBoardState(Board board) {
		return boardDao.updateBoardState(board);
	}
}
