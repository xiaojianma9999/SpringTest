package com.xiaojianma.test;

import com.xiaojianma.test.common.ComTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest extends ComTest {

    @Autowired(required = false)
    public com.xiaojianma.test.first.Test test1;

    @Autowired(required = false)
    public com.xiaojianma.test.second.Test test2;

    /**
     * Rigorous Test :-)
     */
/*    @Before
    public void setUp() {
        test1 = new com.xiaojianma.test.first.Test();
        boolean flag = test1.isRight();
        assertTrue(flag);
    }*/
    @Test
    public void shouldAnswerWithTrue() {
/*
        test1 = new com.xiaojianma.test.first.Test();
*/
        //Assert.isNull(test1);
        boolean flag = test1.isRight();
        assertTrue(flag);
    }
}
