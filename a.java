/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Dul mu'in
 */
public class a {

    public static void main(String[] args) {
        int n = 4;
        int m = 2 * n - 1;

        for (int i = 1; i <= m; i++) {
            if (i % 4 == 2) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println("");
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m; j++) {
                if (j % 2 == 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        for (int i = 1; i <= m; i++) {
            if (i % 4 == 0) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println("");
    }
}
