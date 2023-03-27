package controller;
public class CalculateBMI {
	public static double calculate(double weight, double height)
	{
		return weight/ (height*height);
	}
		 public static  String description(double bmi)
	    {  
		if(bmi<18.5){
			return "You are UnderWeight";

		}
		else if(bmi>18.5 && bmi<24.9){
			return "You are Normal";
		}
		else if(bmi>25 && bmi<29.9){
			return "You are OverWeight";
		}
		else if(bmi>=30)
		{
			return "You are Obese";
		}
		return null;
		}
		public static void main(String[] args){
			double weight= 65;
			double height=1.7;
			double bmi = CalculateBMI.calculate(weight,height);
			String bmic =CalculateBMI.description(bmi);
			System.out.println("BMI C:"+bmic);
		}}
	

