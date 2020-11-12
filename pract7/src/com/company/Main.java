package com.company;
import java.util.Scanner;

public class Main {
	public static void task1() {
		String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
		int a[] = new int[3];
		a[0]=0; a[1]=0; a[2]=0;
		int b=-1;
		boolean c=false;
		for(int i=0; i<text.length(); i++) {
			if (text.charAt(i)>47 && text.charAt(i)<58) {
				if (c==false) { c=true; b+=1; }
				a[b]=a[b]*10+(text.charAt(i)-48);
			}
			else {
				c=false;
			}
		}
		System.out.print("Вася: "+a[0]+", Маша: "+a[2]);
	}
	public static void task2() {

	}
	public static void task3() {
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		char[] digits;
		if (text.matches("[A-Za-z]|[А-Яа-я]")) { System.out.println("у вас буквы в номере"); }
		else {
			int diglen = 0;
			for (int i=0; i < text.length(); i++) {
				if (text.charAt(i)>47 && text.charAt(i)<58) diglen++;
			}
			digits = new char[diglen];
			diglen=0;
			for (int i=0; i < text.length(); i++) {
				if (text.charAt(i)>47 && text.charAt(i)<58) {
					digits[diglen]=text.charAt(i);
					diglen++;
				}
			}
			if (digits.length==10 || digits.length==11) {
				if (digits.length==10 || (digits[0]==56 || digits[0]==55)) {
					int counter=0;
					System.out.print("+7");
					if (digits.length==11) counter=1;
					System.out.print(" (" + digits[0+counter] + digits[1+counter] + digits[2+counter] + ") " +
							digits[3+counter] + digits[4+counter] + digits[5+counter] + "-" + digits[6+counter]  +
							digits[7+counter] + "-" + digits[8+counter] + digits[9+counter]);
				} else System.out.println("у вас первая цифра не 8 и не 7 ("+digits[0]+"), а символов "+digits.length);
			} else { System.out.println("у вас цифр не 10 и не 11 ("+digits.length+")"); }
		}
	}
    public static void main(String[] args) {
	    task3();
    }
}
