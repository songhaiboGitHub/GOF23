package prototype;

import java.util.Date;

/**
 * @author songhaibo
 * @description 测试原型模式
 * 深克隆：细分到属性值
 * @date 2021-03-09 4:03 下午
 */
public class ClientDeep {
    public static void main(String[] args) throws Exception {
        Date date = new Date(123123213123L);
        SheepDeep sheep = new SheepDeep("多利", date);
        SheepDeep sheep1 = (SheepDeep) sheep.clone();//实现深复制 sheep1的birthday是一个新对象！

        System.out.println("sheep = " + sheep);
        System.out.println(sheep.getSname());
        System.out.println(sheep.getBirthday());
        date.setTime(12312312L);
        System.out.println(sheep.getBirthday());

        System.out.println("sheep1 = " + sheep1);
        System.out.println(sheep1.getSname());
        System.out.println(sheep1.getBirthday());
    }
}
