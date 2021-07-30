package computerscience;
import static java.lang.System.*;
public class lab8b {

	public static void main(String[] args) {
		String word = "hello";
		out.println("actual memory = "+word.hashCode());
		out.println("actual = "+word);
		doStuff(word);
		out.println("actual memory = "+word.hashCode());
		out.println("actual = "+word);
	}
	
	public static void doStuff(String x) {
		out.println("formal = memory "+x.hashCode());
		out.println("formal = "+x);
		x="goodbye";
		out.println("formal = memory "+x.hashCode());
		out.println("formal = "+x);
	}

}
