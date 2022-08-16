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
    public String getTitle(){
        return title;
    }
    public String getYearOfPublication(){
        return yearOfPublication;
    }
    public long getISBN(){
        return ISBN;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
}
