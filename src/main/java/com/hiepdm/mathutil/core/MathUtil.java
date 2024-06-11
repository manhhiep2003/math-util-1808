/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hiepdm.mathutil.core;

/**
 *
 * @author Hiep
 */
public class MathUtil {
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0 to 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }    
        return n * getFactorial(n - 1);
        //recursion
    }
    
    //5! = 1.2.3.4.5
    //   = 4!.5
    //n! = n x (n - 1)! 
    
}
