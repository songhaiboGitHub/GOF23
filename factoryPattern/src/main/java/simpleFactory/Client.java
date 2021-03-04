package simpleFactory;

/**
 * @author songhaibo
 * @description 简单工厂Client
 * @date 2021-03-04 7:29 下午
 */
public class Client {

    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("比亚迪");
        c1.run();
        c2.run();
    }
}
