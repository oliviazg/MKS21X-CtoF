public class parseInt{
  public int valueOfDigit(char c){
    return (int)c;
  }
  public static int stringToInt(String s){
    //return the value of Integer.parseInt(s) but do it yourself!
    //Do not use any built in parse methods.
    int ans = -1;
    for (int i = 0; i < s.length(); i++){
      digit = se[i];
      ans += (int)digit * Math.pow(10, s.length() - 1);
  }
  public static void main (String[] args){
    String tester = "9123";
    System.out.println(stringToInt(tester));
  }
}
