package data;

public class Book {
    private String title;
    private String yearOfPublication;
    private long ISBN;
    private String author;
    private double price;
    public void setTitle(String title){
        this.title = title;
    }
    public void setYearOfPublication(String yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
    public void setISBN(long ISBN){
        this.ISBN = ISBN;
    }
    public void setAuthor(String author){
            this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
