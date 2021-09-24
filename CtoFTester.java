// The functions should have temperatures as parameters. The type should be double. The functions should return the temperature as Celsius if the temperature is in Fahrenheit, and in Fahrenheit if the temperature is in Celsius.
public class CtoFTester {
	public static void celsiusToFahrenheit(double a){
		System.out.println ( ( a * 1.8 ) + 32.0);
	}
	public static void fahrenheitToCelcius(double b){
		System.out.println (( b - 32.0 ) * ( 5.0 / 9.0 ));
	}
	public static void main(String[] args) {
		celsiusToFahrenheit(100.0);
		fahrenheitToCelcius(100.0);
	}
}