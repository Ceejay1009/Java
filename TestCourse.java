

public class TestCourse {
  public static void main(String[] args) {
    Course course = new Course("CSC 3020:");
    course.addStudent("Peter Johnes");
    course.addStudent("Brian Smith");
    course.addStudent("Anne Kennedy");
    course.addStudent("Susan Kennedy");
    course.addStudent("John Kennedy");

    String[] students = course.getStudents();
    System.out.println(course.getCourseName());
    for (int i = 0; i < course.getNumberOfStudents(); i++) {
      System.out.printf("%-12s, ", students[i]);
    }
    System.out.println("\nNumber of students in course: " + course.getNumberOfStudents());

    course.dropStudent("Susan Kennedy");
    for (int i = 0; i < course.getNumberOfStudents(); i++) {
      System.out.printf("%-12s, ", students[i]);
    }
    System.out.println("\nNumber of students in course: " + course.getNumberOfStudents());
  }
}


class Course {
  private String courseName;
  private String[] students = new String[3];
  private int numberOfStudents;
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public String getCourseName() {
    return courseName;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  //Revise the getStudents method to return an array whose length is the same 
  //as the number of students in the course. 
  public String[] getStudents() {
    return students;
  }

  //Revise the addStudent method to automatically increase the array size 
  public void addStudent(String student) {
    if (numberOfStudents >= students.length) {
      String[] temp = new String[students.length * 2];
      System.arraycopy(students, 0, temp, 0, students.length);
      students = temp;
    }
    students[numberOfStudents++] = student;
  }
  
  //Implement the dropStudent method.	
  public void dropStudent(String student) {
    for (int i = 0; i < students.length; i++) {
      if (student.equalsIgnoreCase(students[i])) {
        students[i] = null;
        numberOfStudents--;
        while (i < numberOfStudents) {
          students[i] = students[i + 1];
          i++;
        }
        break;
      }
    }
  }
}