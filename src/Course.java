import java.util.ArrayList;

public class Course  {
    // class attributes
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();

    // constructor without parameters

    public Course() {
        super();
    }

    // constructor using parameter(s)

    public Course(String name) {
        this();
        this.name = name;
    }

    public Course(String name, ArrayList<Student> students) {
        this(name);
        this.students = students;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // class methods
    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }


}
