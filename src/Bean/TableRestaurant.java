package Bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TableRestaurant")
public class TableRestaurant implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String image;
	private String description;
	private String numTable;
	private String nom_reservation;
	private String statut;
	
	@ManyToOne
	private Restaurant resto;
	
	public TableRestaurant() {
		
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNumTable() {
		return numTable;
	}

	public void setNumTable(String numTable) {
		this.numTable = numTable;
	}

	public String getNom_reservation() {
		return nom_reservation;
	}

	public void setNom_reservation(String nom_reservation) {
		this.nom_reservation = nom_reservation;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public int getId() {
		return id;
	}

	public Restaurant getResto() {
		return resto;
	}

	public void setResto(Restaurant resto) {
		this.resto = resto;
	}
	
}
