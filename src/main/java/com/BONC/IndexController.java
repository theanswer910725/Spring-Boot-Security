package com.BONC;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping("/posts/{id}")
	public String index(@PathVariable("id") long id, Model model) {
	    model.addAttribute("title", "This is a post with id = " + id);
	    model.addAttribute("created", "2016-5-10");
	    model.addAttribute("content", "This is content");
	    return "index";
	}

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
    
    @RequestMapping("/users/{username}")
    public String userProfile(@PathVariable("username") String username) {
        return String.format("user %s", username);
    }

    @RequestMapping("/posts/{id}")
    public String post(@PathVariable("id") int id,Model model) {
    	model.addAttribute("posts", Data.posts);
        return "post";
    }
}
