package adapter;

/**
 * @author songhaibo
 * @description 适配器本身（充电器大头）
 * 适配器（对象适配器方式 ，使用了组合的方式跟被适配对象整合）
 * @date 2021-03-10 5:42 下午
 */
public class Adapter2 implements Target {
    private Usb usb;

    public void handleRea() {
        usb.request();
    }

    public Adapter2(Usb adpatee) {
        this.usb = adpatee;
    }
}
