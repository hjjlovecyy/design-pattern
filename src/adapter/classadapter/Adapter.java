package adapter.classadapter;

/**
 * @Author: hejiajun
 * @Date: 2017/11/14
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
