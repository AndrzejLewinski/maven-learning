package org.example.learning.LightPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

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



}
