
public class Adresse 
{
	protected String straﬂe;
	protected int nr;
	protected int plz;
	protected String ort;
	
	public Adresse(String straﬂe, int nr, int plz, String ort)
	{
		this.straﬂe = straﬂe;
		this.nr = nr;
		this.plz = plz;
		this.ort = ort;
	}
	
	public String get()
	{
		return straﬂe + " " + nr + ", " + plz + " " + ort;
	}

}
