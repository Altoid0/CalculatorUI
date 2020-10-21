package model;
import control.MathCalc.OPERATOR;
import view.CalculatorUI;

public class CalculatorModel {

    public double calcAnswerModel;

    public CalculatorModel() {
    }

    public CalculatorModel(double arg1, OPERATOR mathOp, double arg2) {
        this.calcAnswerModel = control.MathCalc.calculateIt(arg1, mathOp, arg2);
    }
}
