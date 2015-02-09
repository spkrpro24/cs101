
public class recurse {	
	public static void main(String[] args)	{		//using recursion
		recursive(99);
	}
	public static void recursive(int i)	{
		if (i > 0)	{
			System.out.print(i + " Bottles of beer on the wall ");
			System.out.print(i + "  Bottles of beer");
			System.out.print("ya' take one down, pass it around, ");
			System.out.print(i + " bottles of beer on the wall");
			System.out.println();	
			recursive(i - 1);
		}
	}
}
