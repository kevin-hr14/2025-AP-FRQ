Part A
    The goal of the constructor SumOrSameGame(int numRows, int numCols):
    Create a two-dimensional integer array puzzle:
    
    1) The size of this array is numRows (number of rows) x numCols (number of columns). //[numRows][numCols]
    
    2) Assign a random integer to each position in the array:
    a)A for loop is required.
    b)The value of each position is a random integer between 1 and 9 (inclusive). //(int)Math.random()*9+1;
    
    3) Note the index order:
    
    puzzle[row][col] means row row, column col.

Part B
    Simply put, it means
    
    Starting from the given (row, col), find an element that can be paired downwards;
    
    Satisfy "equality" or "add up to 10";
    
    After finding it, clear it and return true;
    
    If not found, return false;
    
    Avoid pairing with itself.
