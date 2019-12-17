package by.tms.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/myroom")
public class MyRoomController {

    @GetMapping
    public ModelAndView modelAndView(ModelAndView modelAndView) {
        modelAndView.setViewName("/myroom");
        return modelAndView;
    }
}
