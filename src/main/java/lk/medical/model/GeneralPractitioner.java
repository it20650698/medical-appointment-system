package lk.medical.model;
public class GeneralPractitioner extends Doctor { public GeneralPractitioner(){} public GeneralPractitioner(String id,String name,String spec,String avail,String room,String email,String password,double fee){super(id,name,spec,avail,room,email,password,fee,"GP");} @Override public double calculateConsultationFee(){return getFee();} }
