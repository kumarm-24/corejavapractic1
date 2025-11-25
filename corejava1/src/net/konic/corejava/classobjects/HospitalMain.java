package net.konic.corejava.classobjects;

public class HospitalMain {
	public static void main(String[] args) {
		
		Hospital h = new Hospital();
		
		h.hospitalName = "Narayana";
		h.location = " Nellore";
		h.doctorStrength = 50;
		
		System.out.println("/-----HOSPITAL NAME------/");
		h.displayInfo();
	}
	 
}
