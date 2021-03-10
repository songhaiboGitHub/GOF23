package adapter;

/**
 * @author songhaibo
 * @description 适配器本身（充电器大头）
 * 适配器（类适配器方式 继承）
 * @date 2021-03-10 5:42 下午
 */
public class Adapter extends Usb implements Target {

    public void handleRea() {
        super.request();
    }
}
