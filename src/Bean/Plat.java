package Bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Plat")
public class Plat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String titre;
	
	@Column(name="description")
	private String desc;
	private double prix;
	private String img;
	private String ingredient;
	private String niveau;
	
	@OneToMany(mappedBy="plat",cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Commentaire> lesCommentaires;
	
	public Plat() {}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public int getId() {
		return id;
	}

	public List<Commentaire> getLesCommentaires() {
		return lesCommentaires;
	}

	public void setLesCommentaires(List<Commentaire> lesCommentaires) {
		this.lesCommentaires = lesCommentaires;
	}

}
