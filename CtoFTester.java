// The functions should have temperatures as parameters. The type should be double. The functions should return the temperature as Celsius if the temperature is in Fahrenheit, and in Fahrenheit if the temperature is in Celsius.
public class CtoFTester {
	public static double celsiusToFahrenheit(double a){
		return ( a * ( 9.0 / 5.0 ) ) + 32.0;
	}
	public static double fahrenheitToCelcius(double b){
		return ( b - 32.0 ) * ( 5.0 / 9.0 );
	}
	public static double main(String[] args) {
		celsiusToFahrenheit(100.0);
		fahrenheitToCelcius(100.0);
	}
}