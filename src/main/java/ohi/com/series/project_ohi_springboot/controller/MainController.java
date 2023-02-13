package ohi.com.series.project_ohi_springboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ohi.com.series.project_ohi_springboot.dto.ScoreDTO;
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




    @RequestMapping(value = "/")
    public String main(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {


        return "index";
    }
    @RequestMapping(value = "/home")
    public String home(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {




        log.debug("================================================================");
        log.debug("commandMap ==========>" + commandMap);
        log.debug("================================================================");


        List<HashMap<String,Object>> boardList = boardService.selectBoardList(commandMap);

        System.out.println("boradList="+boardList);

        model.addAttribute("boardList",boardList);






        return "home";
    }

    @RequestMapping(value = "/login")
    public String login(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {




        log.debug("================================================================");
        log.debug("commandMap ==========>" + commandMap);
        log.debug("login ==========>" );
        log.debug("================================================================");



        return "/login/login";
    }

    @RequestMapping(value = "/signup")
    public String signup(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {




        log.debug("================================================================");
        log.debug("commandMap ==========>" + commandMap);
        log.debug("signup ==========>" );
        log.debug("================================================================");





        return "login/signup";
    }

    @RequestMapping(value = "/signup_action")
    public String signup_action(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {




        log.debug("================================================================");
        log.debug("commandMap ==========>" + commandMap);
        log.debug("signup_action ==========>" );
        log.debug("================================================================");





        return "login/login";
    }


    @RequestMapping(value = "/score")
    public String score(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response, ScoreDTO scoreDTO) throws Exception {




        log.debug("================================================================");
        log.debug("commandMap ==========>" + commandMap);
        log.debug("score_action ==========>" );
        log.debug("================================================================");

        model.addAttribute("scoreDTO",scoreDTO);



        return "score/score";
    }

    @RequestMapping(value = "/map")
    public String map(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {




        log.debug("================================================================");
        log.debug("commandMap ==========>" + commandMap);
        log.debug("signup_action ==========>" );
        log.debug("================================================================");





        return "goodPlace/map";
    }


    @RequestMapping(value = "/board")
    public String board(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {




        log.debug("================================================================");
        log.debug("commandMap ==========>" + commandMap);
        log.debug("================================================================");

        String searchFieId = request.getParameter("searchFieId");
        String searchWord = request.getParameter("searchWord");

        if(searchWord!= null){

            commandMap.put("searchFieId",searchFieId);
            commandMap.put("searchWord",searchWord);
        }

       int boardCount = boardService.selectBoardCount(commandMap);

        System.out.println(boardCount);

        List<HashMap<String,Object>> boardList = boardService.selectBoardList(commandMap);

        System.out.println("boradList="+boardList);

        model.addAttribute("boardList",boardList);



        return "/board/board";
    }



    @RequestMapping(value = "/chat")
    public String chat(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {




        log.debug("================================================================");
        log.debug("commandMap ==========>" + commandMap);
        log.debug("chat_action ==========>" );
        log.debug("================================================================");





        return "websocket/MultiChatMain";
    }
    @RequestMapping(value = "/ChatWindow")
    public String chatWindow(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {



        String chatId= request.getParameter("chatId");

        log.debug("================================================================");
        log.debug("commandMap ==========>" + commandMap);
        log.debug("chatWindow_action ==========>" );
        log.debug("================================================================");

        model.addAttribute("chatId",chatId);



        System.out.print(chatId);
        return "websocket/ChatWindow";
    }

    @RequestMapping(value = "/calendal")
    public String calendal(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {



        log.debug("================================================================");
        log.debug("commandMap ==========>" + commandMap);
        log.debug("calendal_action ==========>" );
        log.debug("================================================================");



        return "calendal/Calendal";
    }


    @RequestMapping(value = "/Calendal_writer")
    public String Calendal_writer(Map<String,Object> commandMap, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {



        log.debug("================================================================");
        log.debug("commandMap ==========>" + commandMap);
        log.debug("Calendal_writer_action ==========>" );
        log.debug("================================================================");



        return "calendal/Calendal_writer";
    }

}
