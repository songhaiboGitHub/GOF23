package staticproxy;

/**
 * @author songhaibo
 * @description 静态代理模式client
 * @date 2021-03-11 下午2:58
 */
public class Client {
    public static void main(String[] args) {
        RealStar realStar = new RealStar();
        ProxyStar proxyStar = new ProxyStar(realStar);
        proxyStar.confer();
        proxyStar.signContract();
        proxyStar.bookTicket();
        proxyStar.signContract();
        proxyStar.sing();
    }
}
