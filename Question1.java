//question 1 for programming assignment 3 
public class Question1 {
  //main method with test cases
  public static void main(String[] args) {
    Author washington = new Author("Nicki Washington", "washingtonn@winthrop.edu", 'f');
    System.out.println(washington);
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