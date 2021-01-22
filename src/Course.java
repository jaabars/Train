public class Course {
    int id;
    String nameOfTheCoure;
    boolean isPaid;
    int price;
    TeacherOfTheCourse teacher;
    Student[] students;

    public Course(int id, String nameOfTheCoure, int price) {
        this.id = id;
        this.nameOfTheCoure = nameOfTheCoure;
        this.price = price;
    }

    public void studentsAmount(int count) {
        this.students = new Student[count];
    }

    public boolean addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {

            if (student.isPaid == true) {
                if (students[i] == null) {
                    students[i] = student;
                    return true;
                }
            }
        }
            return false;

    }

    public Student[] getStudents() {
        return students;
    }



    public int getId() {
        return id;
    }

    public TeacherOfTheCourse getTeacher() {
        return teacher;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeacher(TeacherOfTheCourse teacher) {
        this.teacher = teacher;
    }
    public void teacherNameAndSubject(){
        System.out.println(teacher.teachersName+" "+ nameOfTheCoure);
    }

    public Course (){

    }
}
