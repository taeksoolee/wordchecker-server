package com.wordchecker.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.wordchecker.dto.Word;
import com.wordchecker.dto.WordFilter;
import com.wordchecker.exception.InvalidException;
import com.wordchecker.exception.MemberNotFoundException;
import com.wordchecker.exception.WrongAccessException;
import com.wordchecker.exception.XssException;

public interface WordService {
	List<Word> getWord(WordFilter filter);
	Word getWrodNo(int no);
	int addWord(Word word) throws MemberNotFoundException, InvalidException, XssException;
	int modifyWord(Word word) throws MemberNotFoundException, WrongAccessException, InvalidException, XssException;
	int modifyWordState(Word word) throws MemberNotFoundException, WrongAccessException, InvalidException, XssException;
}
