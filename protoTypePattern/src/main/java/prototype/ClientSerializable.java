package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author songhaibo
 * @description 测试原型模式
 * @date 2021-03-09 4:03 下午
 * 深克隆：（序列化和反序列化来实现）
 */
public class ClientSerializable {
    public static void main(String[] args) throws Exception {
        Date date = new Date(123123213123L);
        SheepShallow sheep = new SheepShallow("多利", date);

        System.out.println("sheep = " + sheep);
        System.out.println(sheep.getSname());
        System.out.println(sheep.getBirthday());
        //SheepDeep sheep1 = (SheepDeep) sheep.clone();//实现深复制 sheep1的birthday是一个新对象！
        //使用序列化和反序列化实现复制
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(sheep);
        byte[] bytes = byteArrayOutputStream.toByteArray();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        //克隆好的对象！
        SheepShallow sheep1 = (SheepShallow) objectInputStream.readObject();
        System.out.println("修改原型对象的属性值");
        date.setTime(12312312L);
        System.out.println(sheep.getBirthday());

        System.out.println("sheep1 = " + sheep1);
        System.out.println(sheep1.getSname());
        System.out.println(sheep1.getBirthday());
    }
}
