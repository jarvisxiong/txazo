package org.txazo.test.test;

import org.txazo.test.exception.TestException;
import org.txazo.test.annotation.AfterClass;
import org.txazo.test.annotation.BeforeClass;
import org.txazo.test.builder.TestBuilder;
import org.txazo.test.runner.TestExecuor;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * ClassTest
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 21.05.2015
 */
public class ClassTest extends AbstractTest {

    private Class<?> clazz;
    private Map<Method, MethodTest> methodTests = new HashMap<Method, MethodTest>();

    public ClassTest() {
    }

    public ClassTest(Class<?> clazz, boolean init) {
        this.clazz = clazz;
        if (init) {
            this.methodTests = TestBuilder.buildMethodTests(clazz);
        }
    }

    @Override
    public void test() {
        try {
            TestExecuor.executeAnnotationMethods(clazz, BeforeClass.class, true);
        } catch (TestException e) {
            listener.addThrowable(this, getCauseThrowable(e));
        } catch (Throwable t) {
            listener.addThrowable(this, t);
        }

        for (Iterator<Map.Entry<Method, MethodTest>> i = methodTests.entrySet().iterator(); i.hasNext(); ) {
            i.next().getValue().runTest(listener);
        }

        try {
            TestExecuor.executeAnnotationMethods(clazz, AfterClass.class, true);
        } catch (TestException e) {
            listener.addThrowable(this, getCauseThrowable(e));
        } catch (Throwable t) {
            listener.addThrowable(this, t);
        }
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public synchronized void addMethodTest(MethodTest methodTest) {
        if (clazz == null) {
            clazz = methodTest.getClazz();
        }
        if (!methodTests.containsKey(methodTest.getMethod())) {
            methodTests.put(methodTest.getMethod(), methodTest);
        }
    }

}
