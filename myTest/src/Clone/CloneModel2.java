package Clone;

public class CloneModel2 implements Cloneable{

	private int num;
	private CloneModel1 object1;
	
	public CloneModel2(int num){
		this.num = num;
		this.object1 = null;
	}
	
	public CloneModel2(int num, CloneModel1 object1){
		this.num = num;
		this.object1 = object1;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public CloneModel1 getObject1() {
		return object1;
	}

	public void setObject1(CloneModel1 object1) {
		this.object1 = object1;
	}
	
	@Override
	protected Object clone() {
		CloneModel2 obj = null;
		try {
			obj = (CloneModel2) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
