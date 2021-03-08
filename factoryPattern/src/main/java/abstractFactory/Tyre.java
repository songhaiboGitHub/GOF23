package abstractFactory;

/**
 * @author songhaibo
 * @description 抽象工厂模式(轮胎)
 * @date 2021-03-08 2:54 下午
 */
public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre {

    public void revolve() {
        System.out.println("旋转耐磨损！");
    }
}

class LowTyre implements Tyre {

    public void revolve() {
        System.out.println("旋转磨损快！");
    }
}
