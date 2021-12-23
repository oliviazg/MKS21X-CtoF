public class parseInt{
  public static int stringToInt(String s){
    //return the value of Integer.parseInt(s) but do it yourself!
    //Do not use any built in parse methods.
    int ans = 0;
    for (int i = 0; i < s.length(); i++){
      int digit = (int)(s.charAt(i)) - 48;
      ans += (digit * Math.pow(10, s.length() - i - 1));
    }
    return ans;
  }
  public static void main (String[] args){
    System.out.println(stringToInt("12345"));
  }
}
