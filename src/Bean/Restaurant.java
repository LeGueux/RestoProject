package Bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Restaurant")
public class Restaurant implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	private String rue;
	private String cp;
	private String ville;
	
	@OneToMany(mappedBy="resto",cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<TableRestaurant> lesTables;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getId() {
		return id;
	}
	
	public List<TableRestaurant> getLesTables() {
		return lesTables;
	}
	public void setLesTables(List<TableRestaurant> lesTables) {
		this.lesTables = lesTables;
	}
	public Restaurant() {
		
	}
	
}
