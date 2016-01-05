
public class Main {

	public static void main(String[] args) 
	{
		Liste list = new Liste();
		
		list.sortName();
		System.out.println("Liste nach Name:\n\n");
		list.printListe();
		
		list.sortSpitz();
		System.out.println("Liste nach Spitzname:\n\n");
		list.printListe();
		
		list.sortBirthday();
		System.out.println("Liste nach Geburtstag:\n\n");
		list.printListe();
		
		list.sortTele();
		System.out.println("Liste nach Telefonnummer:\n\n");
		list.printListe();
		

	}

}
