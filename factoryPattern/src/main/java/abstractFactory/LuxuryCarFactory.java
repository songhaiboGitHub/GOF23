package abstractFactory;

/**
 * @author songhaibo
 * @description 抽象工厂模式(高端汽车)
 * @date 2021-03-08 2:58 下午
 */
public class LuxuryCarFactory implements CarFactory {

    public Engine crateEngine() {
        return new LuxuryEngine();
    }

    public Seat crateSeat() {
        return new LuxurySeat();
    }

    public Tyre crateTyre() {
        return new LuxuryTyre();
    }
}
