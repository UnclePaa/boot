package by.tms.boot.service;

import org.springframework.stereotype.Service;


@Service("calcService")
public class CalcService {

    public double calculate(double a, double b, String act) {
        Double result = null;
        if (act.equals("sum")) {
            result = a + b;
        }
        if (act.equals("sub")) {
            result = a - b;
        }
        if (act.equals("mult")) {
            result = a * b;
        }
        if (act.equals("div")) {
            result = a / b;
        }
    return result;
}

    public double sum(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }
}