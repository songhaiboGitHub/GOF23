package factoryMethod;


/**
 * @author songhaibo
 * @description 工厂方法模式
 * @date 2021-03-08 11:14 上午
 */
public class BenzFactory implements CarFactory {
    public Car createCar() {
        return new Benz();
    }
}
