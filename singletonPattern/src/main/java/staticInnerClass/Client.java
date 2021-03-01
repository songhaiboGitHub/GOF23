package staticInnerClass;

/**
 * @author songhaibo
 * @description 静态内部类client
 * @date 2021-03-01 7:06 下午
 */
public class Client {
    public static void main(String[] args) {
        SingletonDemo s = SingletonDemo.getInstance();
        SingletonDemo s1 = SingletonDemo.getInstance();
        System.out.println(s == s1);
    }

}
