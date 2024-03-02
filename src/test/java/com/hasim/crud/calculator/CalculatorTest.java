package com.hasim.crud.calculator;


import org.assertj.core.api.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
@AfterAll
public  static void  cleanup(){
    System.out.println("Before All : cleanup()");
}

@BeforeAll
public  static void  init(){
    System.out.println("After All : init()");
}


    @Test
    public void additionTest(){
        System.out.println("this is addition test");
        int actual=Calculator.addition(4,5);
        int expected=9;
        Assertions.assertEquals(actual,expected);


//        actual result     :  8
//        expected result   :  6
    }
}
