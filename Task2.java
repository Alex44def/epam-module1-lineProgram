package ru.epam.jonline.module1.line_program;

import static java.lang.Math.*;


// Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class Task2 {
	
	public static void main(String[] args) {
		
		double a = 3;
		double b = 10;
		double c = 1;
		
		double z;
		
		z = (((b + sqrt(pow(b, 2) - 4*a*c)) / 2*a) - pow(a, 3) * c + pow(b, -2));
		
        System.out.printf("Answer secondTask: %.4f", z);
	}
}
