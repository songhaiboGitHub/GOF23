package simpleFactory;

/**
 * @author songhaibo
 * @description 简单工厂工厂类
 * @date 2021-03-04 7:32 下午
 */
public class CarFactory {
    public static Car createCar(String type) {
        if ("奥迪".equals(type)) {
            return new Audi();
        } else if ("比亚迪".equals(type)) {
            return new Byd();
        } else {
            return null;
        }
    }
}
