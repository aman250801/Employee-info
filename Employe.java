package com.firstPgm;

public class Employe {
	   String name;
	   String deg;
	   int id;
	   int slry;
	   
	   
	   public void print(String name, int id) {
		   System.out.println("Employee name and id:-" +name +" "+ id);
	   }
	   public void print(int id, int sal) {
		   System.out.println("Employee id and sal:-" + id +" "+ sal);
	   }
	   public void print(String name, String desg) {
		   System.out.println("Employee name and desg:-" +name+" "+desg);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employe e1=new Employe();
    
      e1.print("Aman" ,3 );
      e1.print(3 ,25000);
      e1.print("Aman" , "Software");
      
	}

}
