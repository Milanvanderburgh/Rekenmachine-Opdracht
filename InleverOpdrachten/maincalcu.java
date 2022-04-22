package InleverOpdrachten;
public class maincalcu {
	public static void main(String[] args) {
		
	Calculator calc = new Calculator();
	
	System.out.println(calc.add(5, 9)); // deze doet +
	
	System.out.println(calc.subtract(8, 3)); // deze doet -
	
	System.out.println(calc.multiply(4, 4)); // deze doet vermenigvuldigen dus x
	
	System.out.println(calc.devide(25, 5)); // deze doet delen door :
	
	System.out.println(calc.square(7)); // Dit vermenigvuldigd zichzelf meerdere keren zoals dus bijvoorbeeld als je 3.3 hebt doe je 3+3+3
	
	System.out.println(calc.exponentiation(7, 7)); // machten woorden gebruikt
	
	}
}