package by.tms.boot.controller;

import by.tms.boot.repo.ResultRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/history")
public class HistoryController {

    private final ResultRepository resultRepository;

    public HistoryController(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @GetMapping
    public ModelAndView history(ModelAndView modelAndView) {
        modelAndView.setViewName("/history");
        modelAndView.addObject("history", resultRepository.findAll());
        return modelAndView;
    }
}
