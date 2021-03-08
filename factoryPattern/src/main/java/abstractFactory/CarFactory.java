package abstractFactory;

/**
 * @author songhaibo
 * @description 抽象工厂模式
 * @date 2021-03-08 2:56 下午
 */
public interface CarFactory {
    Engine crateEngine();

    Seat crateSeat();

    Tyre crateTyre();
}
