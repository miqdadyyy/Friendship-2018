/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Dul mu'in
 */
public class l {
    public static void main(String[] args){
        int n = 120;
        if(n == 1){
            System.out.println(1);
            return;
        }
        else if(n == 2){
            System.out.println("1 1");
            return;
        }
        
        int[] a = {1,1};
        int[] res = pascal(n-1,a);
        for (int re : res) {
            System.out.print(re+" ");
        }
        System.out.println("");
    }
    static int[] pascal(int n, int[] a){
        if(n == 1)
            return a;
        int[] r = new int[a.length+1];
//        System.out.println(a.length);
        r[0] = 1;
        r[r.length-1] = 1;
        int index = 1;
        for (int i = 1; i < r.length-1; i++) {
            r[i] = a[index] + a[index-1];
            index++;
        }
        return pascal(n-1,r);
    }
}
