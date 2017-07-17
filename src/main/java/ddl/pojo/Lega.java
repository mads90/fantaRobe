package ddl.pojo;

import java.io.Serializable;
import java.util.List;

public class Lega implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private List<Competition> competizioni;
	private List<User> utenti;
	
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
	public List<Competition> getCompetizioni() {
		return competizioni;
	}
	public void setCompetizioni(List<Competition> competizioni) {
		this.competizioni = competizioni;
	}
	public List<User> getUtenti() {
		return utenti;
	}
	public void setUtenti(List<User> utenti) {
		this.utenti = utenti;
	}
}
