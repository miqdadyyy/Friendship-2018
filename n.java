/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;

/**
 *
 * @author Dul mu'in
 */
public class n {
    static boolean visited[][];
    static int R,C;
    static final int dirx[] = {1,0};
    static final int diry[] = {0,1};
    
    public static void main(String[] args){
        int[][] a = {
            {1,1,0,0,1},
            {1,0,1,0,1},
            {1,0,1,1,0},
            {0,0,1,1,0},
        };
        R = a.length;
        C = a[0].length;
        visited = new boolean[R][C];
        for (boolean[] bs : visited) {
            Arrays.fill(bs, false);
        }
        
        System.out.println(count(a));
    }
    
    static boolean isSafe(int[][] a, int r, int c){
        return ((r < R && r >= 0) && (c < C && c >= 0) && !visited[r][c] && a[r][c] == 1);
    }
    
    static void DFS(int[][] a, int y, int x){
        visited[y][x] = true;
        
        for (int i = 0; i < 2; i++) {
            int dy = diry[i];
            int dx = dirx[i];
            if(isSafe(a, y+dy, x+dx)){
                DFS(a,y+dy, x+dx);
            }
        }
    }
    
    static int count(int[][] a){
        int r = 0;
        
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(a[i][j] == 1 && !visited[i][j]){
                    DFS(a, i, j);
                    ++r;
                }
            }
        }
        
        return r;
    }
}
