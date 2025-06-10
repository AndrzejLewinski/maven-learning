package org.example.learning.essentials.HelloWorld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by User on 10.06.2025
 */
public class HelloWorldTest {


    @Test
    public void helloWorldInputTest(){


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // 🧪 Testowana metoda
        HelloWorld.helloWorldInput("Hi, there");

        // 🔄 Przywrócenie System.out
        // System.setOut(...) przekierowuje wypisywanie z konsoli
        // do bufora ByteArrayOutputStream
        System.setOut(originalOut);

        // ✅ Sprawdzenie wyniku
        String output = outContent.toString().trim();
        Assertions.assertEquals("Hi, there", output);

    }


}
