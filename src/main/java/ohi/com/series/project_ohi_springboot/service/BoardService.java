package ohi.com.series.project_ohi_springboot.service;

import ohi.com.series.project_ohi_springboot.dto.BoardDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface BoardService {


    //List<HashMap<String, Object>> selectBoardList(Map<String,Object> commandMap) throws Exception;

    List<BoardDTO> selectBoardList(Map<String,Object> commandMap) throws Exception;

    int selectBoardCount(Map<String,Object> commandMap) throws Exception;

}
