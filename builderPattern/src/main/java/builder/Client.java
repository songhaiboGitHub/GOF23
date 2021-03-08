package builder;

/**
 * @author songhaibo
 * @description 建造者Client
 * @date 2021-03-08 7:40 下午
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirector director = new ShbAirShipDirector(new ShbAirShipBuilder());
        AirShip ship = director.directAirShip();
        ship.launch();
    }
}
