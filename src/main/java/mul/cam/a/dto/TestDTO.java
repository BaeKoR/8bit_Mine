package mul.cam.a.dto;

import java.io.Serializable;

public class TestDTO implements Serializable {
	private String category;
	private int id;
	
	public TestDTO() {
		// TODO Auto-generated constructor stub
	}
	public TestDTO(String category, int id) {
		super();
		this.category = category;
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "TestDAO [category=" + category + ", id=" + id + "]";
	}
	
	
	
}
