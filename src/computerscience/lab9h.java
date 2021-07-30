package computerscience;
import java.util.*; import java.io.*;
import static java.lang.System.*;
public class lab9h {

	public static void main(String[] args) throws IOException {
		Scanner j = new Scanner(new File("src/lab9h.in"));
		int [][]alphaGrid = new int[j.nextInt()][j.nextInt()];
		for(int r=0;r<alphaGrid.length;r++) {
			for(int c=0;c<alphaGrid[0].length;c++) {
			alphaGrid[r][c]=j.nextInt();
			}
		}
		int [][]bravoGrid = new int[j.nextInt()][j.nextInt()];
		for(int r=0;r<bravoGrid.length;r++) {
			for(int c=0;c<bravoGrid[0].length;c++) {
			bravoGrid[r][c]=j.nextInt();
			}
		}
		int [][]charlieGrid = matMult(alphaGrid,bravoGrid);
		for(int r=0;r<alphaGrid.length;r++) {
			out.print("|");
			for(int c=0;c<alphaGrid[0].length;c++) {
				out.print(alphaGrid[r][c]+"|");
			} out.println();
		}
		out.println("\nTIMES\n");
		for(int r=0;r<bravoGrid.length;r++) {
			out.print("|");
			for(int c=0;c<bravoGrid[0].length;c++) {
				out.print(bravoGrid[r][c]+"|");
			} out.println();
		}
		out.println("\nEQUALS\n");
		for(int r=0;r<charlieGrid.length;r++) {
			out.print("|");
			for(int c=0;c<charlieGrid[0].length;c++) {
				out.print(charlieGrid[r][c]+"|");
			} out.println();
		}		
		
		j.close();
	}
	
	public static int[][] matMult(int[][] agrid,int[][] bgrid) {
		int rows = agrid.length;
		int cols = bgrid[0].length;
		int cgrid[][] = new int[rows][cols];
		for(int r=0;r<rows;r++) {
			for(int c=0;c<cols;c++) {
				for(int x=0;x<agrid[0].length;x++) {
					cgrid[r][c]+=agrid[r][x]*bgrid[x][c];
				}
			}
		}
		
				
		return cgrid;
	}

}
