package InleverOpdrachten;
public class Calculator {
	
	
	/*
	 * Methode main hieronder kan je verwijderen nadat het importeren gelukt is.
	 */
	public static void main(String[] args){
		System.out.println("Test of de import goed werkt...");
	}

	/*
	 * Werk de onderstaande methodes uit.
	 * 
	 * Gebruik enkel de optelling als expressie.
	 * 
	 * Maak gebruik van de nodige control flow structures om de bewerking te vervolledigen
	 * 
	 * Maak gebruik van gehele getallen.
	 */
	
	public static int add(int number1, int number2) {
		return number1 + number2;
		
	}
	

	public static int subtract(int number1, int number2) {
		return number1 - number2;
	}

	public static int multiply(int number1, int number2) {
		int antwoord = number2;
		for(int i = 1; i< number1; i++) {	
			antwoord+=  number2;
		}
		return antwoord;
	}
	
	/*
	 * Zorg ervoor dat number1 deelbaar is door number2
	 * 
	 * Of: wijzig de nodige types zodat je ook andere delingen kan maken.
	 */
	
	public static int devide(int number1, int number2) {
		// HINT: misschien kan je de methode subtract hierbij gebruiken.
		int antwoord = 0;
		for(int i = number2; i<= number1; i+=number2) {
			antwoord++;
		}
		return antwoord;
	}
	
	/*
	 * Methode hieronder is voor een tweede machtsverheffing
	 */
	
	public static int square(int number1) {
		// HINT: multiply???
		int antwoord = number1;
		antwoord = multiply(number1 , number1);
		return antwoord;
	}

	/*
	 * Methode hieronder is voor de verheffing van het grondgetal 'number1' tot een willekeurige macht, het exponent 'number2'
	 */
	
	public static int exponentiation(int number1, int number2) {
		// HINT: multiply???
		int antwoord = 0;
		for(int i = 1; i< number2; i++) {
			if (i == 1) {
				antwoord = multiply(number1, number1);
			}else {
				antwoord = multiply(antwoord, number1);
			}
	
		}
		return antwoord;
	}
	
	

}
