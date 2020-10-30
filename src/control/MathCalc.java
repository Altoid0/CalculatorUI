package control;
import java.lang.Math;
public class MathCalc {
	// Updated enumerator list to include new functions
	public static enum OPERATOR { NOOP, PLUS, MINUS, DIVIDE, MULTIPLY, MODULUS, EXPONENT, LOG, SIN, COS, TAN, SQRT };
	public static double calculateIt(double arg1, OPERATOR mathOp, double arg2) {

		double calcAnswer;
		switch(mathOp)
	    {
	        case PLUS:
	            calcAnswer = arg1 + arg2;
	            break;
	        case MINUS:
	            calcAnswer = arg1 - arg2;
	            break;
	            // Added Divide Button: Dhruv K
	        case DIVIDE:
	            calcAnswer = arg1 / arg2;
	            break;
	            // Added Multiply Button: Dhruv K
	        case MULTIPLY:
	            calcAnswer = arg1 * arg2;
	            break;
	            // Added Modulus Button: Dhruv K
			case MODULUS:
				calcAnswer = arg1 % arg2;
				break;
				// Added Exponent Button: Dhruv K
			case EXPONENT:
				calcAnswer = Math.pow(arg1,arg2);
				break;
				// Added Log Button: Gautam G
			case LOG:
				calcAnswer = Math.log10(arg1);
				break;
			case SIN:
				calcAnswer = Math.sin(arg1);
				break;
			case COS:
				calcAnswer = Math.cos(arg1);
				break;
			case TAN:
				calcAnswer = Math.tan(arg1);
				break;
			case SQRT:
				calcAnswer = Math.sqrt(arg1);
				break;
	        case NOOP:
	        default:	
	            calcAnswer = arg1;
	    }
		return calcAnswer;
	}
	

}
