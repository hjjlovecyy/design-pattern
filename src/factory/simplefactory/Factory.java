package factory.simplefactory;

/**
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public class Factory {
    // 静态工厂方法
    public static Product getProduct(String name) {
        Product product = null;
        if ("A".equals(name)) {
            product = new ConcreteProductA();
            // 初始化设置 product
        } else if ("B".equals(name)) {
            product = new ConcreteProductB();
            // 初始化设置 product
        }
        return product;
    }
}
