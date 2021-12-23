public class parseInt{
  public int valueOfDigit(char c){
    return (int)c;
  }
  public static int stringToInt(String s){
    //return the value of Integer.parseInt(s) but do it yourself!
    //Do not use any built in parse methods.
    int ans = 0;
    for (int i = 0; i < s.length(); i++){
      int digit = s.charAt(i);
      ans += (((int)digit) * Math.pow(10, s.length() - i - 1));
    }
    return ans;
  }
  public static void main (String[] args){
    String tester = "9123";
    System.out.println(stringToInt(tester));
  }
}
