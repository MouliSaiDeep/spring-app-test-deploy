package com.devops.test_and_deploy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CseControllerTest {

    @Autowired
    CseController cseController;

    // @Test
    // public void  testAdd() {
    //     int result = cseController.add(2, 3);
    //     assertEquals(5, result);
    // }

}
