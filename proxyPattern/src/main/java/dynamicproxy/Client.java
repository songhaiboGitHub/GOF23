package dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author songhaibo
 * @description 动态代理client
 * @date 2021-03-11 下午3:20
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler starHandler = new StarHandler(realStar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
        proxy.sing();
    }
}
