package ddl.pojo;

import java.io.Serializable;
import java.util.Date;

public class Team implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Date creation;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreation() {
		return creation;
	}
	public void setCreation(Date creation) {
		this.creation = creation;
	}
}
