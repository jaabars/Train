
public class Main {

    public static void main(String[] agrs){

        Student harryPotter= new Student ("Harry Potter,","+99670098635",true);
        Student hermione= new Student ("Hermione","+99682245565", true);
        Student roneWisley= new Student("Rone Wisley","+996822455655", false);
        Student breadRoomely= new Student ("Bread Roomeley","+9967556852", true);
        Student christepherBoolmey= new Student("Christopher Boolmey","+9968546321", false);
        Student jeremyMcGuaer= new Student ("Jeremy McGuayr,","+98563245",true);
        Student boolseyErmione= new Student ("Boolsey Ermione","+855412564", true);
        Student grecorThore= new Student("Grecor Thore","+85632445231", false);
        Student petherHormone= new Student ("Peter Hormone","+852321552", true);
        Student melonyDrowler= new Student("Meloney Drawler","+85366522564", false);
        Student jessyThomblre= new Student ("Jessy Thombler","+852214533", true);
        Student bobbyTrawsle= new Student("Bobby Trawsley","+8533445215", false);
        Student meatronTrosley= new Student ("Meathron Troosley","+85523541554", true);
        Student anutaDorothy= new Student("Anuta Dorothy","+8523322563", false);

        Course tranfiguration=new Course(1, "Tranfiguration", 10 );

        TeacherOfTheCourse transfigurationTeacher= new TeacherOfTheCourse("Minerva McGonagall",1000);

        tranfiguration.teacher=transfigurationTeacher;



        tranfiguration.studentsAmount(10);
        tranfiguration.addStudent(harryPotter);
        tranfiguration.addStudent(roneWisley);
        tranfiguration.addStudent(breadRoomely);
        tranfiguration.addStudent(christepherBoolmey);
        tranfiguration.addStudent(hermione);
        tranfiguration.addStudent(jeremyMcGuaer);
        tranfiguration.addStudent(boolseyErmione);
        tranfiguration.addStudent(grecorThore);
        tranfiguration.addStudent(petherHormone);
        tranfiguration.addStudent(melonyDrowler);
        tranfiguration.addStudent(jessyThomblre);
        tranfiguration.addStudent(bobbyTrawsle);
        tranfiguration.addStudent(meatronTrosley);
        tranfiguration.addStudent(anutaDorothy);

        for (Student s:tranfiguration.getStudents()
             ) {
            System.out.println(s);
        }


        TeacherOfTheCourse newTeacher=new TeacherOfTheCourse("Jonathan Brandlis", 900);
        tranfiguration.setTeacher(newTeacher);

        tranfiguration.teacherNameAndSubject();





    }

}