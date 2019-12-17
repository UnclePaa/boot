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
@RequestMapping(path = "/authenticate")
public class AuthController {

    private final RegUserRepository regUserRepository;
    private final AuthUserRepository authUserRepository;

    public AuthController(AuthUserRepository authUserRepository, RegUserRepository regUserRepository) {
        this.authUserRepository = authUserRepository;
        this.regUserRepository = regUserRepository;
    }

    @GetMapping
    public ModelAndView main(ModelAndView modelAndView) {
        modelAndView.setViewName("/authenticate");
        modelAndView.addObject("authuser", new AuthUser());
        return modelAndView;
    }

    @PostMapping
    public ModelAndView main(@ModelAttribute AuthUser authUser, ModelAndView modelAndView) {
        String email = authUser.getEmail();
        String pass = authUser.getPass();
        for (User regUser :
                regUserRepository.findAll()) {
            if (regUser.getEmail().equals(email) & regUser.getPass().equals(pass)) {
                authUserRepository.save(authUser);
                modelAndView.setViewName("redirect:/myroom");
            } else {
                modelAndView.addObject("authMessage", "Please check the entered data");
                modelAndView.setViewName("redirect:/authenticate");
            }
            for (AuthUser aUser :
                    authUserRepository.findAll()) {
                if (aUser.getEmail().equals(email) & aUser.getPass().equals(pass)) {
                    modelAndView.addObject("authMessage", "You are already authenticated");
                }
            }
        }
        return modelAndView;
    }
}
