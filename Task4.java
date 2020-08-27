package ru.epam.jonline.module1.line_program;

public class Task4 {

	
//	Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
//	Поменять местами дробную и целую части числа и вывести полученное значение числа
	
	public static void main(String[] args) {
		
		double a = 111.333;
		
		double integPart;
		double fractPart;
		double z;

		integPart = (int) a;
		fractPart = (a * 1000) % 1000;
		
		z = fractPart + integPart/1000;

		System.out.println("Answer fourthTask: " + z);

	}

}
