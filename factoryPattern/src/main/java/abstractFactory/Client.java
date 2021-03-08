package abstractFactory;

/**
 * @author songhaibo
 * @description 抽象工厂模式Client
 * @date 2021-03-04 7:29 下午
 */
public class Client {

    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.crateEngine();
        e.run();
        e.start();
    }
}
