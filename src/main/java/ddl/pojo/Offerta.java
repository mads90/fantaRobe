package ddl.pojo;

import java.io.Serializable;

public class Offerta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long idPlayer;
	private Long idCompetition;
	private Long idTeam;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdPlayer() {
		return idPlayer;
	}
	public void setIdPlayer(Long idPlayer) {
		this.idPlayer = idPlayer;
	}
	public Long getIdCompetition() {
		return idCompetition;
	}
	public void setIdCompetition(Long idCompetition) {
		this.idCompetition = idCompetition;
	}
	public Long getIdTeam() {
		return idTeam;
	}
	public void setIdTeam(Long idTeam) {
		this.idTeam = idTeam;
	}
}
