package edu.bit.ex.board.service;

import java.sql.Timestamp;
import java.util.List;
import edu.bit.ex.board.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> getList();
}
