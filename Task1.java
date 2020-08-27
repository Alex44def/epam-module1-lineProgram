package ru.epam.jonline.module1.line_program;


// Найдите значение функции: z = ( (a - 3 ) * b / 2) + c

public class Task1 {
	
	public static void main(String[] args) {
		
		double a = 3;
		double b = 10;
		double c = 1;
		
		double z;
		
		z = ((a-3) * b) / 2 + c;
		
		System.out.println("Introduction. Линейные программы");
		System.out.println("Answer firstTask: " + z);
	}
}
