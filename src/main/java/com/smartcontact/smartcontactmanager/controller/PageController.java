package com.smartcontact.smartcontactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {
  
    @RequestMapping("/home")
    public String home(Model model){
      System.out.println("Home page Controller"); 
      model.addAttribute("name", "prince");
      return "home";
    }

    @RequestMapping("/about")
    public String about() {
      System.out.println("this is about page");
        return "about";
    }
    
    @RequestMapping("/services")
    public String service(Model model){
       model.addAttribute("isLogin", false);
      System.out.println("this is service page");
      return "service";
    }

}
