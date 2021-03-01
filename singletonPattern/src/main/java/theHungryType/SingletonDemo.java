package theHungryType;

/**
 * @author songhaibo
 * @description 饿汉式
 * @date 2021-03-01 6:46 下午
 */
public class SingletonDemo {
    private static /*final*/ SingletonDemo s = new SingletonDemo();

    /**
     * 构造私有化
     */
    private SingletonDemo() {

    }

    public static /*synchronized*/ SingletonDemo getInstance() {
        return s;
    }
}
/*
· 饿汉式单例模式代码中，static变量会在类装载时初始化，此时也不会涉及多个线程对象访问该对象的问题。虚拟机保证只会装载一次该类，
  肯定不会发生访问的问题，因此，可以省略synchronized关键字。

· 问题：如果只是加载本类，而不是要调用getinstance()，甚至永远没有调用，则会造成资源浪费！
 */

