package org.txazo.reflection;

import org.txazo.test.runner.SuiteTestRunner;
import org.txazo.test.runner.TestRunner;

/**
 * RunnerTest
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 26.05.2015
 */
public class RunnerTest {

    public static void main(String[] args) {
        TestRunner runner = new SuiteTestRunner();
        runner.run(ReflectionField.class);
    }

}
