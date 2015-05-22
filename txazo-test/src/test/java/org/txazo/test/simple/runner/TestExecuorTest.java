package org.txazo.test.simple.runner;

import org.junit.Assert;
import org.junit.Test;
import org.txazo.test.simple.Before;

import java.lang.reflect.Method;

/**
 * TestExecuorTest
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 22.05.2015
 */
public class TestExecuorTest {

    private TestExecuor execuor = new TestExecuor();

    @Test
    public void testGetInstance() throws InstantiationException, IllegalAccessException {
        TestExecuorTest test1 = execuor.getInstance(TestExecuorTest.class);
        TestExecuorTest test2 = execuor.getInstance(TestExecuorTest.class);
        Assert.assertSame(test1, test2);
        Assert.assertSame(test1.getClass(), TestExecuorTest.class);
    }

    @Before
    public static void test1() {
        System.out.println("test1");
    }

    @Before
    public static void test2() {
        System.out.println("test2");
    }

    @Test
    public void testExecute1() throws NoSuchMethodException {
        Method method = TestExecuorTest.class.getDeclaredMethod("test", null);
        execuor.executeNoneStaticMethod(method);
    }

    @Test
    public void testExecute2() {
        execuor.executeAnnotationMethods(TestExecuorTest.class, Before.class, false);
    }

    @Test
    public void testExecute3() {

    }

}
