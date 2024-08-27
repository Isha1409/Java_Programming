import java.io.*;
class Book {
    
    String book_name;
    int year;
    String Publishers;

    Book(String book_name, int year , String Publishers)
    {
        this.book_name = book_name;
        this.year = year;
        this.Publishers= Publishers;
    }
}
class Book_Display {
    public static void main(String[] args)
    {                             
         Book bk = new Book("Publish news letter", 2011 , "Amit Garg" );
   
        System.out.println("Book_Name :" + bk.book_name + " and Year of publication :" + bk.year + "  Author :" + bk.Pblishers);
    }
}
     