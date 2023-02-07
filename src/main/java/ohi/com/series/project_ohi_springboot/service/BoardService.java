package ohi.com.series.project_ohi_springboot.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface BoardService {


    List<HashMap<String, Object>> selectBoardList(Map<String,Object> commandMap) throws Exception;
    int selectBoardCount(Map<String,Object> commandMap) throws Exception;

}
