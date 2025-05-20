public SumOrSameGame(int rows, int cols) {
    puzzle = new int[rows][cols];
    for(int r = 0; r < puzzle.length; r++)
        for(int c = 0; c < puzzle[0].length; c++)
            puzzle[r][c] = (int) (Math.random() * 9) +1;
}
