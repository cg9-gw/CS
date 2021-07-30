package computerscience;
import static java.lang.System.*;
public class lab8a {

	public static void main(String[] args) {
		int y = 5;
		out.println("actual = "+y);
		doStuff(y);
		out.println("actual = "+y);
		double z = 5.4;
		out.println("actual = "+z);
		doStuff(z);
		out.println("actual = "+z);

	}
	
	public static void doStuff(int x) {
		out.println("formal = "+x);
		x=6;
		out.println("formal = "+x);
	}
	
	public static void doStuff(double x) {
		out.println("formal = "+x);
		x=6;
		out.println("formal = "+x);
		
	}

}
