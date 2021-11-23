package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddShouldAddWhenNumberPositive(){
        Calculator calculator=new Calculator();
        double result = calculator.add(4,7);
        Assert.assertEquals(11,result,0);
    }

    @Test
    public void testAddShouldAddWhenNumberNegative(){
        Calculator calculator=new Calculator();
        double result = calculator.add(-4,-7);
        Assert.assertEquals(-11,result,0);
    }
    public void testAddShouldAddWhenNumberFractional(){
        Calculator calculator=new Calculator();
        double result = calculator.add(-4.2,-7.3);
        Assert.assertEquals(-11.5,result,0);
    }

    @Test
    public void testSubShouldSubWhenNumberPositive(){
        Calculator calculator=new Calculator();
        double result = calculator.sub(4,7);
        Assert.assertEquals(-3,result,0);
    }

    @Test
    public void testSubShouldSubWhenNumberNegative(){
        Calculator calculator=new Calculator();
        double result = calculator.sub(-4,-7);
        Assert.assertEquals(3,result,0);
    }
    public void testSubShouldSubWhenNumberFractional(){
        Calculator calculator=new Calculator();
        double result = calculator.add(-4.2,-7.3);
        Assert.assertEquals(3.1,result,0);
    }

    @Test
    public void testMulShouldMulWhenNumberPositive(){
        Calculator calculator=new Calculator();
        double result = calculator.mul(3,7);
        Assert.assertEquals(21,result,0);
    }

    @Test
    public void testMulShouldMulWhenNumberNegative(){
        Calculator calculator=new Calculator();
        double result = calculator.mul(-3,-7);
        Assert.assertEquals(21,result,0);
    }

    @Test
    public void testDivShouldDivWhenNumberPositive(){
        Calculator calculator=new Calculator();
        double result = calculator.div(1,3);
        Assert.assertEquals(0.3,result,0.1);
    }

    @Test
    public void testDivShouldDivWhenNumberNegative(){
        Calculator calculator=new Calculator();
        double result = calculator.div(-5,-2);
        Assert.assertEquals(2.5,result,0.1);
    }

}
