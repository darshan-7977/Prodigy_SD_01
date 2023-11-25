package com.task1.temperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {

	private static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	private static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	private static double celsiusToKelvin(double celsius) {
		return celsius + 273.15;
	}

	private static double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter temperature: ");
		double temp = sc.nextDouble();

		System.out.print("Enter unit (C, F, K): ");
		String unit = sc.next().toLowerCase();

		double toFahrenheit = 0;
		double toKelvin = 0;

		switch (unit) {
		case "c":
			toFahrenheit = celsiusToFahrenheit(temp);
			toKelvin = celsiusToKelvin(temp);
			break;
		case "f":
			toFahrenheit = fahrenheitToCelsius(temp);
			toKelvin = celsiusToKelvin(fahrenheitToCelsius(temp));
			break;
		case "k":
			toFahrenheit = celsiusToFahrenheit(kelvinToCelsius(temp));
			toKelvin = kelvinToCelsius(temp);
			break;
		default:
			System.out.println("Invalid unit. Use C, F, or K.");
			System.exit(1);
		}

		System.out.println("Entered temperature: " + temp + " °" + unit.toUpperCase());
		System.out.println("Converted to Fahrenheit: " + toFahrenheit + " °F");
		System.out.println("Converted to Kelvin: " + toKelvin + " K");
	}
}
