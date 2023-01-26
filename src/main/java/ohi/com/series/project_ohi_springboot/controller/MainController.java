package ohi.com.series.project_ohi_springboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ohi.com.series.project_ohi_springboot.service.BoardService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    protected final Log log = LogFactory.getLog(this.getClass());


    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/home")
    public String main(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {




        log.debug("================================================================");
        log.debug("commandMap ==========>" + commandMap);
        log.debug("================================================================");


        List<HashMap<String,Object>> boardList = boardService.selectBoardList(commandMap);

        model.addAttribute("boardList",boardList);






        return "home";
    }
}
