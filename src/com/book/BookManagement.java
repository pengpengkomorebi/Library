package com.book;

import java.util.ArrayList;
import java.util.List;

/**
 * 对图书的管理
 * @author neusoft
 *
 */
public class BookManagement {


    public static void main(String[] args) {
        // Java动态数组的初始化
        List<Book> books =new ArrayList<Book>();
        System.out.println(books.size());

        books.add(0,1001, "水浒传", "施耐庵", 69, 4);
        books.add(1,1002, "西游记", "吴承恩", 99, 1);



    }






}
