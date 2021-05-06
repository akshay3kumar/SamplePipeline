package com.package1;

public class Calculator {
	
	private double a;
	private double b;
	
	Calculator(double a, double b){
		this.a=a;
		this.b=b;
		}
	
	public double sum()
	{
		System.out.println("SUM");
		return (a+b);
		}
	public double difference()
	{
		System.out.println("DIFF");
		return (a-b);
		}
	public double mult()
	{
		System.out.println("MULT");
		return (a*b);
		}
	public double div()
	{
		System.out.println("DIV");
		return (a/b);
		}

}
