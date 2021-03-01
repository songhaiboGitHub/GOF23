package enumDemo;

/**
 * @author songhaibo
 * @description 枚举
 * @date 2021-03-01 7:03 下午
 */
public enum SingletonDemo {
    /**
     * 定义一个枚举的元素，他就代表了singleton的一个实例。
     */
    INSTANCE;

    /**
     * 单例可以有自己的操作
     */
    public void singletonOperation() {
        //功能处理
    }
/*
· 要点：
     - 实现简单
     - 枚举本身就是单例模式。由JVM从根本上提供保障！避免通过反射和反序列化的漏洞！
· 问题：
     - 无延迟加载。
 */
}
