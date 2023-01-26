package ohi.com.series.project_ohi_springboot.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BoardDAOImpl implements BoardDAO{


    @Autowired
    private SqlSession sqlSession;
    private static final String NameSpace= "ohi.com.series.project_ohi_springboot.mappers.BoardMapper";

    @Override
    public List<HashMap<String, Object>> selectBoardList(Map<String, Object> commandMap) throws Exception {
        return sqlSession.selectList(NameSpace+".selectBoardList", commandMap);
    }
}
