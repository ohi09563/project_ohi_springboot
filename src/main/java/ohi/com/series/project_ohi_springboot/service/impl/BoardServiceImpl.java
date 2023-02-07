package ohi.com.series.project_ohi_springboot.service.impl;

import jakarta.annotation.Resource;
import ohi.com.series.project_ohi_springboot.dao.BoardDAO;
import ohi.com.series.project_ohi_springboot.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardServiceImpl implements BoardService {


   @Autowired
   private BoardDAO boardDAO;

    @Override
    public List<HashMap<String, Object>> selectBoardList(Map<String, Object> commandMap) throws Exception {
        return boardDAO.selectBoardList(commandMap);
    }
    @Override
    public int selectBoardCount(Map<String, Object> commandMap) throws Exception {
        return boardDAO.selectBoardCount(commandMap);
    }
}
