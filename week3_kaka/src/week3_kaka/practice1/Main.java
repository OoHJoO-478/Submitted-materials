package week3_kaka.practice1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		student.add(new Student("Alice",15,60));	
		student.add(new Student("Takuya",12,90));	
		student.add(new Student("Ryo",25,34));	
		student.add(new Student("Suzanu",18,20));
		
		
		List<Student> lowScoreStudents = new ArrayList<>();
        for (Student s : student) {
            if (s.getScore() < 60) {
                lowScoreStudents.add(s);             
            }
        }
        System.out.println(lowScoreStudents);

        student.sort(Comparator.comparing(Student::getScore).reversed());
        System.out.println(student);
		
	}
	

}
