package basics;

public class Driver {

	public static void main(String[] args) {
		
		Student sarr [] = new Student[5];
		System.out.println(sarr);
		sarr[0] = new Student(12, "Mahesh", "Civil", 65.56);
		sarr[1] = new Student(23, "Manjunath", "Electrical", 77.43);
		sarr[2] = new Student(45, "Siddu", "Mechanical", 72);
		
		System.out.println();
	}

}
