package by.tms.boot.controller;

import by.tms.boot.entity.CalcData;
import by.tms.boot.entity.Result;
import by.tms.boot.repo.ResultRepository;
import by.tms.boot.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;

@Controller
@RequestMapping(path = "/calculator")
public class CalcController {
    private final ResultRepository resultRepository;

    @Autowired
    private CalcService calcService;

    public CalcController(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @GetMapping
    public ModelAndView modelAndView(ModelAndView modelAndView) {
        modelAndView.setViewName("/calculator");
        modelAndView.addObject("calcData", new CalcData());
        return modelAndView;
    }

    @PostMapping
    public ModelAndView modelAndView(@Valid @ModelAttribute CalcData calcData, ModelAndView modelAndView) {
        modelAndView.setViewName("redirect:/history");
        Result result = new Result();
        calcService.setCalcData(calcData);
        double finalData = calcService.calculate();
        result.setResult(finalData);
        result.setDate(new Date());
        resultRepository.save(result);
        return modelAndView;
    }
}