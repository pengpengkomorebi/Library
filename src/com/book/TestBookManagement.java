package com.book;

public class TestBookManagement {


        public static void main(String[] args) {
            //获取图书管理系统的实例
            BookManagement bm = BookManagement.getInstance();
            //查询所有的图书信息
            bm.printAllBooksInfo();


            //测试添加方法
            //定义要添加的Book对象
            Book book = new Book(1005, "红楼梦", "曹雪芹", 105, 1);
            //调用添加的方法
            boolean isAddSuccess = bm.addBook(book);

            System.out.println(isAddSuccess ? "添加成功" : "添加失败");

            System.out.println("--------------------添加完成后的图书信息----------------------");
            //再次查询所有的图书信息
            bm.printAllBooksInfo();

            System.out.println("--------执行删除操作-----------");
            //测试删除操作
            int bNo = 1007;
            //调用方法，并定义变量获取方法的返回结果
            boolean isDeleteSuccess = bm.deleteBookByBNo(bNo);
            System.out.println(isDeleteSuccess ? "删除成功" : "删除失败");

            System.out.println("--------删除操作后图书信息如下：-----------");
            //显示删除后的图书信息
            bm.printAllBooksInfo();

            System.out.println("------------执行修改操作-----------");
            //定义要修改的图书信息
            Book newBook = new Book(1008, "水浒传", "施耐庵", 78, 1);
            //调用方法修改图书信息
            boolean isUpdateSuccess = bm.updateBook(1008, newBook);
            System.out.println(isUpdateSuccess ? "修改成功" : "修改失败");

            System.out.println("--------修改操作后图书信息如下：-----------");
            //显示修改后的图书信息
            bm.printAllBooksInfo();

        }

    }


