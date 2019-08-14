//package com.book;
//
//public class TestBookManagement {
//
//
//        public static void main(String[] args) {
//            //获取图书管理系统的实例
//            BookManagement bm = BookManagement.getInstance();
//            //查询所有的图书信息
//            bm.printAllBooksInfo();
//
//
//            //测试添加方法
//            //定义要添加的Book对象
//            Book book = new Book(1005, "红楼梦", "曹雪芹", 105, 1);
//            //调用添加的方法
//            boolean isAddSuccess = bm.addBook(book);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book2 = new Book(1006, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//             bm.addBook(book2);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book3 = new Book(1007, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book3);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book4 = new Book(1008, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book4);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book5 = new Book(1009, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book5);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book6 = new Book(1010, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book6);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book7 = new Book(1011, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book7);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book8 = new Book(1012, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book8);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book9 = new Book(1013, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book9);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book10 = new Book(1014, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book10);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book11 = new Book(1015, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book11);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book12 = new Book(1016, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book12);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book13= new Book(1017, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book13);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book14 = new Book(1018, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book14);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book15 = new Book(1019, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book15);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book16 = new Book(1020, "石天记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book16);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//
//            Book book17 = new Book(1021, "择天记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book17);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//            Book book18 = new Book(1022, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book18);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//            Book book19 = new Book(1023, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book19);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//            Book book20 = new Book(1024, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book20);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//            Book book21 = new Book(1025, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book21);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//            Book book22 = new Book(1026, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book22);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//            Book book23 = new Book(1027, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book23);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//            Book book24 = new Book(1028, "石头记", "曹雪芹1", 1051, 2);
//            //调用添加的方法
//            bm.addBook(book24);
//            System.out.println(isAddSuccess ? "添加成功" : "添加失败");
//
//
//            System.out.println("--------------------添加完成后的图书信息----------------------");
//            //再次查询所有的图书信息
//            bm.printAllBooksInfo();
//
//            System.out.println("--------执行删除操作-----------");
//            //测试删除操作
//            int bNo = 1007;
//            //调用方法，并定义变量获取方法的返回结果
//            boolean isDeleteSuccess = bm.deleteBookByBNo(bNo);
//            System.out.println(isDeleteSuccess ? "删除成功" : "删除失败");
//
//            System.out.println("--------删除操作后图书信息如下：-----------");
//            //显示删除后的图书信息
//            bm.printAllBooksInfo();
//
//            System.out.println("------------执行修改操作-----------");
//            //定义要修改的图书信息
//            Book newBook = new Book(1003, "水浒传", "施耐庵", 78, 1);
//            //调用方法修改图书信息
//            boolean isUpdateSuccess = bm.updateBook(1008, newBook);
//            System.out.println(isUpdateSuccess ? "修改成功" : "修改失败");
//
//            System.out.println("--------修改操作后图书信息如下：-----------");
//            //显示修改后的图书信息
//            bm.printAllBooksInfo();
//
//        }
//
//    }
//
//
