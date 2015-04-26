package Clone;

public class TestClone {

	public static void main(String[] args) {
		CloneModel1 obj1 = new CloneModel1(0);
		
		CloneModel2 obj2 = new CloneModel2(1,(CloneModel1) obj1.clone());
		
		CloneModel2 obj2Copy = null;
		
		obj2Copy = (CloneModel2) obj2.clone();
		
		CloneModel1 obj1Copy = (CloneModel1) obj1.clone();
		
		//obj1.setNum(2);
		//obj2.setNum(3);
		obj2.getObject1().setNum(4);
		
		System.out.println("obj1 num " + obj1.getNum());
		System.out.println("obj2 num " + obj2.getNum());
		System.out.println("obj2 obj1 num " + obj2.getObject1().getNum());
		System.out.println("obj2Copy num " + obj2Copy.getNum());
		System.out.println("obj2Copy obj1 num " + obj2Copy.getObject1().getNum());
		System.out.println("obj1Copy num " + obj1Copy.getNum());
	}
}
