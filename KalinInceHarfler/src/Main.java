
public class Main {

	public static void main(String[] args) {
		char krk = 'E';
		char karakter = Character.toLowerCase(krk);
		char[] kalinUnlu = {'a', 'ı', 'o', 'u'};
		char[] inceUnlu = {'e', 'i', 'ö', 'ü'};
		boolean iceriyorMu = false;
		
		for(char sirala:kalinUnlu)
		{
			if(sirala==karakter)
				{
				System.out.println("Kalın Ünlü Girdiniz!");	
				iceriyorMu = true;
				}
		}
		
		for(char sirala:inceUnlu)
		{
			if(sirala==karakter)
				{
				System.out.println("İnce Ünlü Girdiniz!");	
				iceriyorMu = true;
				}
		}
			
		if(iceriyorMu==false)
			System.out.println("Ünsüz harf ya da işaret girdiniz!");
	}
}
