/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rect;

/**
 *
 * @author MOKLET-2
 */
    public class RunRect {
    public static void main(String[] args) {
        Rect pertama = new Rect (1, 1, 4, 4);
        Rect kedua = new Rect (2, 3, 5, 6);
        
        System.out.println("2, 3 is inside the union");
        System.out.println(pertama+ "union" +kedua+ "=" +pertama.union(kedua));
        System.out.println(pertama + " intersect " +kedua+ "=" +pertama.intersection(kedua));
    }
    
}
