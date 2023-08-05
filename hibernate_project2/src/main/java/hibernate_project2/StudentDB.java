package hibernate_project2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDB {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int identityNumber;
	private String name;
	private String address;
	private Long phone;
	private Long pincode;
	private String fatherName;
	private String motherName;
	public int getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(int identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@Override
	public String toString() {
		return "StudentDB [identityNumber=" + identityNumber + ", name=" + name + ", address=" + address + ", phone="
				+ phone + ", pincode=" + pincode + ", fatherName=" + fatherName + ", motherName=" + motherName + "]";
	}
	
	
}
