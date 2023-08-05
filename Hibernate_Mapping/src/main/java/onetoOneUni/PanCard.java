package onetoOneUni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PanCard {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String Pannumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPannumber() {
		return Pannumber;
	}
	public void setPannumber(String pannumber) {
		Pannumber = pannumber;
	}
	@Override
	public String toString() {
		return "PanCard [id=" + id + ", name=" + name + ", Pannumber=" + Pannumber + "]";
	}
	
}
