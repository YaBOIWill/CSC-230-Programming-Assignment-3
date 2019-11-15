//question 2 for programming assignment 3
public class Question2 {
  //main method with test case  
  public static void main(String[] args) {
        Author washington = new Author("Nicki Washington", "washingtonn@winthrop.edu", 'f');
        System.out.println(washington);
        Book toc = new Book("Stay Prepped: 10 Steps to Succeeding in College (And Having a Ball Doing It)!", washington, 14.95, 1908);
        System.out.println(toc);
    }
}
//Book class
class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    
    //Book constructor  
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    //getters and setters for the Book class
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQtyInStock() {
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    //String method to return the information about the book
    @Override
    public String toString() {
        return "Name: " + name + ", Author: " + author + ", Price: " + price + ", Quantity in Stock: " + qtyInStock;
    }
}
//Author class
class Author {
  private String name;
  private String email;
  private char gender;
  
  //Author constructor
  public Author(String name, String email, char gender) {
     this.name = name;
     this.email = email;
     this.gender = gender;
  } 
  //getters and setters for the variables
  public String getName() {
    return name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public char getGender() {
    return gender;
  }
  //method to return the name, email and gender of the test case
  @Override
  public String toString() {
  return "Name: " + name + ", Email: " + email + ", Gender: " + gender; 
  }
} 