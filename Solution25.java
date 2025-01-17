import java.util.*;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

// Complete the code
class Compare implements Comparator<Student> {
	public int compare(Student a, Student b) {
		if (a.getCgpa() != b.getCgpa()) {
			return Double.compare(b.getCgpa(), a.getCgpa());
		}
		int compareName = a.getFname().compareTo(b.getFname());
		if (compareName != 0) {
			return compareName;
		}
		return Integer.compare(a.getId(), b.getId());
	}
}

public class Solution25 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		in.close();
		Collections.sort(studentList, new Compare());
		for (Student st : studentList) {
			System.out.println(st.getFname());

		}
	}
}
