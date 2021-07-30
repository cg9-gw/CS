package computerscience;
import java.util.*; import java.io.*;
import static java.lang.System.*;
public class lab7b2 {

	public static void main(String[] args) throws IOException {
		Scanner j = new Scanner(new File("src/lab7B2.in"));
		double [] doubles = new double [j.nextLine().split(" ").length];
		double [] doubles2 = new double [j.nextLine().split(" ").length];
		j.close();
		Scanner k = new Scanner(new File("src/lab7b2.in")); // cry about it
		for(int i=0;i<doubles.length;i++) {
			doubles[i] = k.nextDouble();
		}
		out.println("Array 1:");
		for(double d:doubles) {
			out.print(d+" ");
		}
		out.println();
		
		for(int i=0;i<doubles2.length;i++) {
			doubles2[i] = k.nextDouble();
		}
		out.println("Array 2:");
		for(double d:doubles2) {
			out.print(d+" ");
		}
		out.println();
		double [] combined = new double [doubles.length+doubles2.length];
		System.arraycopy(doubles, 0, combined, 0, doubles.length);
		System.arraycopy(doubles2, 0, combined, doubles.length, doubles2.length);
		out.println("Arrays combined:");
		for(double d:combined) {
			out.print(d+" ");
		} out.println();
		out.println("Arrays combined and sorted:");
		Arrays.sort(combined);
		for(double d:combined) {
			out.print(d+" ");
		}		
	}

}
