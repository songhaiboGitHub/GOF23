package abstractFactory;

/**
 * @author songhaibo
 * @description 抽象工厂模式(低端汽车)
 * @date 2021-03-08 2:58 下午
 */
public class LowCarFactory implements CarFactory {

    public Engine crateEngine() {
        return new LowEngine();
    }

    public Seat crateSeat() {
        return new LowSeat();
    }

    public Tyre crateTyre() {
        return new LowTyre();
    }
}
