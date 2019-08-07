package com.book;

/**
 * 图书管理系统
 * 初始化一系列图书
 * 并且查询所有的图书
 * @author neusoft
 *
 */
public class Book {

    //定义Book对象的属性
    private int bNo;	//图书编号

    private String bName;	//图书名称

    private String author;	//图书作者

    private double price;	//图书价格

    private int type;		//图书分类1：小说；2：计算机；3：政治;4:社科人文

    //提供构造方法
    public Book() {
        super();
    }

    public Book(int bNo, String bName, String author, double price, int type) {
        super();
        this.bNo = bNo;
        this.bName = bName;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    //提供set/get方法
    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    //显示图书的信息方法
    public String showBookInfo() {
        return "图书编号是：" + bNo + ", 书名：" + bName + ", 作者："
                + author + ", 价格：" + price + ", 分类：" + type;
    }
}
