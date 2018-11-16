import java.util.*;

public class MainSweeper {


	public static void main(String[] args) {

		int rows, cols;
		Scanner sc = new Scanner(System.in);	


		System.out.println("How many rows in the board?");
		rows = sc.nextInt();
		System.out.println("How many cols in the board?");
		cols = sc.nextInt();	
		System.out.println("Ok, cool your board will be " + rows + " rows and " + cols + "columns!");



		boolean [][] board = new boolean[cols][rows] ;
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				board[i][j] = false;

			}
		}

		System.out.println("how many mines do you want to make?");
		int mines = sc.nextInt();

//		setMines(mines, board);


		for (int i = 0; i < cols; i++) {
			System.out.println();
			for (int j = 0; j < rows; j++) {
				if (board[i][j] == false) {
					System.out.print(1);
				}else {
				System.out.print(0);
				}
				
			}




		}
	}
}
