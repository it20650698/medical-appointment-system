package lk.medical.model;
public class AdminUser extends User { public AdminUser(){} public AdminUser(String id,String name,String email,String password){super(id,name,email,password,"","","ADMIN");} @Override public boolean authenticate(String p){return "ADMIN".equals(getRole())&&getPassword()!=null&&getPassword().equals(p);} }
