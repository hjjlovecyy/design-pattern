package singleton.best;

/**
 * IoDH(Initialization on Demand Holder)
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public class Singleton {
    private Singleton() {}

    private static class HolderClass {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return HolderClass.instance;
    }
}
