package week12_2DArrays;

public class example2 {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-'; }
        }
        board[0][0] = 'X'; board[1][0] = 'O';
        /*
         * Can you add more plays so that we have a winner? */
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(board[i][j]); }
            System.out.println(); }
    }
}


