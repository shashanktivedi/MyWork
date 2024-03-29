package com.java.codefit;

public class Parent {

	int id;
	String name;

//	public Parent(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
	
	
	public String sm() throws ArithmeticException {
		System.out.println("Hi sm1");
		return "sm1";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parent other = (Parent) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Parent [id=" + id + ", name=" + name + "]";
	}

}
