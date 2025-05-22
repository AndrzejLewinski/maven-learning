package org.example.learning.essentials.extremeeasy;

import org.example.learning.essentials.extremeeasy.IntroductionToJava.BasicMathematicalOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Created by User on 22.05.2025
 */
public class BasicMathematicalOperationsTest {

    BasicMathematicalOperations mathOps = new BasicMathematicalOperations();

    @Test
    void isPrimeTest(){
        Assertions.assertTrue(mathOps.reversingNumberMethodOne(2));
        Assertions.assertTrue(mathOps.reversingNumberMethodOne(127));
        Assertions.assertTrue(mathOps.reversingNumberMethodOne(11));
        Assertions.assertTrue(mathOps.reversingNumberMethodOne(13));
        Assertions.assertTrue(mathOps.reversingNumberMethodOne(97));
    }

    @Test
    void testNonPrimeNumbers() {
        assertFalse(mathOps.reversingNumberMethodOne(0));
        assertFalse(mathOps.reversingNumberMethodOne(12));
        assertFalse(mathOps.reversingNumberMethodOne(42));
        assertFalse(mathOps.reversingNumberMethodOne(102));
        assertFalse(mathOps.reversingNumberMethodOne(100));
    }

    @Test
    void testNegativeNumbers() {
        assertFalse(mathOps.reversingNumberMethodOne(-1));
        assertFalse(mathOps.reversingNumberMethodOne(-17));
        assertFalse(mathOps.reversingNumberMethodOne(-11));
        assertFalse(mathOps.reversingNumberMethodOne(-101));
    }
}
