package prototype;

import java.util.Date;

/**
 * @author songhaibo
 * @description 英国的克隆羊多利深复制
 * @date 2021-03-09 3:59 下午
 */
public class SheepDeep implements Cloneable {
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //直接调用Object的Clone方法
        Object obj = super.clone();
        //添加如下代码实现深复制
        SheepDeep sheep = (SheepDeep) obj;
        sheep.birthday = (Date) this.birthday.clone();

        return obj;
    }

    public SheepDeep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
