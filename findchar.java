/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class findchar {
    public static void main(String[] args) {
        char ch;int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=s.nextLine().toLowerCase();
        System.out.println("\nenter the character to find: ");
        ch=s.next().toLowerCase().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch) {
                count++;
            }
        }
        System.out.println("the character "+ch+" appears "+count+" times");
        s.close();
    }
}
