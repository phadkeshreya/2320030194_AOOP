package com.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest {
	private TestDrawAPI testDrawAPI;
    private Circle circle;

    @BeforeEach
    void setUp() {
        testDrawAPI = new TestDrawAPI();
        circle = new Circle(100, 100, 10, testDrawAPI);
    }

    @Test
    void testDraw() {
        // Act
        circle.draw();

        // Manual verification
        if (testDrawAPI.getRadius() == 10 &&
            testDrawAPI.getX() == 100 &&
            testDrawAPI.getY() == 100 &&
            testDrawAPI.getCallCount() == 1) {
            System.out.println("CircleTest passed.");
        } else {
            System.out.println("CircleTest failed.");
        }
    }

    // Inner class to test Circle without using a mocking framework
    static class TestDrawAPI implements DrawAPI {
        private int radius;
        private int x;
        private int y;
        private int callCount = 0;

        @Override
        public String drawCircle(int radius, int x, int y) {
            this.radius = radius;
            this.x = x;
            this.y = y;
            this.callCount++;
			return null;
        }

        public int getRadius() {
            return radius;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getCallCount() {
            return callCount;
        }
    }
}
