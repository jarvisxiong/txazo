package org.txazo.test.simple.listener;

import org.txazo.test.simple.assertion.AssertionFailedError;
import org.txazo.test.simple.test.AbstractTest;

/**
 * TestListener
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 21.05.2015
 */
public interface TestListener {

    public void testBefore(AbstractTest test);

    public void testAfter(AbstractTest test);

    public void addSuccess(AbstractTest test);

    public void addError(AbstractTest test, Throwable throwable);

    public void addFailure(AbstractTest test, AssertionFailedError error);

    public void addThrowable(AbstractTest test, Throwable throwable);

}
