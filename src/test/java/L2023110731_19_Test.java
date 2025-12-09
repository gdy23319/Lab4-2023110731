public class L2023110731_19_Test {
    //分为2个单元，依次测试是否正确输出。
    //原则：测试是否和题目规定的输出相同，验证代码正确性
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 测试目的：测试示例1，用例：测试用例1
        System.out.println("测试示例1:");
        int[][] board1 = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        printBoard("初始状态:", board1);
        solution.gameOfLife(board1);
        printBoard("下一状态:", board1);

        System.out.println();

        // 测试目的：测试示例2，用例：测试用例2
        System.out.println("测试示例2:");
        int[][] board2 = {{1,1},{1,0}};
        printBoard("初始状态:", board2);
        solution.gameOfLife(board2);
        printBoard("下一状态:", board2);
    }

    private static void printBoard(String message, int[][] board) {
        System.out.println(message);
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}