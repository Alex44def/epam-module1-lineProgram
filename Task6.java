package ru.epam.jonline.module1.line_program;

// Для данной области составить линейную программу, 
// которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае

public class Task6 {
	
	public static void main(String[] args) {
		
		int x = -1;
		int y = 4;
		
		boolean z;
		
		z = (y > 0 && y <= 4 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x >= -4 && x <= 4);
		
		System.out.print("Answer sixthTask: " + z);
	}

}
