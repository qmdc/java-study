package 设计模式.原型模式;

import java.util.Date;

public class Video implements Cloneable{
    private String id;
    private Date createDate;

    public Video() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
//        Video obj1 = (Video) obj;
//        obj1.createDate = (Date) this.createDate.clone();
        return obj;
    }

    public Video(String id, Date createDate) {
        this.id = id;
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
