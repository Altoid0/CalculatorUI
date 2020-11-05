package control;
import java.lang.Math;
public class ConverterControl {
    public static enum CONVERT { NULL, FAHRENHEIT, FTINCHES, CENTIMETERS, CMINCHES};
    public static double convertIt(double convertValue, CONVERT convertOp ) {
        double convertedValue;
        switch (convertOp)
        {
            case FAHRENHEIT:
                convertedValue = (convertValue) * (1.8) + 32;
                break;
            case FTINCHES:
                convertedValue = convertValue*(12);
                break;
            case CENTIMETERS:
                convertedValue = convertValue*(2.54);
                break;
            case CMINCHES:
                convertedValue = convertValue/(2.54);
                break;
            case NULL:
            default:
                convertedValue = 0;
        }
        return convertedValue;
    }
}
