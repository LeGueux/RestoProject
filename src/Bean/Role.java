package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Role")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String libelle;
	
	@OneToMany(mappedBy="role")
	private List<Utilisateur> lesUtilisateurs;
	
	public Role() {}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public List<Utilisateur> getLesUtilisateurs() {
		return lesUtilisateurs;
	}

	public void setLesUtilisateurs(List<Utilisateur> lesUtilisateurs) {
		this.lesUtilisateurs = lesUtilisateurs;
	}
}
