package lk.medical.model;
public abstract class User {
 private String id, fullName, email, password, phone, address, role;
 public User(){} public User(String id,String fullName,String email,String password,String phone,String address,String role){this.id=id;this.fullName=fullName;this.email=email;this.password=password;this.phone=phone;this.address=address;this.role=role;}
 public abstract boolean authenticate(String suppliedPassword);
 public String getId(){return id;} public void setId(String v){id=v;} public String getFullName(){return fullName;} public void setFullName(String v){fullName=v;} public String getEmail(){return email;} public void setEmail(String v){email=v;} public String getPassword(){return password;} public void setPassword(String v){password=v;} public String getPhone(){return phone;} public void setPhone(String v){phone=v;} public String getAddress(){return address;} public void setAddress(String v){address=v;} public String getRole(){return role;} public void setRole(String v){role=v;}
}
