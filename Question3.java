//question 3 for programming assignment 3  
public class Question3 {
    //the main method with the test cases
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS951529", 3.5);
        System.out.println(lynne);
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000.0);
        System.out.println(mrJava);
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}

//Person class  
class Person {
    protected String myName; //person's name
    protected int myAge; //person's name
    protected String myGender; //person's gender, male or female
    
    //Person constructor
    public Person(String name, int age, String gender) {
        myName = name; 
        myAge = age; 
        myGender = gender;
    }
    //getters and setters for name, age, and gender for Person class
    public String getMyName() {
        return myName;
    }
    public int getMyAge() {
        return myAge;
    }
    public String getMyGender() {
        return myGender;
    }
    public void setMyName(String myName) {
        this.myName = myName;
    }
    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }
    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }
    //overrides the string method to print the information about the person
    @Override 
    public String toString() {
        return "Name: " + myName + ", Age: " + myAge + ", Gender: " + myGender;
    }
}
//Student class that extends Person
class Student extends Person {
    protected String myIdNum; //student's ID number
    protected double myGPA; //student's GPA
    //utilizes super class constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum; //students ID number
        myGPA = gpa; //students GPA
    }
    //getters and setters for id number and gpa for the Student class
    public String getMyIdNum() {
        return myIdNum;
    }
    public double getMyGPA() {
        return myGPA;
    }
    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }
    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }
}
//Teacher class that extends Person
class Teacher extends Person {
    String subject1; //teacher subject
    protected double salary1; //teacher's salary
    //constructor for the Teacher class with Super class
    public Teacher(String myName, int myAge, String myGender, String subject1, double salary1) {
        super(myName, myAge, myGender);  
    }
    //getters and setters for subject and salary for Teacher class
    public String getSubject() {
        return subject1;
    }
    public double getSalary() {
        return salary1;
    }
    public void setSubject(String subject1) {
        this.subject1 = subject1;
    }
    public void setSalary(double salary1) {
        this.salary1 = salary1; 
    }
    //string method to print information about Teacher
    @Override
    public String toString() {
        return "Name: " + myName + ", Age: " + myAge + ", Gender: " + myGender + ", Subject: " + subject1 + ", Salary: " + salary1;
    }
}
//College Student class that extends Student
class CollegeStudent extends Student {
    String major1; //college students major
    int year1; //college students year
    //constructor for the College Student class with super class
    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int year1, String major1) {
        super(myName, myAge, myGender, myIdNum, myGPA);
    }
    //getters and setters for major and year for College Student class
    public String getMajor() {
        return major1;
    }
    public int getYear() {
        return year1;
    }
    public void setMajor(String major1) {
        this.major1 = major1;
    }
    public void setYear(int year1) {
        this.year1 = year1; 
    }
    //String method to print information about College Student 
    @Override
    public String toString() {
        return "Name: " + myName + ", Age: " + myAge + ", Gender: " + myGender + ", ID: " + myIdNum + ", GPA: " + myGPA + ", Year: " + year1 + ", Major: " + major1;
    }
}