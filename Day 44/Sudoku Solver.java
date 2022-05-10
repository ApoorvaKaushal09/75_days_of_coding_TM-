class Solution {
    public void solveSudoku(char[][] board) {
        solve(0,0,board);
    }
    
    private boolean solve(int row, int col, char[][] board){
        // If completed all rows, we have solved board, return true
        if(row==9) return true;
        
        // Reached to the last cell in a row, move to next row and first col
        if(col==9) {
            return solve(row+1,0,board);
        }
        
        // If current cell is empty
        if(board[row][col]=='.'){
            for(char num='1';num<='9';num++){
                // try placing each number at empty cell
                // if board is still valid, move to next cell
                boolean valid = isValid(num,row,col,board);
                
                if(valid){
                    // place the number
                    board[row][col] = num;
                    
                    // solve for next cell
                    boolean solved = solve(row,col+1,board);
                    
                    
                    if(solved){
                        return true;        
                    }else {
                        // if board can't be solved with current number
                        // reset and try next number
                        board[row][col] = '.';
                    };
                }
            }
            
        }
        else {
            // if not empty, solve for next cell in same row
            return solve(row,col+1,board);
        }
        
        
        return false;
        
    }
    
    private boolean isValid(char n,int row,int col,char[][] board){
        char digit = n;
        
        // check if row has n
        for(int i=0;i<9;i++){
            if(board[row][i]==digit) return false;
        }

        // check if col has n
        for(int i=0;i<9;i++){
            if(board[i][col]==digit) return false;
        }
        
        // check if 3x3 box has n
        // get index of first cell in 3x3 matrix for current row,col
        // then iterate all the cell in 3x3 matrix
        
        // these are the first cells of each 3x3 matrix
        // (0,0) (0,3) (0,6)
        // (3,0) (3,3) (3,6)
        // (6,0) (6,3) (6,6)
        
        int startRowIndex = (row/3)*3;
        int startColIndex = (col/3)*3;
        
        for(int i = startRowIndex; i < startRowIndex+3; i++){
            for(int j = startColIndex; j < startColIndex+3; j++){
                if(board[i][j]==digit) return false;
            }
        }
		
        return true;
    }
}