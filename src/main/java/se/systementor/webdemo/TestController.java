package se.systementor.webdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/hello.html")
    public String index(Model model){
        model.addAttribute("message","hej hopp g3jhgh");
        return "index";
    }
}
