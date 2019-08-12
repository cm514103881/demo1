package cn.itcast.domain;

import java.util.Date;

/**
 * @program: exam_project
 * @description: 书籍bean类
 * @author: Ruoquan
 * @create: 2019-07-24 16:39
 **/
public class Book {

    private int id;

    private String name;

    private String author;

    private double price;

    private Date publish_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }
}
