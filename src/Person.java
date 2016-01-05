
import java.util.GregorianCalendar;
public class Person 
{
	
	protected String name;
	protected String spitzname;
	protected String adresse;
	protected String telnr;
	protected GregorianCalendar birthday;
	
	public Person(String name, String spitzname, String adresse, String telnr, int day, int month, int year)
	{
		this.name = name;
		this.spitzname = spitzname;
		this.adresse = adresse;
		this.telnr = telnr;
		this.birthday = new GregorianCalendar(day, month, year);
	}
	
	public boolean equals(Person person)
	{
		if(name.equals(person.name) && this.hashCode() == person.hashCode())
		{
			return true;
		}
		else
			return false;
	}
	

	public String getName() {
		return name;
	}

	public String getSpitzname() {
		return spitzname;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getTelnr() {
		return telnr;
	}

	public GregorianCalendar getBirthday(){
		return birthday;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", spitzname=" + spitzname + ", adresse=" + adresse + ", telnr=" + telnr + ", birthday=" + birthday + "]";
	}

}
