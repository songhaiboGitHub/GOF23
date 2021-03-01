package lanHanShi;

/**
 * @author songhaibo
 * @description 懒汉式
 * @date 2021-03-01 7:03 下午
 */
public class SingletonDemo {
    private static SingletonDemo instance;

    //构造私有化
    private SingletonDemo() {

    }

    public static synchronized SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }
/*
· 要点：
     - Lazy load!   延迟加载，懒加载！真正用到的时候才加载！
· 问题：
     - 资源利用率高了。但是，每次调用getInstance()方法都要同步，并发效率低。
 */
}
