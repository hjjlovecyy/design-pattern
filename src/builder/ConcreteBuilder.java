package builder;

/**
 * @Author: hejiajun
 * @Date: 2017/11/14
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        //build partA
        System.out.println("build partA");
    }

    @Override
    public void buildPartB() {
        //build partB
        System.out.println("build partB");
    }

    @Override
    public void buildPartC() {
        //build partC
        System.out.println("build partC");
    }
}
