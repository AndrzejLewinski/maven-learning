package org.example.learning.LightPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Created by User on 19.05.2025
 *
 *
 */
public class LightPracticeTest {

    @Test
    void testAdd() {
        LightPractice lightPractice = new LightPractice();
        int result = lightPractice.add(2,3);
        Assertions.assertEquals(5, result);
    }

    @Test
    void testFactorial(){
        LightPractice lp = new LightPractice();
        int result = lp.factorial(3);
        int result2 = lp.factorial(7);
        Assertions.assertEquals(6,result);
        Assertions.assertEquals(720,result2);
    }



}
