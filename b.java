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
public class b {

    public static void main(String[] args) {
        int n = 3;
        int x = 100;
        
        for (int i = n; i <= x; i++) {
            boolean b = false;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    b = true;
                    break;
                }
            }
            if(!b){
                System.out.println(i);
            }
        }
    }
}
