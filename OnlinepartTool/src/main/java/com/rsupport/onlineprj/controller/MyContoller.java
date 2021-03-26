package com.rsupport.onlineprj.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyContoller {

  @GetMapping("/")
  public String index(Model model, Principal principal) {
    model.addAttribute("message", "You are logged in as " + principal.getName());
    return "index";
  }
  
  
//  @RequestMapping(value="/login")
//  public String page() throws Exception {
//      return "/login";
//  }
//  
//
  @RequestMapping(value="/ctiadmin")
  public String admin() throws Exception{
    return "ctiadmin";
  }
}
