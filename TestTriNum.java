package main;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gabe.clark on 6/16/17.
 */
public class TestTriNum {
    TriNumber triNumCalc = new TriNumber();


    @Test
    public void testGeneratesNumbersProperly(){
        triNumCalc.generateTriNum(5);
        assertEquals(28, triNumCalc.triNum);
    }

    @Test
    public void testDivisorCounter(){
        int k = 5;
        triNumCalc.generateTriNum(k);
        triNumCalc.countDivisors();
        assertEquals(k, triNumCalc.divisors);
    }

    @Test
    public void assureTargetFound(){
        triNumCalc.findTriNumWithDivisorsGreaterThan(500);
        assertEquals(500, triNumCalc.triNum);
    }
}
