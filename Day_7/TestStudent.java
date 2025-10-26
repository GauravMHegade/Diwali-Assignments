package Day_7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {

	  public static void main(String[] args) {
	        List<Student>students = new ArrayList<>();
	        students.add(new Student(01,"Gaurav","java",87.00,67));
	        students.add(new Student(02,"Om","java",83.00,89));
	        students.add(new Student(03,"Pranav","java",88.00,85));

	        for(Student s: students){
	            try{
	               Student.calculateGrade(s);
	            }catch(LowAttendanceException e){
	                System.out.println(e.getMessage());
	            }
	        }

	        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentData"))){
	            oos.writeObject(students);
	            System.out.println("data is saved successfullly in file");
	        }catch (IOException e){
	            System.out.println(e.getMessage());
	        }

//	        Collections.sort(students, (s1, s2) -> Integer.compare(s2.attendPer, s1.attendPer));
//	        System.out.println("decrement order of attendace percent");
//	        for(Student s : students){
//	            System.out.println(s);
//	        }



	    }
	}