package builder;

/**
 * @author songhaibo
 * @description Director（装配者）
 * @date 2021-03-08 7:29 下午
 */
public interface AirShipDirector {
    /**
     * 组装飞船对象
     *
     * @return AirShip
     */
    AirShip directAirShip();
}
