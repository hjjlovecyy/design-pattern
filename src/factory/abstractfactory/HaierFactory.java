package factory.abstractfactory;

/**
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public class HaierFactory implements AbstractFactory {
    @Override
    public TV createTV() {
        // 初始化
        return new HaierTV();
    }

    @Override
    public WashingMachine createWashingMachine() {
        // 初始化
        return new HaierWashingMachine();
    }
}
