package org.txazo.test.simple.runner;

/**
 * SimpleTestRunnerTest
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 22.05.2015
 */
public class SimpleTestRunnerTest {

    public static void main(String[] args) {
        TestRunner runner = new SimpleTestRunner();
        runner.run("org.txazo.test.simple.runner", false);
    }

}
