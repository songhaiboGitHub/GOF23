package theHungryType;

/**
 * @author songhaibo
 * @description 饿汉式client
 * @date 2021-03-01 6:47 下午
 */
public class Client {
    public static void main(String[] args) {
        SingletonDemo s = SingletonDemo.getInstance();
        SingletonDemo s2 = SingletonDemo.getInstance();
        System.out.println(s == s2);
    }
}
