package adapter.objectadapter;

/**
 * 适配者类
 * @Author: hejiajun
 * @Date: 2017/11/14
 */
public class Adaptee {
    public void specificRequest() {
        // 具体操作
        System.out.println("invoked!");
    }
}
