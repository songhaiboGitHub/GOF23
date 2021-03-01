package doubleCheckedLocking;

/**
 * @author songhaibo
 * @description 双重检测锁模式
 * @date 2021-03-01 7:03 下午
 */
public class SingletonDemo {
    private volatile static SingletonDemo instance = null;

    //构造私有化
    private SingletonDemo() {

    }

    public static SingletonDemo getInstance() {
        if (null == instance) {
            synchronized (SingletonDemo.class) {
                if (null == instance) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }
/*
· 双重检测锁实现
· 这个模式将同步内容到下方if内部，提高了执行的效率不必每次获取对象时都进行同步，只有第一次才同步创建了以后就没必要了。

· 问题：由于编译器优化原因和JVM底层内部模型原因，偶尔会出现问题。不建议使用。  解决：增加volatile关键字 使加载时jvm可见。
*/
}
