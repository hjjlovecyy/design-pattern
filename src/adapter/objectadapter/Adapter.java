package adapter.objectadapter;

/**
 * 适配器类
 * @Author: hejiajun
 * @Date: 2017/11/14
 */
public class Adapter extends Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
