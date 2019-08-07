package com.book;

/**
 * 对图书的管理
 * @author neusoft
 *
 */
public class BookManagement {

    //定义图书集合
    private Book[] books = new Book[20];

    //单例第一步
    private BookManagement(){
        //初始化一系列图书
        books[0] = new Book(1001, "水浒传", "施耐庵", 69, 4);
        books[1] = new Book(1002, "西游记", "吴承恩", 99, 1);
        books[2] = new Book(1003, "红楼梦", "曹雪芹", 199, 2);
        books[3] = new Book(1004, "三国演义", "罗贯中", 99, 2);
    }

    //单例第二步
    private static BookManagement instance;

    //单例第三步
    public static BookManagement getInstance() {
        if(null == instance) {
            instance = new BookManagement();
        }
        return instance;
    }

    //显示所有的图书信息
    public void printAllBooksInfo() {
        for(Book book : books){
            if(null != book) {
                System.out.println(book.showBookInfo());
            } else {
                continue;
            }
        }
    }


    //新增图书信息
    public boolean addBook(Book book) {
        boolean result = false;
        //遍历数组，计算符合添加条件的位置
        for(int i = 0; i < books.length; i++) {
            //找到第一个下标对应的元素是null，表示当前位置没有元素
            if(null == books[i]) {
                //将要添加的图书对象放到当前位置
                books[i] = book;
                //修改结果
                result = true;
                break;
            }
        }
        return result;
    }

    //删除编号是1003的图书delete from table where bno = 1003
    public boolean deleteBookByBNo(int bNo) {
        boolean result = false;
        boolean isExist = false;

        //遍历数组找到指定编号的图书对象
        for(int i = 0; i < books.length; i++) {
            if(null != books[i]) {
                if(bNo == books[i].getbNo()) {
                    //找到指定编号的图书对象
                    books[i] = null;	//将当前位置的元素设为null（模拟删除操作）
                    isExist = true;	//图书编号存在
                    result = true;	//删除成功
                    break;
                }
            }
        }

        if(!isExist) {
            System.out.println("没有找到编号是：" + bNo + "的图书");
        }
        return result;
    }

    //修改编号是1002的图书update book set bNo = ?,bName=?,author=?,price=?where bNo = ?
    public boolean updateBook(int bNo, Book book) {
        boolean result = false;
        //定义变量判断指定编号的图书是否存在
        boolean isExist = false;

        //遍历图书数组，找到该编号对应的图书对象
        for(int i = 0; i < books.length; i++) {
            if(null != books[i]) {
                if(bNo == books[i].getbNo()) {	//找到指定的图书对象
                    //将当前元素重新赋值
                    books[i] = book;
                    isExist = true;		//编号对应的图书不存在
                    result = true;		//修改成功
                    break;
                }
            }
        }

        if(!isExist) {
            System.out.println("编号是" + bNo + "的图书不存在");
        }
        return result;
    }
}
