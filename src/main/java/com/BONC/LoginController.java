package com.BONC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session, HttpServletRequest request) {
        if ("admin".equals(username) && "password".equals(password)) {
        	session = request.getSession();
        	session.setAttribute("root", true);
        }

        return "redirect:/";
    }
}
