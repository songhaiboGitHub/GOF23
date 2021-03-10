package adapter;

/**
 * @author songhaibo
 * @description 适配器Client(家用插座)
 * @date 2021-03-10 5:39 下午
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        //继承方式实现 缺点Java单继承Target target = new Adapter();      client.test1(target);

        //对象方式实现 对象组合适配
        Usb usb = new Usb();
        Target target = new Adapter2(usb);
        client.test1(target);
    }

    public void test1(Target target) {
        target.handleRea();
    }
}
