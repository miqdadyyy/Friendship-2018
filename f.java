/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dul mu'in
 */
public class f {

    public static void main(String[] args) {
        String s = "aaawqqdfq";
        s = s.toLowerCase();
        int a[] = new int[26];
        char[] c = s.toCharArray();
        for (char d : c) {
            a[d - 'a']++;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                char x = (char) (i + 'a');
                System.out.printf("%c : %d\n", x, a[i]);
            }
        }
    }
}
