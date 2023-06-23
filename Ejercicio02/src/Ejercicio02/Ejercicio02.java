package Ejercicio02;

public class Ejercicio02 {

	public boolean isDateCorrect(int day, int month, int year) {
		if (month < 1 || month > 12)
			return false;

		switch (month) {
		case 1:
			if (day < 1 || day > 31)
				return false;
		case 3:
			if (day < 1 || day > 31)
				return false;
		case 5:
			if (day < 1 || day > 31)
				return false;
		case 7:
			if (day < 1 || day > 31)
				return false;
		case 8:
			if (day < 1 || day > 31)
				return false;
		case 10:
			if (day < 1 || day > 31)
				return false;
		case 12:
			if (day < 1 || day > 31)
				return false;
		case 4:
			if (day < 1 || day > 30)
				return false;
		case 6:
			if (day < 1 || day > 30)
				return false;
		case 9:
			if (day < 1 || day > 30)
				return false;
		case 11:
			if (day < 1 || day > 30)
				return false;
		case 2:
			if (day < 1 || day > 28)
				return false;
		}
		
		return true;
	}

}
