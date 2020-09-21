/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author ADMIN
 */

import java.util.Scanner;
import java.lang.Math;


public class areacalculate {
    public static float area(float x){
        return 3.14f*x*x;
    }
    public static float area(float x,float y) {
        return x*y;
    }
    public static float area(float x,float y,float z){
        double a=(x+y+z)/2;
        return (float) Math.sqrt(a*(a-x)*(a-y)*(a-z));
    }
    public static void main(String[] args) {
        int ch;
        float x,y,z,a;
        double b=0;
        System.out.println("select the shape whose area should be calculated:\n");
        System.out.println("1.RECTANGLE\n2.CIRCLE\n3.TRIANGLE\n");
        Scanner s=new Scanner(System.in);
        ch=s.nextInt();
        switch(ch){
            case 1:{System.out.println("enter the two sides of the rectangle: ");
                   x=s.nextInt();
                   y=s.nextInt();
                   float p=area(x,y);
                   System.out.println("\narea of the rectangle is "+p);
                   break;
                   }
            case 2:{System.out.println("\nenter the radius of the circle: ");
                   x=s.nextInt();
                   float q=area(x);
                   System.out.println("\narea of the circle is "+q);
                   break;
                   }
            case 3:{System.out.println("\nenter the three sides of the triangle: ");
                   float r = 0;
                   x=s.nextInt();
                   y=s.nextInt();
                   z=s.nextInt();
                   if((x+y>z)&&(y+z>x)&&(x+z>y)) {
                    a=(x+y+z)/2;
                    r=area(x,y,z);
                   }
                   else{System.out.println("ERROR!!");
                        System.exit(0);
                   } 
                   System.out.println("the area of the triangle is "+r);
                   break;
                   }
                }
                   
        }
    }
   
        
    
    

 
