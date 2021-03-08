package builder;

/**
 * @author songhaibo
 * @description 构建者实现类
 *
 * 常见的建造者有Stringbuilder
 * @date 2021-03-08 7:32 下午
 */
public class ShbAirShipBuilder implements AirShipBuilder {

    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("构建轨道舱");
    }

    public Engine builderEngine() {
        System.out.println("构建发动机");
        return new Engine("构建发动机");
    }

    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("构建逃逸塔");
    }
}
