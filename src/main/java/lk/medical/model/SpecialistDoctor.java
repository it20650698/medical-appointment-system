package lk.medical.model;
public class SpecialistDoctor extends Doctor { public SpecialistDoctor(){} public SpecialistDoctor(String id,String name,String spec,String avail,String room,String email,String password,double fee){super(id,name,spec,avail,room,email,password,fee,"SPECIALIST");} @Override public double calculateConsultationFee(){return getFee()+500.0;} }
