package org.txazo.java.concurrency.lock;

import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 锁 - ReentrantLock
 * <p/>
 * 1) lock(): 获取锁
 * 2) unlock(): 释放锁
 * 3) tryLock(): 尝试非阻塞的获取锁, 立刻返回, 获取到锁返回true, 否则返回false
 * 4) tryLock(long, TimeUnit): 超时获取锁, 可响应中断
 * 5) lockInterruptibly(): 获取锁, 可响应中断
 * 6) newCondition(): 返回Condition
 *
 * 锁分类
 * 1) 公平锁: ReentrantLock.FairSync
 * 2) 非公平锁: ReentrantLock.NonfairSync
 *
 * @author xiaozhou.tu
 * @date 2015-10-10
 * @see java.util.concurrent.locks.ReentrantLock
 * @see java.util.concurrent.locks.ReentrantLock#lock()
 * @see java.util.concurrent.locks.ReentrantLock#unlock()
 * @see java.util.concurrent.locks.ReentrantLock#tryLock()
 * @see java.util.concurrent.locks.ReentrantLock#tryLock(long, TimeUnit)
 * @see java.util.concurrent.locks.ReentrantLock#lockInterruptibly()
 * @see java.util.concurrent.locks.ReentrantLock#newCondition()
 */
public class ReentrantLockTest {

    @Test
    public void test() {
        Lock lock = new ReentrantLock();

        /** lock()不要写在try中 */
        lock.lock();
        try {
        } finally {
            lock.unlock();
        }

        try {
            lock.lockInterruptibly();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        boolean acquired = lock.tryLock();
        if (acquired) {
            try {
            } finally {
                lock.unlock();
            }
        }
    }

}
