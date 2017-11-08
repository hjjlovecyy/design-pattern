package prototype.clone;

/**
 * 具体原型类
 * 这种克隆是不能克隆引用类型的成员变量，属于浅克隆
 * 智能克隆 attr，不能克隆 attachment
 * 需要实现 Cloneable 接口
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public class Prototype implements Cloneable {
    private String attr;
    private Attachment attachment;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    // 有两种方法克隆，一种是通用实现方法，一种是使用 Object.clone() 方法。
    public Prototype clone() {
        // 通用实现方法
//        Prototype prototype = new Prototype();
//        prototype.setAttr(this.attr);
//        return prototype;

        // 使用 Object.clone() 方法
        Object object = null;
        try {
            object = super.clone();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (Prototype)object;
    }
}
