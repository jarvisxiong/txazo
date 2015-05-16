package org.txazo.reflection;

import org.junit.Assert;
import org.junit.Test;
import org.txazo.reflection.anno.FieldAnno;
import org.txazo.reflection.vo.FieldVo;
import org.txazo.test.AbstractTest;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * ReflectionField
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 15.05.2015
 */
public class ReflectionField extends AbstractTest {

    @Test
    public void test1() throws Exception {
        /** 获取全部的Field */
        Field[] fields = FieldVo.class.getDeclaredFields();
        for (Field field : fields) {
            print(field.getName());
        }
    }

    @Test
    public void test2() throws NoSuchFieldException, IllegalAccessException {
        /** 根据名称查找Field */
        Field field = FieldVo.class.getDeclaredField("id");
        Assert.assertNotNull(field);

        /** Field的类型 */
        Class<?> fieldType = field.getType();
        Assert.assertSame(int.class, fieldType);

        /** Field的注解 */
        FieldAnno fieldAnno = field.getAnnotation(FieldAnno.class);
        Assert.assertEquals("id", fieldAnno.desc());

        /** Field的修饰符 */
        int modifiers = field.getModifiers();
        Assert.assertTrue(Modifier.isPrivate(modifiers));

        /** Field的get/set */
        FieldVo fieldVo = new FieldVo(1, "txazo");
        field.setAccessible(true);
        Assert.assertEquals(1, field.get(fieldVo));
        field.set(fieldVo, 5);
        Assert.assertEquals(5, fieldVo.getId());
    }

    @Test
    public void test3() throws NoSuchFieldException, IllegalAccessException {
        /** 静态变量的Field */
        FieldVo.NUM = 1;
        Field field = FieldVo.class.getDeclaredField("NUM");
        Assert.assertEquals(1, field.get(null));
        field.set(null, 5);
        Assert.assertEquals(5, FieldVo.NUM);
    }

}
