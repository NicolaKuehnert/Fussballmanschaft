
public class Adresse 
{
	protected String stra�e;
	protected int nr;
	protected int plz;
	protected String ort;
	
	public Adresse(String stra�e, int nr, int plz, String ort)
	{
		this.stra�e = stra�e;
		this.nr = nr;
		this.plz = plz;
		this.ort = ort;
	}
	
	public String get()
	{
		return stra�e + " " + nr + ", " + plz + " " + ort;
	}

}
