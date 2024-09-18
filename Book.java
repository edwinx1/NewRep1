public class Book
// attributes 
{
    private String title;
    private String price;
    private Author author; 
// main conscructor
    public Book()
    {
        title = "Animal Farm";
        price = "$13";
    }
    public Book(String title,  String price, Author author)
    
    {
        this.title = title;
        this.price = price;
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getPrice(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }
    public String toString(){
        return ("Book:" + title + "," + "Price:" + price + "," +  "Author:" + author + ",");
    }
}