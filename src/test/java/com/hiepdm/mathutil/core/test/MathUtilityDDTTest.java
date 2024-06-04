/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hiepdm.mathutil.core.test;

import com.hiepdm.mathutil.core.MathUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Hiep
 */
public class MathUtilityDDTTest {

    //CHUAN BI BO DATA DUA VAO HAM GETFACTORIAL()
    //CHUAN BI LUON BO DATA KET QUA TRA VE TU HAM
    //0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6
    //{0, 1}, {1, 1}, {2, 2}, {3, 6}
    public static Object[][] initData() {
        return new Object[][]{{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}};
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgReturnWell(int n, long expected) {
        assertEquals(expected, MathUtil.getFactorial(n));
    }

}
