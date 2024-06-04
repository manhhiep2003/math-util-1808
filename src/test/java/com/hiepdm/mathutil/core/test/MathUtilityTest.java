/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hiepdm.mathutil.core.test;

// QUY TAC DAT TEN PACKAGE JAVA: TEN MIEN DAO NGUOC: com.hiepdm.mathutil
// QUY TAC DAT TEN PACKAGE .NET: TEN MIEN CHIEU XUOI: mathutil.hiepdm.com
import com.hiepdm.mathutil.core.MathUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Hiep
 */

// CLASS NAY CHUA CAC TEST CASE DE TEST CODE BEN MATHUTIL
public class MathUtilityTest {
    
    public MathUtilityTest() {
    }

    // TEST CASE LA BO DATA DAU VAO + CAC THAO TAC NHAP XUAT TREN APP, HAM, MAN HINH
    // DE VERIFY 1 HAM, MAN HINH, CHUC NANG CHAY DUNG HAY SAI
    // TEST CASE 1: CHECK TEST GETF()
    // INPUT N = 0
    // FRAMEWORK EP TA PHAI CODE THEO 1 QUY TAC
    // THU VIEN THI KHONG
    // FRAMEWORK LA THU VIEN NHUNG THU VIEN KHONG HAN LA FRAMEWORK
    @Test   
    public void testFactorialGivenRightArg0ReturnWell() {
        assertEquals(1, MathUtil.getFactorial(0));
    }
    
    // TEST CASE 2: CHECK TEST GETF() NEU GIVEN LA 1
    // INPUT N = 1
    @Test   
    public void testFactorialGivenRightArg1ReturnWell() {
        assertEquals(1, MathUtil.getFactorial(1));
    }
    
    // TEST CASE 3: CHECK TEST GETF() NEU GIVEN LA 5
    // INPUT N = 5
    // EXPECTED = 120
    @Test   
    public void testFactorialGivenRightArg5ReturnWell() {
        assertEquals(120, MathUtil.getFactorial(5));
    }
    
    // TEST CASE 4:
    @Test   
    public void testFactorialGivenRightArg12345ReturnWell() {
        assertEquals(1, MathUtil.getFactorial(1));
        assertEquals(2, MathUtil.getFactorial(2));
        assertEquals(6, MathUtil.getFactorial(3));
        assertEquals(24, MathUtil.getFactorial(4));
        assertEquals(120, MathUtil.getFactorial(5));
    }
    
    // TEST CASE 5: CHECK GETF() WITH N = -1, METHOD THROW EXCEPTION
    @Test
    public void testFactorialGivenWrongArgNegative1ReturnException() {
        // EXCEPTION IS NOT A VALUE TO COMPARISION
        // MathUtil.getFactorial(-1);
        assertThrows(IllegalArgumentException.class, () -> {MathUtil.getFactorial(-1);});
    }
}
