package model;
import control.ConverterControl.CONVERT;
public class ConverterModel {
    public double converterModelAnswer;

    public ConverterModel(double convertValue, CONVERT convertOp) {
        this.converterModelAnswer = control.ConverterControl.convertIt(convertValue, convertOp);
    }
}
