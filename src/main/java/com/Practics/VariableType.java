package com.Practics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

class vari
{
	
	int a;
	int b;
	 static String name="";
}

public class VariableType
{
	public static void testmethod()
	{
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		
		for(int i=0;i<ar1.size();i++)
		{
			
		}
		
		Iterator<Integer> I1 = ar1.iterator();
		while (I1.hasNext()) 
		{
			Integer val = (Integer) I1.next();
			
			
		}
		
		Car oCar = new Car(1000, "City", 200);
		Car oCar1 = new Car(2000, "Varna", 300);
		Car oCar2 = new Car(3000, "AudiQ7", 400);
		
		 ArrayList<Car> arrCar = new ArrayList<Car>();
		 arrCar.add(oCar1);
		 arrCar.add(oCar2);
		 arrCar.add(oCar);
		 
		// Collections.sort(arrCar, Collections.reverseOrder());
		 
		 Iterator<Car> Icar = arrCar.iterator();
		 while (Icar.hasNext()) 
		 {
			Car car = (Car) Icar.next();
			System.out.println(car.Color);
			System.out.println(car.Price);
			System.out.println(car.Speed);
			
		}
		 
		 
		 
		
	}

	public static void main(String[] args) 
	{
		testmethod();
      vari v = new vari();
      v.a=1;
      v.b=2;

      vari.name="java";
      
     StringBuilder str = new StringBuilder();
   //  str.append("Appendingvals");
    // System.out.println("Total char -"+str.capacity());
    // System.out.println(str.toString());
     
   

	}
	
	
	

}
