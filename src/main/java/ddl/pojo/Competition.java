package ddl.pojo;

import java.io.Serializable;
import java.util.List;

public class Competition implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private List<Team> teams;
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
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
}
