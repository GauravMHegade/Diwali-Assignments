package Day_7;

public class Student {
	int rollNo;
	String sName;
	String cName;
	double attendPer;
	double score;
	public Student() {
		super();
	}
	public Student(int rollNo, String sName, String cName, double attendPer, double score) {
		super();
		this.rollNo = rollNo;
		this.sName = sName;
		this.cName = cName;
		this.attendPer = attendPer;
		this.score = score;
	}

		
		public static void calculateGrade(Student s1)throws LowAttendanceException{
	        if(s1.attendPer<60.00){
	            throw new LowAttendanceException("Exception: Attendance is less than 60% ");
	        }
	        if (s1.score > 90) {
	            System.out.println("A");
	        } else if (s1.score > 80 && s1.score < 90) {
	            System.out.println("B");
	        } else if (s1.score > 70 && s1.score < 80) {
	            System.out.println("C");
	        } else {
	            System.out.println("D");
	        }

	    }

	    public int compareTo(Student o) {
	        return Double.compare(o.attendPer,this.attendPer);
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "rollNo=" + rollNo +
	                ", sName='" + sName + '\'' +
	                ", cName='" + cName + '\'' +
	                ", attendPer=" + attendPer +
	                ", score=" + score +
	                '}';
	    }
	}