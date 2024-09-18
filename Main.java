public class Main 
//* this is the main mehtod
{
    public static void main (String [] args)
    {
        Author author = new Author();
        Book book = new Book("Animal Farm", "$13", author );

        System.out.println(book.toString());
    }
}
