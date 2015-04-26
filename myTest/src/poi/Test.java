package poi;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Student stu1 = new Student("t1", "id1", 1);
		Student stu2 = new Student("t2", "id2", 2);
		Student stu3 = new Student("t3", "id3", 3);
		Student stu4 = new Student("t4", "id4", 4);
		Student stu5 = new Student("t5", "id5", 5);
		
		List<Student> list = new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
		
		boolean check = new CreateXls().createClsFile(list);
		System.out.println(check);
	}
}
