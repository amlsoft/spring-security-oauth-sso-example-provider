package org.springframework.security.oauth.examples.sparklr.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

  @RequestMapping("/login")
  public ModelAndView login(HttpServletRequest request) {
    ModelAndView modelAndView = new ModelAndView("layout:login");
    modelAndView.addObject("session", request.getSession());
    return modelAndView;
  }
}
