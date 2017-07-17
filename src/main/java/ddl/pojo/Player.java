package ddl.pojo;

import java.io.Serializable;
import java.util.Date;

public class Player implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Date nascita;
	
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
	public Date getNascita() {
		return nascita;
	}
	public void setNascita(Date nascita) {
		this.nascita = nascita;
	}
	
}
