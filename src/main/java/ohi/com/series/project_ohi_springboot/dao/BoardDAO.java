package ohi.com.series.project_ohi_springboot.dao;

import ohi.com.series.project_ohi_springboot.dto.BoardDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface BoardDAO {


    public List<HashMap<String,Object>> selectBoardList(Map<String, Object> commandMap) throws Exception;
    public int selectBoardCount(Map<String, Object> commandMap) throws Exception;






}
