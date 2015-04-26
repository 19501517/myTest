package Clone;
public class CloneModel1 implements Cloneable {

	private int num;

	public CloneModel1(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	protected Object clone() {
		CloneModel1 obj = null;
		try {
			obj = (CloneModel1) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
