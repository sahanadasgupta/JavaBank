package week12_2DArrays;

public class example3 {
    public static void main(String[] args) {
        // Try adding a new row to the 2D Array // Try adding a new column to the Array // Which is easier?
        int[][] grid = new int[][]{ {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + "\t"); }
            System.out.println(); }
    }
}

