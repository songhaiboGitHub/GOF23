package factoryMethod;


/**
 * @author songhaibo
 * @description 工厂方法模式(符合开闭原则 对修改关闭 对扩展开放)
 * 缺点：新增的类太多了
 * @date 2021-03-08 11:16 上午
 */
public class Client {

    public static void main(String[] args) {
        Car c1=new AudiFactory().createCar();
        Car c2=new BydFactory().createCar();
        Car c3=new BenzFactory().createCar();
        c1.run();
        c2.run();
        c3.run();
    }
}
