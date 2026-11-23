package com.oopsInheritance;
//These all can run this first
public class VcubeIV {

	public static void main(String[] args) {
		LaptopII l = new LaptopII();

		l.setBrand("HP");
		l.setPrice(55000);
		l.ram = "16GB";
		l.processor = "Intel i5";
		
		
		MobileIII m=new MobileIII();
		
		m.setBrand("Samsung");
		m.setPrice(25000);
        m.camera = "50MP";
		m.battery = "5000mAh";	
		
		DeviceI d;

		d = l;
		d.displayDetails();
		

		d = m;
		d.displayDetails();
		
		
		l.RunIDE();
		l.compilecode();
		

		m.makeCall();
		m.takephoto();
	}

}
