import java.util.*;

public class MainSweeper {


	public static void main(String[] args) {

		int rows, cols;
		boolean done = false;
		Scanner sc = new Scanner(System.in);	


		System.out.println("How many rows in the board?");
		rows = sc.nextInt();
		System.out.println("How many cols in the board?");
		cols = sc.nextInt();	
		System.out.println("Ok, cool your board will be " + rows + " rows and " + cols + " columns!");



		boolean [][] board = new boolean[cols][rows] ;
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				board[i][j] = false;

			}
		}

		System.out.println("How many ?");
		int mines = sc.nextInt();

		setMines(mines, board);

		for (int iCol = 0; iCol < cols; iCol++) {
			System.out.println();
			for (int jRow = 0; jRow < rows; jRow++) {
				if (board[iCol][jRow] == false) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}

			}

		}

		int[][] numberMap = new int[cols][rows];
		for(int i = 0; i < cols; i ++) {
			for(int j = 0; j < rows; j++) {
				int count = 0;
				if(i != cols - 1 && board[i+1][j]) {//up
					count++;
				}
				if(i != cols - 1 && j != rows - 1 && board[i+1][j+1]) {//upper right
					count++;
				}
				if (j != rows - 1 && board[i][j+1]) {//right
					count++;
				}
				if(i != 0 && j != rows - 1 && board[i-1][j+1]) {//lower right
					count++;
				}
				if(i != 0 && board[i -1][j]) {//down
					count++;
				}
				if(i != 0 && j != 0 && board[i-1][j-1]) {//lower left
					count++;
				}
				if(j != 0 && board[i][j-1]) {//left
					count++;
				}
				if(i != cols - 1 && j != 0 && board[i+1][j-1]) {//upper left
					count++;
				}
				numberMap[i][j] = count;
			}
		}
		
		System.out.println();
		
		for (int iCol = 0; iCol < cols; iCol++) {
			System.out.println();
			for (int jRow = 0; jRow < rows; jRow++) {
				System.out.print(numberMap[iCol][jRow]);

			}

		}



//		while(!done) {
//
//			System.out.println("What move do you want to make? (c for click and f for flag)");
//
//			switch (sc.next().charAt(0)) {
//			case'c':
//			case'C':
//				click(sc, board);
//				done = check(board);
//				break;
//
//			case'f':
//			case'F':
//				flag(sc, board);
//				done = check(board);
//				break;
//
//			default:
//
//				System.out.println("Error: Invalid input");
//				break;
//			}
//
//
//
//			for (int iCol = 0; iCol < cols; iCol++) {
//				System.out.println();
//				for (int jRow = 0; jRow < rows; jRow++) {
//					if (board[iCol][jRow] == false) {
//						System.out.print(1);
//					} else {
//						System.out.print(0);
//					}
//
//				}
//			}
//		}
	}

	public static void setMines(int mines, boolean[][] board) {
		int mineCount = 0;
		while(mineCount<mines) {
			int col = new Random().nextInt(board.length);
			int row = new Random().nextInt(board[0].length);
			if(board[col][row] != true) {
				board[col][row] = true;
				mineCount++;
			}
		}
	}




}
