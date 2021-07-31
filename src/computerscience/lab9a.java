package computerscience;
import java.util.*; import java.io.*;
import static java.lang.System.*;
public class lab9a {

	public static void main(String[] args) throws IOException {
		Scanner j = new Scanner(new File("src/lab9A.in"));
		int grida[][] = new int[4][3];
		for(int r=0;r<4;r++) {
			for(int c=0;c<3;c++) {
				grida[r][c] = j.nextInt();
			}
		}
		int gridb[][] = new int[4][3];
		for(int r=0;r<4;r++) {
			for(int c=0;c<3;c++) {
				gridb[r][c] = grida[r][c]/5;
			}
		}
		for(int[]g:grida) {
			for(int x:g) {
				out.print(x+" ");
			} out.println();
		} out.println();
		for(int[]g:gridb) {
			for(int x:g) {
				out.print(x+" ");
			} out.println();	
		} out.println();		

	}

}
