import static org.junit.Assert.*;

public class TestA {
    @org.junit.Test
    public  void tests1() {
        Solution solution = new Solution();

        int[][] board1 = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int[][] expected1 = {{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
        solution.gameOfLife(board1);
        assertArrayEquals(expected1, board1);

        int[][] board2 = {{1,1},{1,0}};
        int[][] expected2 = {{1,1},{1,1}};
        solution.gameOfLife(board2);
        assertArrayEquals(expected2, board2);
    }
}

