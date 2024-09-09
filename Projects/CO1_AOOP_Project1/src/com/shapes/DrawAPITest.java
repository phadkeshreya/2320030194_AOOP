package com.shapes;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DrawAPITest {
	@Test
    void testRedCircleDraw() {
        DrawAPI redCircle = new RedCircle();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        redCircle.drawCircle(10, 100, 100);

        String expectedOutput = "Drawing Circle[ color: red, radius: 10, x: 100, 100]\n";
        if (expectedOutput.equals(outContent.toString())) {
            System.out.println("RedCircleTest passed.");
        } else {
            System.out.println("RedCircleTest failed.");
        }

        System.setOut(originalOut);
    }

    @Test
    void testGreenCircleDraw() {

        DrawAPI greenCircle = new GreenCircle();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        greenCircle.drawCircle(10, 100, 100);

        String expectedOutput = "Drawing Circle[ color: green, radius: 10, x: 100, 100]\n";
        if (expectedOutput.equals(outContent.toString())) {
            System.out.println("GreenCircleTest passed.");
        } else {
            System.out.println("GreenCircleTest failed.");
        }

        System.setOut(originalOut);
    }
}
