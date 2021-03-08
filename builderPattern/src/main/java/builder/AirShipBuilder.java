package builder;

/**
 * @author songhaibo
 * @description
 * @date 2021-03-08 7:28 下午
 */
public interface AirShipBuilder {
    OrbitalModule builderOrbitalModule();

    Engine builderEngine();

    EscapeTower builderEscapeTower();
}
