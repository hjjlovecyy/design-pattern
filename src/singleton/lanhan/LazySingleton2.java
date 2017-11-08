package singleton.lanhan;

/**
 * 懒汉式单例2.0：同步代码块
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public class LazySingleton2 {
    private static LazySingleton2 instance = null;

    private LazySingleton2() {}

    public static LazySingleton2 getInstance() {
        if (null == instance) {
            synchronized (LazySingleton2.class) {
                instance = new LazySingleton2();
            }
        }

        return instance;
    }
}
