package Db;

import java.io.Serializable;
import java.sql.Date;

public class Seller implements Serializable {

	private static final long serialVersionUID = 1L;
private Integer id;
private String name;
private String email;
private Date birthdate;
private Double baseSalary;

private Department department;



public Seller(Integer id, String name, String email,Date Birthdate, Double baseSalary, Department department) {
	this.id = id;
	this.name = name;
	this.email = email;
	this.birthdate = Birthdate;
	this.baseSalary = baseSalary;
	this.department = department;
}
public Seller() {
	
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Date getBirthdate() {
	return birthdate;
}

public void setBirthdate(Date birthdate) {
	this.birthdate = birthdate;
}

public Double getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(Double baseSalary) {
	this.baseSalary = baseSalary;
}
public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((baseSalary == null) ? 0 : baseSalary.hashCode());
	result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Seller other = (Seller) obj;
	if (baseSalary == null) {
		if (other.baseSalary != null)
			return false;
	} else if (!baseSalary.equals(other.baseSalary))
		return false;
	if (birthdate == null) {
		if (other.birthdate != null)
			return false;
	} else if (!birthdate.equals(other.birthdate))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

@Override
public String toString() {
	return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthdate=" + birthdate + ", baseSalary="
			+ baseSalary + "]";
}








}
