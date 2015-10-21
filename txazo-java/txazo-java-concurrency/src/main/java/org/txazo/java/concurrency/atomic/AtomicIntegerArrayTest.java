package org.txazo.java.concurrency.atomic;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * 原子操作类－AtomicIntegerArray
 * <p/>
 * 1) final int base
 * 2) final int shift
 * 3) final int[] array
 *
 * @author xiaozhou.tu
 * @date 2015-10-20
 * @see AtomicIntegerArray
 * @see AtomicIntegerArray#base
 * @see AtomicIntegerArray#shift
 * @see AtomicIntegerArray#array
 */
public class AtomicIntegerArrayTest {

    @Test
    public void test() {
        int[] value = new int[1];
        AtomicIntegerArray array = new AtomicIntegerArray(value);
        array.set(0, 1);
        Assert.assertEquals(1, array.get(0));
        Assert.assertTrue(array.compareAndSet(0, 1, 10));
        Assert.assertEquals(10, array.get(0));
        /** value不变 */
        Assert.assertEquals(0, value[0]);
    }

//    public class AtomicIntegerArray {
//
//        private final int[] array;
//
//        public AtomicIntegerArray(int length) {
//            array = new int[length];
//        }
//
//        public AtomicIntegerArray(int[] array) {
//            this.array = array.clone();
//        }
//
//    }

}
