
public class Main {

	public static void main(String[] args) {
		int number = 121;
		
		if(number<=1)
			System.out.println("This number cannot be prime!");
		
		else if(number==2)
			System.out.println("This number is prime!");
		
		else
		{
			int i=2;
			while(i<number)
			{
				if(number%i==0)
				{
					System.out.println("This number is not prime!");
					break;
				}
				
				else
					i++;
			}
			
			if(i>=number)
				System.out.println("This number is prime!");
		}
	}
}
