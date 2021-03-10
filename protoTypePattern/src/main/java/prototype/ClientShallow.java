package prototype;

import java.util.Date;

/**
 * @author songhaibo
 * @description 测试原型模式
 * 浅克隆：不带属性值
 * @date 2021-03-09 4:03 下午
 */
public class ClientShallow {
    public static void main(String[] args) throws Exception {
        SheepShallow sheep = new SheepShallow("多利", new Date(123123213123L));
        System.out.println("sheep = " + sheep);
        System.out.println(sheep.getSname());
        System.out.println(sheep.getBirthday());
        SheepShallow sheep1 = (SheepShallow) sheep.clone();
        //重新赋值 浅克隆 sheep1.setSname("小丽");
        System.out.println("sheep1 = " + sheep1);
        System.out.println(sheep1.getSname());
        System.out.println(sheep1.getBirthday());
    }
}
