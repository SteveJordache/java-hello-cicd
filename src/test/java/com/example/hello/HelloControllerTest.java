package com.example.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    void testHello() {

        HelloController controller = new HelloController();

        assertEquals(
                "Hello from Java CI/CD!",
                controller.hello()
        );
    }

    @Test
    void testHealth() {

        HelloController controller = new HelloController();

        assertEquals(
                "OK",
                controller.health()
        );
    }
}
