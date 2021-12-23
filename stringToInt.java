public static int stringToInt(String s){
  //return the value of Integer.parseInt(s) but do it yourself!
  //Do not use any built in parse methods.
  public int valueOfDigit(char c){
    return (int)c;
  }
  public static void main (String[] args){
    int ans = -1;
    for (int i = 0; i < args[0].length(); i++){
      digit = args[0][i];
      ans += (int)digit * Math.pow(10, args[0].length() - 1);
    }
  }
}
