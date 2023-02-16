/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khanhlh.mathutil.core.test;

import com.khanhlh.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {
    
    //Kiểm thử ngoại lệ thì sao???
    //tức là hàm getF() được thiết kế rằng nếu đưa cho n cà chớn
    //thì hàm phải ném ra ngoại lệ!!!
    //tức là getF(-5) thì EXPECTED == NGOẠI LỆ ILLEGAL ARGUMENT EXCEPTION
    //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        
        //Test case #5: getF() with a wrong arg: n = -5
        //Expected result: An exception is thrown: Illegal Argument Exception
        
        MathUtility.getFactorial(-5);
        
        //nếu chỉ gõ lệnh trên thì BỊ MÀU ĐỎ
        //DO LỆNH NÀY GÂY RA EXCEPTION, VÀ EXCEPTION LÀ
        //MÀU ĐỎ
        //NHƯNG HÀM NÀY MÌNH KÌ VỌNG RA EXCEPTION, NẾU CÓ EXP
        //THÌ HÀM ĐÚNG NHƯ THIẾT KẾ, ĐÚNG THIẾT KẾ THÌ PHẢI XANH
        //LỖI CỦA TA LÀ KHÔNG ĐO, KHÔNG SO SÁNH, KHÔNG CHƯA NHẬN 
        //DIỆN LÀ ĐÃ CÓ NGOẠI LỆ RỒI!!!
        //TA CẦN THÊM MỘT LỆNH: ĐÃ CÓ NGOẠI LỆ CHƯA???
        //CÓ RỒI -> XANH
        //CHƯA -> ĐỎ
        //JUnit 4 thì không dùng hàm assert() để đo ngoại lệ
        //JUnit 5 thì dùng hàm assert() để đo ngoại lệ
    }
    
    
    
    @Test
    //trong hàm chứa test case để test getF
    //với n hợp lệ trong khoảng 0..20
    public void testFactorialGivenRightArgumentReturnsWell(){
        //Test getF(0)
        //Expected Value: 0! = 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n); 
        Assert.assertEquals(expectedValue, actualValue);
        
        //Test case 2: test getF with n = 5
        // Expected 120
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        
        //Test case 3: test getF with n = 6
        // Expected 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        
        //Test case 4: test getF with n = 4
        // Expected 24
        Assert.assertEquals(24, MathUtility.getFactorial(4));
        
    } 
    
}
