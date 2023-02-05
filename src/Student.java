public class Student {
    // class attributes
    private String name;
    private int age;
    private double gpa;

    // constructor without parameters

    public Student() {
        super();
    }

    // constructor using parameter(s)

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    // class methods

    public String displayStudent(){
        return(String.format("Name : %s Age : %s GPA : %.2f",name,age,gpa));
    }

}
