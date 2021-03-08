package abstractFactory;

/**
 * @author songhaibo
 * @description 抽象工厂模式(座椅)
 * @date 2021-03-08 2:52 下午
 */
public interface Seat {
    void massage();
}

class LuxurySeat implements Seat {

    public void massage() {
        System.out.println("可以以自动按摩！");
    }
}

class LowSeat implements Seat {

    public void massage() {
        System.out.println("不能按摩！");
    }
}
