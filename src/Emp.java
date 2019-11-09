//create table users(id number primary key,name varchar2(30),password varchar2(30),
//email varchar2(30),country varchar2(30))
public class Emp {
private int id;
private String name,password,email,phone, country;


public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public void setString(String string) {
	// TODO Auto-generated method stub
	
}

}
