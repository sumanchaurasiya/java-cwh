package com.company;
class Library{
    String [] book;
    int countBook;
    Library (){
        this.book = new String[100];
        this.countBook = 0;
    }
    public void addBook(String book){
        this.book[countBook] = book;
        countBook++;
        System.out.println(book + " has been added");
    }

    public void issueBook(String book){
        for(int i =0;i<this.book.length;i++){
            if(this.book[i].equals(book)){
                System.out.println(book + " has been issued");
                this.book[i] = null;
                return ;
            }
        }
        System.out.println(book + " does not exist");
    }

    public void returnBook(String book){
        addBook(book);
    }

    public void showAvailableBook(){
        System.out.println("Available books are");
        for(String book: this.book){
            if(book == null){
                continue;
            }
            System.out.println("--> " + book);
        }
    }
}
public class OnlineLibrary {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library l = new Library();
        l.addBook("Let Us C");
        l.addBook("Data Structure");
        l.addBook("Computer Architecture");
        l.addBook("Design and Analysis of Algorithm");
        l.addBook("Analog and Digital Electronics");
        System.out.println(" ");
        l.showAvailableBook();
        System.out.println(" ");
        l.issueBook("Data Structure");

        l.showAvailableBook();

        System.out.println(" ");
        l.returnBook("Data Structure");
        l.showAvailableBook();

    }

}
