package singleton.lanhan;

/**
 * 懒汉式单例1.0：同步方法
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public class LazySingleton1 {
    private static LazySingleton1 instance = null;

    private LazySingleton1() {}

    synchronized public static LazySingleton1 getInstance() {
        if (null == instance) {
            instance = new LazySingleton1();
        }

        return instance;
    }
}
