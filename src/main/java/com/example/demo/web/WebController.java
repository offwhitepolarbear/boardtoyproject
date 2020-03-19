package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class WebController {
    private PostsService postsService;
    @GetMapping("/")
    public String main(Model model) {
    	System.out.println("메인호출");
    	model.addAttribute("posts", postsService.findAllDesc());
        return "main";
    }
    @RequestMapping("/1")
    public String tester () {
    	return "2";
    }
    @RequestMapping("/loginView")
    public String login() {
    	return"login";
    }
}
