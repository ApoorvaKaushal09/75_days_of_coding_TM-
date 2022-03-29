import java.util.*;
class Solution {
    public boolean caller(int[][] board, int i, int j)
    {
        int one = 0;
        if(board[i][j] == 0)
        {
            if(j+1 < board[0].length && board[i][j+1] == 1)
                one++;
            if(j-1 >= 0 && board[i][j-1] == 1)
                one++;
            if(i+1 < board.length && j+1 < board[0].length && board[i+1][j+1] == 1)
                one++;
            if(i-1 >= 0 && j+1 < board[0].length && board[i-1][j+1] == 1)
                one++;
            if(i+1 < board.length && j-1 >= 0 && board[i+1][j-1] == 1)
                one++;
            if(i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == 1)
                one++;
            if(i+1 < board.length && board[i+1][j] == 1)
                one++;
            if(i-1 >= 0 && board[i-1][j] == 1)
                one++;
            if(one == 3)
                return true;
            else
                return false;
        }
        else{
            if(j+1 < board[0].length && board[i][j+1] == 1)
                one++;
            if(j-1 >= 0 && board[i][j-1] == 1)
                one++;
            if(i+1 < board.length && j+1 < board[0].length && board[i+1][j+1] == 1)
                one++;
            if(i-1 >= 0 && j+1 < board[0].length && board[i-1][j+1] == 1)
                one++;
            if(i+1 < board.length && j-1 >= 0 && board[i+1][j-1] == 1)
                one++;
            if(i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == 1)
                one++;
            if(i+1 < board.length && board[i+1][j] == 1)
                one++;
            if(i-1 >= 0 && board[i-1][j] == 1)
                one++;
            if(one < 2)
                return false;
            else if(one == 2 || one == 3)
                return true;
            else if(one > 3)
                return false;
            
        }
        return true;
    }
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        if(n>=1)
        {
        int[][] answer = new int[m][n]; boolean ans = false;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
               ans = caller(board, i, j);
                if(ans == false)
                    answer[i][j] = 0;
                else
                    answer[i][j] = 1;
            }
        }
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                board[i][j] = answer[i][j];
            }
        }
        }
    }
}