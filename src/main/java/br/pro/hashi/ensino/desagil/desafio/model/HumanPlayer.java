package br.pro.hashi.ensino.desagil.desafio.model;

public class HumanPlayer extends Player {
    private final boolean[][] visited;
    private final int numRows;
    private final int numCols;
    public HumanPlayer(int row, int col, Board board) {
        super(row, col, board);
        numRows = board.getNumRows();
        numCols = board.getNumCols();

        visited = new boolean[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {

                // Uma parede não pode ser visitada, então já começa como true.
                visited[i][j] = board.isWall(i, j);
            }
        }
    }

    public void moveUp() {
        if (row > 0 && !board.isWall(row - 1, col)) {
            move(-1, 0);
        }
    }

    public void moveRight() {
        if (col < board.getNumCols() - 1 && !board.isWall(row, col + 1)) {
            move(0, 1);
        }
    }

    public void moveDown() {
        if (row < board.getNumRows() - 1 && !board.isWall(row + 1, col)) {
            move(1, 0);
        }
    }

    public void moveLeft() {
        if (col > 0 && !board.isWall(row, col - 1)) {
            move(0, -1);
        }
    }
    public void isWinner() {
        if (visited[4][14]){
            move(0, 0);
        }
    }
}
