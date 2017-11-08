package prototype.deepclone;

import java.io.Serializable;

/**
 * @Author: hejiajun
 * @Date: 2017/11/8
 */
public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
