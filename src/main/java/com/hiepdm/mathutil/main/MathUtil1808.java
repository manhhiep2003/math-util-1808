/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hiepdm.mathutil.main;

import com.hiepdm.mathutil.core.MathUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author Hiep
 */
public class MathUtil1808 {

//    public static void main(String[] args) {
//        //TC01
//        //N = 0, EX VALUE: 1, ACTUAL VALUE: ?
//        int n = 0;
//        long expectedValue = 1;
//        long actualValue;
//        actualValue = MathUtil.getFactorial(n);
//        System.out.println("0! EXPECTED: " + expectedValue
//                            + " ACTUAL: " + actualValue);
//        //TC02
//        //N = 5, EX VALUE: 120, ACTUAL VALUE: ?
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtil.getFactorial(n);
//        System.out.println("5! EXPECTED: " + expectedValue
//                            + " ACTUAL: " + actualValue);
//        //TC03
//        //N = -1, EX VALUE: EXCEPTION, ACTUAL VALUE: ?
//        System.out.println("Check if the IllegalArgumentException is throw");
//        n = -1;
//        actualValue = MathUtil.getFactorial(n);
//        System.out.println("-1! EXPECTED: " + expectedValue
//                            + " ACTUAL: " + actualValue);
//    }
    
    public static void main(String[] args) {
        int n = 0;
        long expectedValue = 1;
        long actualValue;
        actualValue = MathUtil.getFactorial(n);
        System.out.println("0! EXPECTED: " + expectedValue
                            + " ACTUAL: " + actualValue);
        String result = n + "! | EXPECTED: " + expectedValue +
                        " | ACTUAL: " + actualValue;
        JOptionPane.showMessageDialog(null, result);
    }
}
