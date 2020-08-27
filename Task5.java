package ru.epam.jonline.module1.line_program;


// 	Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
//	Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc

public class Task5 {

	public static void main(String[] args) {
		
		int value = 9856;
		
		int hour;
		int min;
		int sec;

		hour = value / 3600;
		min = (value - hour * 3600) / 60;
		sec = (value - hour * 3600 - min * 60);
		
		System.out.format("Answer fifthTask: %02dч %02dмин %02dсек %n", hour, min, sec);
	}

}
