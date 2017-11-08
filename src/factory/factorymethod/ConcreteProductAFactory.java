package factory.factorymethod;

/**
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public class ConcreteProductAFactory implements Factory {
    @Override
    public Product factoryMethod() {
        // 初始化工作
        return new ConcreteProductA();
    }
}
