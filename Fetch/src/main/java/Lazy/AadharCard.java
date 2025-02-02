package Lazy;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class AadharCard {
	
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private int ano;	
	private String dob;
	private String fathername;
	private String address;
	private String email;
	
	
	@OneToOne(mappedBy = "aadharcard")
	@JoinColumn
	private Person person;

	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getFathername() {
		return fathername;
	}


	public void setFathername(String fathername) {
		this.fathername = fathername;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "AadharCard [ano=" + ano + ", dob=" + dob + ", fathername=" + fathername + ", address=" + address
				+ ", email=" + email + "]";
	}


}