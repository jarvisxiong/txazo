package org.txazo.reflection.vo;

import org.txazo.reflection.anno.FieldAnno;

import java.io.Serializable;

/**
 * Reflect
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 24.05.2015
 */
public class Reflect implements Serializable {

    public static int NUM;

    @FieldAnno(desc = "id")
    private int id;
    private String name;

    public Reflect() {
    }

    public Reflect(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
