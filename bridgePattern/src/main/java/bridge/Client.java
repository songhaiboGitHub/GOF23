package bridge;

/**
 * @author songhaibo
 * @description 桥接模式client
 * @date 2021-03-12 下午7:40
 */
public class Client {

    public static void main(String[] args) {
        //销售联系的笔记本电脑
        Computer2 computer1 = new Laptop2(new Lenovo());
        computer1.sale();

        //销售神州台式机
        Computer2 computer2 = new Desktop2(new ShenZhou());
        computer2.sale();

        //销售戴尔笔记本
        Computer2 computer3 = new Laptop2(new Dell());
        computer3.sale();
    }
}
