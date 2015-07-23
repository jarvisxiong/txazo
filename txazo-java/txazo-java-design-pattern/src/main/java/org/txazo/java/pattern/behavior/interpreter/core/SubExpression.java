package org.txazo.java.pattern.behavior.interpreter.core;

/**
 * SubExpression
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 23.07.2015
 */
public class SubExpression extends DoubleExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double interpreter() {
        return left.interpreter() / right.interpreter();
    }

}
