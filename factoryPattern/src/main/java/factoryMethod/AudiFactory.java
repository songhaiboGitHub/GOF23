package factoryMethod;


/**
 * @author songhaibo
 * @description 工厂方法模式
 * @date 2021-03-08 11:12 上午
 */
public class AudiFactory implements CarFactory{
    public Car createCar() {
        return new Audi();
    }
}
