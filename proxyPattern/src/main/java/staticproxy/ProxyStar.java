package staticproxy;

/**
 * @author songhaibo
 * @description 代理类
 * @date 2021-03-11 下午2:56
 */
public class ProxyStar implements Star {
    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    public void confer() {
        System.out.println("RealStar.confer()");
    }

    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    public void sing() {
        star.sing();
    }

    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}
