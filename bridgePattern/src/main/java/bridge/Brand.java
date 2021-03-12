package bridge;

/**
 * @author songhaibo
 * @description 品牌 桥接模式
 * @date 2021-03-12 下午7:31
 */
public interface Brand {
    void sale();
}

class Lenovo implements Brand {

    public void sale() {
        System.out.println("销售联想电脑");
    }
}

class Dell implements Brand {

    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}

class ShenZhou implements Brand {

    public void sale() {
        System.out.println("销售神州电脑");
    }
}