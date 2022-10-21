package by.home.maxzzzit;

import java.io.IOException;

public class PerevodVByte {
	public static void main (String[]args) throws IOException{
		int vivod;
		System.out.print("Введите символ для перевода в БАЙТЫ: ");
		while (true) {
		vivod = System.in.read();
		System.out.println(vivod);
		}
	}
}
