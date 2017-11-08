package factory.abstractfactory;

/**
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public class MideaFactory implements AbstractFactory {
    @Override
    public TV createTV() {
        // 初始化
        return new MideaTV();
    }

    @Override
    public WashingMachine createWashingMachine() {
        // 初始化
        return new MideaWashingMachine();
    }
}
