package kadai002;

import java.util.Scanner;
import java.io.*;

public class shipEarnings {
	
	public static void main (String args[]) {
		Scanner sc1 = new Scanner(System.in);
		String stringSalesFigures = sc1.nextLine();
		int salesFigures = Integer.valueOf(stringSalesFigures);
		
		String akazikurozi = akazikurozi(salesFigures);
		System.out.println(akazikurozi);
	}
	



	public static String akazikurozi(int num) {
		int shipCost = 2000000;
		int shipPrice = 3000000;
		int insurance = 1000000;

		int earnings = shipPrice * num - (shipCost * 10 + insurance);

		if(earnings > 0) {
			return "profit";
		}else if(earnings < 0) {
			return "Loss";
		}else {
			return "Broke Even";
		}
	}
}
