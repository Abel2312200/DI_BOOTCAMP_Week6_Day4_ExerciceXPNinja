public class Main {
    public static void main(String[] args) {

        Course course = new Course("Computer science 101");

        Student student1 = new Student("John Smith",20,3.5);
        Student student2 = new Student("John Smith",21,3.8);
        Student student3 = new Student("John Smith",22,2.5);

        course.addStudent(student3);
        course.addStudent(student2);
        course.addStudent(student1);


        for (int i = 0; i < course.getStudents().size(); i++) {
            String info = course.getStudents().get(i).displayStudent();
            System.out.println(String.format(" %s",info));
        }

    }
}