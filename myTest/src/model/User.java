package model;

public class User {

	private String id;
	private boolean leaf;

	public User(String id, boolean leaf) {
		this.id = id;
		this.leaf = leaf;
	}
	
	public void print() {
		System.out.println("User print");
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return this.id;
	}

	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	
	
}
