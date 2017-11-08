package singleton.ehan;

/**
 * 饿汉式单例
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
