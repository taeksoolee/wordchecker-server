package com.wordchecker.dao;

import java.util.List;

import com.wordchecker.dto.Word;
import com.wordchecker.dto.WordFilter;
import com.wordchecker.dto.WordTestFilter;

public interface WordDao {
	List<Word> selectWordList(WordFilter filter);
	List<Word> selectWordTest(WordTestFilter filter);
	Word selectWordNo(int no);
	int insertWord(List<Word> wordList);
	int updateWord(Word word);
	int updateWordState(Word word);
}
