package FactoryMethod;
//import FactoryInterfaces.FourWheeler;
//
//import FactoryInterfaces.TwoWheeler;
//
//import FactoryInterfaces.ThreeWheeler;
//
//import FactoryInterfaces.Vehicle;

import FactoryInterfaces.*;
public class VehicleFactory
{
	
public static void main(String args[])
{
	VehicleFactoryPattern vehiclePatternObject= new VehicleFactoryPattern();
	Vehicle VehicleObject=vehiclePatternObject.getInstance("TwoWheeler");
    
	if(VehicleObject!=null) {
	VehicleObject.VehicleType();	
	}
	else
	{
		
		System.out.println(" Specified vehicleType is not available");
	}
}
}