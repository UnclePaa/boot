package by.tms.boot.model;

import by.tms.boot.service.CalcService;
import by.tms.boot.service.HistoryService;
import by.tms.boot.service.UserService;
import by.tms.boot.validator.NumericValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CalcAction {

    @Autowired
    private CalcService calcService;

    @Autowired
    private HistoryService historyService;

    @Autowired
    private UserService userService;

    @Autowired
    private User user;

    @Value("${num1}")
    String num1;
    @Value("${num2}")
    String num2;
    @Value("${action}")
    String action;
    @Value("${name}")
    String name;
    @Value("${age}")
    int age;


    public void run() {

        userService.createUser(name, age);
        System.out.println("Hello, " + user.getName());
        if (NumericValidator.isNumeric(num1) && NumericValidator.isNumeric(num2)) {
            double numberOne = Double.valueOf(num1);
            double numberTwo = Double.valueOf(num2);
            historyService.add("The result of " + action + "calculated by " +
                    user.toString() + " is " +
                    calcService.calculate(numberOne, numberTwo, action));
            System.out.println(historyService.getList());
        }
    }
}