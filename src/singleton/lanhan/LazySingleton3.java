package singleton.lanhan;

/**
 * 懒汉式单例3.0：双重检查锁定
 * @Author: hejiajun
 * @Date: 3017/11/8
 */
public class LazySingleton3 {
    private static LazySingleton3 instance = null;

    private LazySingleton3() {}

    public static LazySingleton3 getInstance() {
        // 第一重判断
        if (null == instance) {
            // 锁定代码块
            synchronized (LazySingleton3.class) {
                // 第二重判断
                if (null == instance)
                    instance = new LazySingleton3();
            }
        }

        return instance;
    }
}
