/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Dul mu'in
 */
public class d {

    public static void main(String[] args) {
        int n = 91298;

        int r = 0;
        while (n > 9) {
            String s = n + "";
            char c[] = s.toCharArray();
            for (char d : c) {
                r += d - '0';
            }
            n = r;
            r = 0;
        }
        
        System.out.println(n);
    }

}
