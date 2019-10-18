package by.tms.boot.model;

import by.tms.boot.service.CalcService;
import by.tms.boot.validator.NumericValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CalcAction {

    @Autowired
    private CalcService calcService;


    @Value("${num1}")
    String num1;
    @Value("${num2}")
    String num2;
    @Value("${action}")
    String action;

    public void run() {
        if (NumericValidator.isNumeric(num1) && NumericValidator.isNumeric(num2)) {
            double numberOne = Double.valueOf(num1);
            double numberTwo = Double.valueOf(num2);
            System.out.println("The result of " + action + " is " +
                    calcService.calculate(numberOne, numberTwo, action));
        }
    }
}