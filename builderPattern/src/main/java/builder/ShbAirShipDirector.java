package builder;

/**
 * @author songhaibo
 * @description 装配者实现类
 * @date 2021-03-08 7:36 下午
 */
public class ShbAirShipDirector implements AirShipDirector {
    private AirShipBuilder builder;

    public AirShip directAirShip() {
        //开始构建（建造）
        Engine engine = builder.builderEngine();
        EscapeTower escapeTower = builder.builderEscapeTower();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();

        //装配开始组装
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        ship.setOrbitalModule(orbitalModule);
        return ship;
    }

    public ShbAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }
}
