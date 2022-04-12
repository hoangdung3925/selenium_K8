/*Create a simple menu
        1. Input book
        2. Find book by ISBN
        0. Exit!
        Book object
        String ISBN
        String title
        String authorName
        String/int year
        Please override toString method to print out the found book.
        If there is no matched book, please print out book not found
*/
package Lesson07;

public class Book {
    private String ISBN;
    private String title;
    private String authorName;
    private int year;

    public Book(){
    };

    public String getISBN(){
        return this.ISBN;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthorName(){
        return this.authorName;
    }

    public int getYear(){
        return this.year;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString(){
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", tittle='" + title + '\'' +
                ", authorName'" + authorName + '\'' +
                ", year'" + year +
                '}';
    }
}
