import java.util.Random;

public class TempClass {
	
	public static void setMines(int mines, boolean[][] board) {
		int mineCount = 0;
		while(mineCount<mines) {
			int xVal = new Random().nextInt(mines);
			int yVal = new Random().nextInt(mines);
			if(board[xVal][yVal] != true) {
				board[xVal][yVal] = true;
				mineCount++;
			}
		}
	}
}
