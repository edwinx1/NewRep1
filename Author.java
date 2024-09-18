public class Author 
//attributes
{
    private String name;
    private String email;
    private String nationality;
// main contructor
    public Author()
    {
        name = "George Orwell";
        email = "GO@example.com";
        nationality =  "British" ;
    }
    public Author(String name)
    {
        this.name = name;
    }
    public Author(String email, String nationality)
    {
        this.email = email;
        this.nationality = nationality;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getNationality()
    {
        return nationality;
    }
    public String toString ()
    {
        return ( name + " Email" +  email + "," + " Nationality:" + nationality);
    }

}

