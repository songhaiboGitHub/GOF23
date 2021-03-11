package dynamicproxy;

/**
 * @author songhaibo
 * @description 真实角色
 * @date 2021-03-11 下午2:52
 */
public class RealStar implements Star {
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
        System.out.println("RealStar(周杰伦本人).sing()");
    }

    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}
