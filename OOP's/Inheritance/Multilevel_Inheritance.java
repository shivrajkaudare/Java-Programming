package OOPs;

class School {
    public String method1() {
        return "MGV School Pune";
    }
}

class Teacher extends School {
    public String method2() {
        return "Mr. RS Kulkarni";
    }
}

class Student extends Teacher {
    public String method3(String studentName) {
        String schoolName = method1();
        String teacherName = method2();
        return "Student Name is : " + studentName + ", Teacher Name is : " + teacherName + ", School Name is : " + schoolName;
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Student student = new Student();
        String  Student_details = student.method3("Shivraj Kaudare");
        System.out.println( Student_details);
    }
}
