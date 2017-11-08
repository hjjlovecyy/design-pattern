package prototype.deepclone;

/**
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Attachment attachment = new Attachment();
        attachment.setName("attachment!");

        Prototype prototype = new Prototype();
        prototype.setAttachment(attachment);
        prototype.setAttr("attr!");

        Prototype clone = prototype.deepClone();

        System.out.println(prototype == clone);
        System.out.println(prototype.getAttachment() == clone.getAttachment());
        System.out.println(clone.getAttr());
    }
}
