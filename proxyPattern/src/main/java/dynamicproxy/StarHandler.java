package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author songhaibo
 * @description 代理角色
 * @date 2021-03-11 下午3:17
 */
public class StarHandler implements InvocationHandler {
    Star star;

    public StarHandler(Star star) {
        this.star = star;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        System.out.println("真正的方法执行前！");
        System.out.println("面谈，签合同，预付款，订机票");
        if ("sing".equals(method.getName())) {
            object = method.invoke(star, args);
        }
        System.out.println("真正的方法执行后！");
        System.out.println("收尾款");
        return object;
    }
}
