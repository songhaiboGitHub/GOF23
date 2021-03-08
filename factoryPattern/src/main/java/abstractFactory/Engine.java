package abstractFactory;

/**
 * @author songhaibo
 * @description 抽象工厂模式(发动机)
 * @date 2021-03-08 2:49 下午
 */
public interface Engine {
    void run();

    void start();
}

class LuxuryEngine implements Engine {

    public void run() {
        System.out.println("转的快！");
    }

    public void start() {
        System.out.println("启动快！可以自动启停！");

    }
}

class LowEngine implements Engine {

    public void run() {
        System.out.println("转的慢！");
    }

    public void start() {
        System.out.println("启动慢！");

    }
}

