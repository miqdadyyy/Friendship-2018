/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dul mu'in
 */
public class e {

    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}};
        int r = a.length;
        int c = a[0].length;

        for (int i = 0; i < c; i++) {
            for (int j = r - 1; j >= 0; j--) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
