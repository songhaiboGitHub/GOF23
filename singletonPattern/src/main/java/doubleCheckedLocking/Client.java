package doubleCheckedLocking;

/**
 * @author songhaibo
 * @description 双重检测锁模式client
 * @date 2021-03-01 7:06 下午
 */
public class Client {
    public static void main(String[] args) {
        SingletonDemo s = SingletonDemo.getInstance();
        SingletonDemo s1 = SingletonDemo.getInstance();
        System.out.println(s == s1);
    }
}
