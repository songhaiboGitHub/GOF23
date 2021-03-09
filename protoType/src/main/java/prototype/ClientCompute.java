package prototype;

/**
 * @author songhaibo
 * @description 测试普通new方式创建对象和clone方式创建对象的效率差异！
 * 如果需要短时间创建大量对象，并且new的过程比较耗时。则可以考虑使用原型模式！
 * @date 2021-03-09 4:03 下午
 */
public class ClientCompute {
    public static void testNew(int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop t = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("new的方式创建耗时：" + (end - start));
    }

    public static void testClone(int size) throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Laptop t = new Laptop();
        for (int i = 0; i < size; i++) {
            Laptop temp = (Laptop) t.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("Clone的方式创建耗时：" + (end - start));
    }

    public static void main(String[] args) throws Exception {
        testNew(1000);
        testClone(1000);
    }
}

class Laptop implements Cloneable {

    public Laptop() {
        try {
            //模拟创建对象耗时的过程！
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}