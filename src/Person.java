
public class Person 
{
	
	protected String name;
	protected String spitzname;
	protected Adresse adresse;
	protected int telnr;
	protected int day;
	protected int month;
	protected int year;
	
	public Person(String name, String spitzname, Adresse adresse, int telnr, int day, int month, int year)
	{
		this.name = name;
		this.spitzname = spitzname;
		this.adresse = adresse;
		this.telnr = telnr;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean equals(Person person)
	{
		if(name.equals(person.name) && telnr == person.telnr)
		{
			return true;
		}
		else
			return false;
	}
	//Hier bin ich!
	public int hashCode()
	{
		return 0;
	}

}
