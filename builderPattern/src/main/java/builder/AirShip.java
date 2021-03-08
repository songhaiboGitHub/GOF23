package builder;

/**
 * @author songhaibo
 * @description 宇宙飞船
 * @date 2021-03-08 7:20 下午
 */
public class AirShip {
    //轨道舱
    private OrbitalModule orbitalModule;
    //发动机
    private Engine engine;
    //逃逸塔
    private EscapeTower escapeTower;

    public void launch() {
        System.out.println("开始飞行~");
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}

class OrbitalModule {
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class EscapeTower {
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
