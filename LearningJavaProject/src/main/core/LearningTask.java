package main.core;

import java.util.Scanner;

public class LearningTask {
//	Канель Е., Фрайман З. - JAVA. Задачи по основам программирования - 2019
//	1.4-1.7		
	
//	int a, b;
//	a = 5;
//	b = 9;
//	int c = a + b;
//	System.out.println(c);
	
//	double x = 7.5;
//	double y = 2 * x;
//	double z = 3 * x;
//	System.out.println(y);
//	System.out.println(z);
	
//	int a = 2;
//	int b = 3;
//	int c = 10 * a + 1 * b;
//	System.out.println(c);
	
//	int x = 10;
//	double y = 10.0 / 3;
//	System.out.println(y);
	
//	2.1-2.4
	
//	System.out.println("Hello, world!");
	
//	System.out.println("H-e-l-l-o-,-f-r-i-e-n-d!");
	
//	System.out.println("+++");
//	System.out.println("!!!!");
//	System.out.println("??");
	
//	System.out.print("+++");
//	System.out.print("!!!!");
//	System.out.println("??");
	
//	2.8-2.12
	
//	int x = 6;
//	int a = x;
//	System.out.println(a);
//	a *= a;
//	System.out.println(a);
//	a *= x;
//	System.out.println(a);

//	int x = 9;
//	System.out.println(String.format("Значение x равно %s", x));
//	int x2 = x * x;
//	System.out.println(String.format("Квадрат значения %s равен %s", x, x2));
	
//	int x = 2;
//	int y = 4;
//	System.out.println(String.format("Значение x равно %s. Значение y равно %s", x, y));
//	int z = x * y;
//	System.out.println(String.format("Произведение x и y равно %s", z));
//	z = x + y;
//	System.out.println(String.format("Сумма x и y равно %s", z));
	
//	System.out.println("*firstName LastName*");
//	System.out.println("*8-900-234-12-12*");
	
//	System.out.println("*******");
//	System.out.println(" *****");
//	System.out.println("  ***");
//	System.out.println("   *");
//	System.out.println("  ***");
//	System.out.println(" *****");
//	System.out.println("*******");
	
//	2.14-2.21
	
//	int a, b, c;
//	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Введите целое число: ");
//	a = sc.nextInt();
//	sc.close();
	
//	b = a + 10;
//	System.out.println(b);
//	
//	b = 10 * a;
//	System.out.println(b);
//	
//	b = a + 6;
//	System.out.println(b);
//	b = a - 12;
//	System.out.println(b);
	
//	b = a * a;
//	System.out.println(b);
	
//	b = a * a;
//	c = b * a;
//	System.out.println(String.format("%s & %s", b, c));
	
//	b = a - 1;
//	c = a + 1;
//	System.out.println(String.format("%s %s %s", b, a, c));
	
//	System.out.println(a);
//	b = -1 * a;
//	System.out.println(b);
	
//	a++;
//	System.out.println(a);
//	a++;
//	System.err.println(a);
//	a++;
//	System.err.println(a);
	
//	2.22-2.25
	
//	int a, b, c;
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Введите первое целое число: ");
//	a = sc.nextInt();
//	System.out.print("Введите второе целое число: ");
//	b = sc.nextInt();
	
	
//	c = a + b;
//	System.out.println(c);
//	c = a * b;
//	System.out.println(c);
//	c = a - b;
//	System.out.println(c);
//	c = b - a;
//	System.out.println(c);
	
//	c = a * a;
//	System.out.println(c);
//	c = b * b;
//	System.out.println(c);
//	c = a * a + b * b;
//	System.out.println(c);
	
//	c = a * b;
//	System.out.println(c);
//	c = 2 * a + 2 * b;
//	System.out.println(c);
	
//	System.out.print("Введите третье целое число: ");
//	c = sc.nextInt();
//	int d;
//	// объем параллелепипеда
//	d = a * b * c;
//	System.out.println(d);
//	// площадь каждой из граней
//	d = a * b;
//	System.out.println(d);
//	d = a * c;
//	System.out.println(d);
//	d = b * c;
//	System.out.println(d);
//	// общая площадь
//	d = a * b + a * c * b * c;
//	System.out.println(d);
//	// общий периметр
//	d = 4*a + 4*b + 4*c;
//	System.out.println(d);
//	
//	
//	sc.close();
	
//	try(Scanner sc = new Scanner(System.in)){
		//2.26
//		System.out.print("Введите год рождения: ");
//		int y1 = sc.nextInt();
//		System.out.print("Введите текущий год: ");
//		int y2 = sc.nextInt();
//		int r = y2 - y1;
//		System.out.println("Возраст: " + r);
		
//		2.27
//		System.out.print("Введите массу тела в граммах: ");
//		int m = sc.nextInt();
//		System.out.println("Масса тела в килограммах: " + m / 1000f);
		
//		2.28
//		System.out.print("Введите расстояние в кабельтовых: ");
//		int s = sc.nextInt();
//		System.out.println(String.format("%s кабельта(-ов) = %s метра(-ов)", s, s * 182.2f));

//		2.29
//		System.out.print("Введите время в часах: ");
//		int hour = sc.nextInt();
//		System.out.println(String.format("Время в секундах = %s", hour*60));
		
//		2.30
//		System.out.println("Который час?");
//		System.out.print("Введите часы:");
//		int h = sc.nextInt();
//		System.out.print("Введите минуты:");
//		int m = sc.nextInt();
//		int r = 3600*h + 60*m;
//		System.out.println(String.format("С полуночи до данного момента прошло %s секунд.", r));
//		r = 60*h + m;
//		System.out.println(String.format("С полуночи до данного момента прошло %s минут.", r));
//		r = 24 * 60 - 60*h - m;
//		System.out.println(String.format("%s минут осталось до полуночи", r));
//	}
	
//	try(Scanner sc = new Scanner(System.in)){
//		2.31
//		System.out.println("Введите массу тела: ");
//		int m = sc.nextInt();
//		System.out.println("Введите скорость: ");
//		int s = sc.nextInt();
//		double e = m * s*s / 2.0d;
//		System.out.println(String.format("Кинетическая энергия равна %s", e));
		
//		2.32
//		System.out.println("Введите целое число: ");
//		int a = sc.nextInt();
//		System.out.println(-a);
		
//		3.33
//		System.out.println("Введите основание 1: ");
//		int a = sc.nextInt();
//		System.out.println("Введите основание 2: ");
//		int b = sc.nextInt();
//		System.out.println("Введите высоту: ");
//		int h = sc.nextInt();
//		double s = (a + b) / 2.0d * h;
//		System.out.println("Площадь трапеции равна " + s);
		
//		2.34
//		String s = "Привет";
//		System.out.println("Введите имя: ");
//		String name = sc.next();
//		System.out.println(s + ", " + name);
		
//		2.35
//		System.out.println("Введите имя: ");
//		String firstName = sc.next();
//		System.out.println("Введите фамилию: ");
//		String lastName = sc.next();
//		System.out.println(String.format("Вас зовут %s %s", firstName, lastName));
		
//		2.38
//		System.out.println("Введите фамилию: ");
//		String lastName = sc.next();
//		System.out.println("Введите имя: ");
//		String firstName = sc.next();
//		System.out.println("Введите отчество: ");
//		String middleName = sc.next();
//		String name = String.valueOf(lastName.charAt(0)) + firstName.charAt(0) + middleName.charAt(0);
//		System.out.println(name);
		
//	}	
}
