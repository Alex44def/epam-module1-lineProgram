package ru.epam.jonline.module1.line_program;

import static java.lang.Math.*;


// Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class Task3 {

	public static void main(String[] args) {
		
		double x = 60;
		double y = 20;
		
		double z;
		
		z = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);

		System.out.printf("Answer thirdTask: %.4f", z);

	}

}
