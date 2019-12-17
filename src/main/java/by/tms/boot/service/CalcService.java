package by.tms.boot.service;

import by.tms.boot.entity.CalcData;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service("calcService")
public class CalcService {

    private CalcData calcData;

    public void setCalcData(CalcData calcData) {
        this.calcData = calcData;
    }

    public double calculate() {
        double result = 0.0;
        if (calcData.getAct().equals("sum")) {
            result = calcData.getNum1() + calcData.getNum2();
        }
        if (calcData.getAct().equals("sub")) {
            result = calcData.getNum1() - calcData.getNum2();
        }
        if (calcData.getAct().equals("mult")) {
            result = calcData.getNum1() * calcData.getNum2();
        }
        if (calcData.getAct().equals("div")) {
            result = calcData.getNum1() / calcData.getNum2();
        }
        return result;
    }
}