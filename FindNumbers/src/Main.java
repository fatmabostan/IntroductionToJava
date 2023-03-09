
public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int isThere = 12;
		boolean found = false;
		
		for(int num:numbers)
		{
			if(isThere==num)
				found = true;		
		}
		
		if(found)
			System.out.println("Number found in array!");
		else
			System.out.println("There is no number like this!");
	}

}
