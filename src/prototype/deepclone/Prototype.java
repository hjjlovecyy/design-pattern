package prototype.deepclone;

import java.io.*;

/**
 * 具体原型类
 * 这种克隆是能克隆引用类型的成员变量，属于深克隆
 * 智能克隆 attr，也能克隆 attachment
 * 但引用类型都需要实现 Serializable 接口
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public class Prototype implements Serializable {
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

    public Prototype deepClone() throws Exception {
        // 将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bai);
        return (Prototype)ois.readObject();
    }
}
