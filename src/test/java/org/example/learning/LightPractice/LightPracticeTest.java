package org.example.learning.LightPractice;

import org.example.learning.HelpClasses.TestableCircle;
import org.example.learning.InitialLearningPhase.LegacyLightPractice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Created by User on 19.05.2025
 *
 *
 */
public class LightPracticeTest {


    @Test
    void circleAreaTest(){
        TestableCircle circle4 = new TestableCircle(4);
        TestableCircle circle5 = new TestableCircle(5);
        double area5 = circle5.area();
        double area4 = circle4.area();
        LegacyLightPractice lp = new LegacyLightPractice();
        double areaFive = lp.circleArea(5);
        double areaFour = lp.circleArea(4);
        Assertions.assertEquals(area4,areaFour,0.0001);
        Assertions.assertEquals(area5,areaFive,0.0001);
    }


    @Test
    void testTriangleArea(){

        LegacyLightPractice lightPractice = new LegacyLightPractice();
        Assertions.assertEquals(6,lightPractice.triangleArea(3,4));
        Assertions.assertEquals(60000,lightPractice.triangleArea(300,400));
        Assertions.assertEquals(25,lightPractice.triangleArea(5,10));
    }

    @Test
    void testAdd() {
        LegacyLightPractice lightPractice = new LegacyLightPractice();
        int result = lightPractice.add(2,3);
        Assertions.assertEquals(5, result);
        Assertions.assertEquals(0, lightPractice.add(-2, 2));
        Assertions.assertEquals(-5, lightPractice.add(-2, -3));
    }

    @Test
    void testFactorial(){
        LegacyLightPractice lp = new LegacyLightPractice();
        int result0 = lp.returnFactorial(0);
        int result = lp.returnFactorial(3);
        int result2 = lp.returnFactorial(4);
        int result3 = lp.returnFactorial(5);
        int result4 = lp.returnFactorial(6);
        Assertions.assertEquals(1,result0);
        Assertions.assertEquals(1, lp.returnFactorial(0));
        Assertions.assertEquals(6,result);
        Assertions.assertEquals(24,result2);
        Assertions.assertEquals(120,result3);
        Assertions.assertEquals(720,result4);
        for (int i : new int[]{-1, -5,-55,-100}) {
            try {
                lp.returnFactorial(i); // Wywołanie metody
                Assertions.fail("Expected IllegalArgumentException for input: " + i);
            } catch (IllegalArgumentException e) {
                Assertions
                        .assertEquals("You should enter positive value to this method."
                        , e.getMessage());
            }
        }
    }
}
