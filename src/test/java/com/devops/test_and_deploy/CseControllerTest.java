package com.devops.test_and_deploy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CseControllerTest {

    @Autowired
    CseController cseController;

    @Test
    public void  testAdd() {
        String result = cseController.add(2, 3);
        assertEquals("This is 23MH1A05N0! Sum of 2 3 : 5", result);
    }

}
