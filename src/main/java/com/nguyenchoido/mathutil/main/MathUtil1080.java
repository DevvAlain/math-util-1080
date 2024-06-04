/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nguyenchoido.mathutil.main;

import com.nguyenchoido.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author trand
 */
public class MathUtil1080 {

    //psvm để tạo nhanh hàm main
    public static void main(String[] args) {
        //Cách 2: Test hàm = cách popup

        int n = 0;
        long expectedValue = 1; //Hy vọng 0! = 1
        long actualValue; //=? chờ hàm trả về
        actualValue = MathUtility.getFactorial(n);

        String result = n + "! | Expected: " + expectedValue
                + " | Actual: " + actualValue;
        
        JOptionPane.showMessageDialog(null, result);
    }

//    public static void main(String[] args) {
//        //TESTCASE #01
//        //N = 0, expected value = 1, actual value: ?, status: Passed/Failed
//        int n = 0;
//        long expectedValue = 1; //Hy vọng 0! = 1
//        long actualValue; //=? chờ hàm trả về
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("0! | Expected: " + expectedValue
//                + " Actual: " + actualValue);
//        
//        //TESTCASE #02
//        //N = 1, expected value = 1, actual value: ?, status: Passed/Failed
//        n = 1;
//        expectedValue = 1; //Hy vọng 1! = 1
//        actualValue = MathUtility.getFactorial(n); //=? chờ hàm trả về
//        System.out.println("1! | Expected: " + expectedValue
//                + " Actual: " + actualValue);
//        
//        //TESTCASE #03
//        //N = 5, expected value = 120, actual value: ?, status: Passed/Failed
//        n = 5;
//        expectedValue = 120; //Hy vọng 5! = 120
//        actualValue = MathUtility.getFactorial(n); //=? chờ hàm trả về
//        System.out.println("0! | Expected: " + expectedValue
//                + " Actual: " + actualValue);
//        
//        //TESTCASE #04
//        //N = 1, expected value = 1, actual value: ?, status: Passed/Failed
//        System.out.println("Check if the IllegalArgumentException is throw:");
//        n = -1;
//        //expectedValue = 1; //Hy vọng -1! = Exception
//        actualValue = MathUtility.getFactorial(n); //=? chờ hàm trả về
//        System.out.println("-1! | Expected: " + expectedValue
//                + " Actual: " + actualValue);
//    }
}
