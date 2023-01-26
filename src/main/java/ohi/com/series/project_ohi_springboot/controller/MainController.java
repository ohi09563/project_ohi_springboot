package ohi.com.series.project_ohi_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


    @RequestMapping(value = "/home")
    public String main(){

        return "home";
    }
}
