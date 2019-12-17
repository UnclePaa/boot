package by.tms.boot.controller;

import by.tms.boot.entity.AuthUser;
import by.tms.boot.entity.User;
import by.tms.boot.repo.AuthUserRepository;
import by.tms.boot.repo.RegUserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/register")
public class RegController {
    private final RegUserRepository regUserRepository;
    private final AuthUserRepository authUserRepository;

    public RegController(RegUserRepository regUserRepository, AuthUserRepository authUserRepository) {
        this.regUserRepository = regUserRepository;
        this.authUserRepository = authUserRepository;
    }

    @GetMapping
    public ModelAndView reg(ModelAndView modelAndView) {
        modelAndView.setViewName("/register");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping
    public ModelAndView reg(@ModelAttribute User user, ModelAndView modelAndView) {
        regUserRepository.save(user);
        AuthUser authUser = new AuthUser();
        authUser.setEmail(user.getEmail());
        authUser.setPass(user.getPass());
        authUserRepository.save(authUser);
        modelAndView.setViewName("redirect:/myroom");
        return modelAndView;
    }
}