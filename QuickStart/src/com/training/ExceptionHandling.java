package com.training;

public class ExceptionHandling {
	
	public static String handle(){
		try{
			int age = 43;
			int markscode = 450;
			int average = markscode/0;
			System.out.println(age);
			System.out.println(average);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Requires Command line argument");
		}
		catch (NumberFormatException e){
			System.out.println("Command line argument should a positive number");
		}
		catch(ArithmeticException e){
			//return "bye bye";
			System.out.println("Deniminator cannot be 0");
			
		}
		finally{
			System.out.println("Finally");
		}
		System.out.println("Done");
		return "Bye";
	}

	public static String catchwithJava8(){
		try{
			int age = 43;
			int markscode = 450;
			int average = markscode/0;
			System.out.println(age);
			System.out.println(average);
		}
		catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
			System.out.println(e.getClass());
		}
		finally{
			System.out.println("Finally");
		}
		System.out.println("Done");
		return "Bye";
	}
	public static void main(String[] args) {
		handle();
		catchwithJava8();
	}
}
	
