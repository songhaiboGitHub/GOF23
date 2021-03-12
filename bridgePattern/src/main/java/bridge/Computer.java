package bridge;

/**
 * @author songhaibo
 * @description 电脑
 * @date 2021-03-12 下午7:17
 */
public interface Computer {
    void sale();
}

class Desktop implements Computer {

    public void sale() {
        System.out.println("销售台式机！");
    }
}

class Laptop implements Computer {

    public void sale() {
        System.out.println("销售笔记本！");
    }
}

class Pad implements Computer {

    public void sale() {
        System.out.println("销售平板电脑！");
    }
}

class LenovoDesktop extends Desktop {
    @Override
    public void sale() {
        System.out.println("销售联想台式机！");
    }
}

class LenovoLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("销售联想笔记本！");
    }
}

class LenovoPad extends Pad {
    @Override
    public void sale() {
        System.out.println("销售联想Pad！");
    }
}

class ShenzhouDesktop extends Desktop {
    @Override
    public void sale() {
        System.out.println("销售神州台式机！");
    }
}

class ShenzhouLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("销售神州笔记本！");
    }
}

class ShenzhouPad extends Pad {
    @Override
    public void sale() {
        System.out.println("销售神州Pad！");
    }
}

class DellDesktop extends Desktop {
    @Override
    public void sale() {
        System.out.println("销售戴尔台式机！");
    }
}

class DellLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("销售戴尔笔记本！");
    }
}

class DellPad extends Pad {
    @Override
    public void sale() {
        System.out.println("销售戴尔Pad！");
    }
}
