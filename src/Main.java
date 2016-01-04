
public class Main {

	public static void main(String[] args) 
	{
		Person[] listePersonen = new Person[5];
		Adresse adresse = new Adresse("Musterstraße", 13, 1337, "Musterstadt");
		listePersonen[0] = new Person("Klaus Müller", "Klausi", adresse, 01371234567, 10, 5, 1980);
		listePersonen[1] = new Person("Kevin Müller", "Kev", adresse, 01371234567, 20, 7, 1986);
		listePersonen[2] = new Person("Kevin Müller", "Mucki", adresse, 01371234567, 20, 7, 1986);
		
		System.out.println(listePersonen[0].equals(listePersonen[1]));
		System.out.println(listePersonen[1].equals(listePersonen[2]));

	}

}
