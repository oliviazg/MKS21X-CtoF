public class ArrayTest{
   public static void main(String[]args){
        int[] anArray = new int[11];
	for (int x = 0; x < 11; x++){
		anArray[x] = 100 + x * 10;
	}
        System.out.println("part 1:");
        System.out.print(anArray);
        System.out.println("part 2:");
        for (int y = 0; y < 11; y++){
		System.out.print(anArray[y] + " ");
	}
   }
}