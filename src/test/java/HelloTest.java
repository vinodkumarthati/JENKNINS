package com.vinod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void testHelloMain() {
        try {
            Hello.main(new String[]{});
        } catch (Exception e) {
            fail("Hello.main() should run without exceptions");
        }
    }
}
