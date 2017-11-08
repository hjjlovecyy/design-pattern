package factory.factorymethod;

/**
 * 抽象产品角色
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public abstract class Product {
    // 所有产品类的公共业务方法
    public void sameMethod() {
        // 公共方法的实现
    }

    // 声明抽象业务方法
    public abstract void diffMethod();
}
