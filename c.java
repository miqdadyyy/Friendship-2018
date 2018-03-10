/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Dul mu'in
 */
public class c {

    static int[][] a;
    static String res = "";

    public static void main(String[] args) {
        int n = 3;
        int size = (int) Math.pow(6, n);
        a = new int[size][n];
        int[] r = new int[n];
        bf(n, r, 0);
        res = res.substring(0,res.length()-1);
        System.out.println(res);
        
    }

    static void bf(int n, int[] r, int index) {
        if (n == 0) {
            String s = "[";
            for (int i : r) {
                s = s + i + ",";
            }
            s = s.substring(0, s.length()-1);
            s = s + "]";
            res = res + s + ",";
            
            return;
        }
        for (int i = 1; i < 7; i++) {
            r[index] = i;
            bf(n - 1, r, index + 1);
        }
    }
}
