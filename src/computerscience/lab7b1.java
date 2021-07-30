package computerscience;
import java.io.*; import java.util.*;
import static java.lang.System.*;
public class lab7b1 {

	public static void main(String[] args) throws IOException {
		Scanner j = new Scanner(new File("src/lab7b1.in"));
		int N1,N2,N3,N4;
		N1 = j.nextInt();N2=j.nextInt();N3=j.nextInt();N4=j.nextInt();
		int [] ints = new int[N1];
		for(int b:ints) {
			out.print(b+" ");
		}
		out.println();
		Arrays.fill(ints,N2,N3,N4);
		for(int b:ints) {
			out.print(b+" ");
		}
	}

}
