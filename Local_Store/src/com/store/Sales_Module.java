package com.store;

import java.util.*;

public class Sales_Module 
{
	Scanner s;
	List<Stock_Module> a;

	public Sales_Module()
	{
		this.a= new ArrayList<>();
		this.s=new Scanner(System.in);	
	}
	
	public void add() 
	{
		// TODO Auto-generated method stub
		int productCode=0;;
		String productName="";
		float cost=0;
		int quantity;
		System.out.println("----------------Entering items in stock---------------");
		System.out.println("Enter product code (3 digits only)");

		productCode=s.nextInt();
		System.out.println("Enter name of the product");
		productName=s.next();
		System.out.println("Enter cost per item");
		cost=s.nextFloat();
		System.out.println("Enter quantity which should be added in the stock");
		quantity=s.nextInt();
		Stock_Module d= new Stock_Module(productCode,productName,cost,quantity);
		a.add(d);
		
	}	
	public void UpdateTheList() {
		
		// TODO Auto-generated method stub
		
		System.out.println("Enter product name to update:");
		String name=s.next();
		int index=0;
		for(Stock_Module sm:a) {
			if(name.equals(sm.getProductName()))
			{
				index=a.indexOf(sm);
				
				break;
			}
		}
		int code=0;
		String n="";
		float cost=0;
		int quantity=0;
		System.out.println("Enter product code (3 digits only)");
		code=s.nextInt();
		System.out.println("Enter name of the product");
		n=s.next();
		System.out.println("Enter cost per item");
		cost=s.nextFloat();
		System.out.println("Enter quantity which should be added in the stock");
		quantity=s.nextInt();
		Stock_Module d= new Stock_Module(code,n,cost,quantity);
		a.set(index, d);
		int sum = (int) (cost* quantity);
		System.out.println("sum::" +sum);
			
	}
	public void SearchProduct() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter product to Search");
		String name=s.next();
		
		for(Stock_Module sm:a) {
			if(name.equals(sm.getProductName())) 
			{
				System.out.println(sm);
			}
	}
		
	
	}
	public void Bill() {
		int productcode=0;
		int quantity=0;
		int cost = 0;
		System.out.println("Enter code of product to search");
		productcode=s.nextInt();
		for(Stock_Module sm:a) {
			if(productcode==sm.getProductCode()) {
				System.out.println(sm);
				System.out.println("Enter quantity");
				quantity=s.nextInt();	
			}
			else {
				System.out.println("Invalid product code");
			}
		}
		int sum = (int) (cost* quantity);
		System.out.println("sum::" +sum);
	}
	
}