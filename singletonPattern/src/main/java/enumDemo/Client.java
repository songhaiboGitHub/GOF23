package enumDemo;

/**
 * @author songhaibo
 * @description 枚举client
 * @date 2021-03-01 7:06 下午
 */
public class Client {
    public static void main(String[] args) {
        SingletonDemo s = SingletonDemo.INSTANCE;
        SingletonDemo s1 = SingletonDemo.INSTANCE;
        System.out.println(s == s1);
    }

}
