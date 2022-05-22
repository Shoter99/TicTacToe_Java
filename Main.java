class Main {

    public static int[][] BOARD = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

    public static void main(String[] args) {
        drawBoard(BOARD);
    }

    public static void drawBoard(int[][] board) {
        System.out.println(" ---  ---  ---");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char symbol;
                switch (board[i][j]) {
                    case 0:
                        symbol = ' ';
                        break;
                    case 1:
                        symbol = 'X';
                        break;
                    case 2:
                        symbol = 'O';
                        break;
                    default:
                        symbol = ' ';
                        break;
                }
                System.out.printf("| %s |", symbol);
            }
            System.out.println("");
            System.out.println(" ---  ---  ---");
        }
    }
}