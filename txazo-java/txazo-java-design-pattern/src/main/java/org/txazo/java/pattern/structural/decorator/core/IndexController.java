package org.txazo.java.pattern.structural.decorator.core;

/**
 * IndexController
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 22.07.2015
 */
public class IndexController implements Controller {

    @Override
    public void execute() {
        System.out.println("IndexController execute");
    }

}
