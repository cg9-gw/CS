package computerscience;

import java.util.*; import java.io.*;
import static java.lang.System.*;

public class lab7a {
	
	public static void main(String[] args) {
		
	}

	public static void lab7a1(String[] args) {
		Scanner j = new Scanner(System.in);
		out.print("how many names >");
		int n = j.nextInt(); j.nextLine();
		String [] names = new String [n];
		for(int b=0;b<names.length;b++) {
			out.print("enter name >");
			names[b] = j.nextLine();
		}
		for(String name:names) {
			out.println(name);
		}
		out.println();
		Arrays.sort(names);
		for(String name:names) {
			out.println(name);
		}
		j.close();
	}
	
	

}
