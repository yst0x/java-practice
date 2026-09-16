package com.yst.lc;

//566.重塑数组
public class Solution3 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        int[][] rxc=new int[r][c];
        for(int x=0;x<m*n;x++){
            rxc[x/c][x%c]=mat[x/n][x%n];
        }
        return rxc;
    }
}
