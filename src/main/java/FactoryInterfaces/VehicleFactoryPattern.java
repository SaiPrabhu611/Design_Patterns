package FactoryInterfaces;
 

public class VehicleFactoryPattern {

	public Vehicle getInstance(String VehicleType)
	{
		if(VehicleType.equals("TwoWheeler"))
		     return new TwoWheeler();
		else if(VehicleType.equals("ThreeWheeler"))
			return new ThreeWheeler();
		else if(VehicleType.equals("FourWheeler")) 
			
		     return new FourWheeler();
	 
		else 
			
			
		return null;
	}
	
}
