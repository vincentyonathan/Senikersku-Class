import java.time.LocalDate;
import java.util.ArrayList;

public class UlasanBarang 
{
	public String idUlasan;
	public String idBarang;
	public LocalDate tglUlasan;
	public String ulasan;
	public ArrayList<Barang> arrb = new ArrayList<Barang>();
	public ArrayList<UlasanBarang> arrub = new ArrayList<UlasanBarang>();
	
	public UlasanBarang(String idUlasan, String idBarang, LocalDate tglUlasan, String ulasan) 
	{
		this.idUlasan = idUlasan;
		this.idBarang = idBarang;
		this.tglUlasan = tglUlasan;
		this.ulasan = ulasan;
	}
	
	public UlasanBarang()
	{
		//Constructor
	}
	
	public void UlasanBarang2(ArrayList<Barang> zzz)
	{
		this.arrb = zzz;
	}
	
	
	public void simpanForm(String idUlasan, String idBarang, LocalDate tglUlasan, String ulasan)
	{
		int flag = 0;
		for(Barang i : arrb )
		{
			if(arrb.stream().filter(o -> i.getIdBarang().equals(idBarang)).findFirst().isPresent())
		      {
					arrub.add(new UlasanBarang(idUlasan,idBarang,tglUlasan,ulasan));
					System.out.println("Product's Review Added Successfuly");
					flag = 1;
		      }
		}
		if(flag == 0)
		{
			System.out.println("Product's Review failed");
		}
	}
	
	public void ambilUlasanBarang(String tIdBarang)
	{
		int flag = 0;
		for(UlasanBarang i : arrub )
		{
			if(arrub.stream().filter(o -> i.getIdBarang().equals(tIdBarang)).findFirst().isPresent())
		      {
				  System.out.println(i);
		    	  flag = 1;
		      }
		}
		if(flag == 0)
		{
			System.out.println("Product's Review not found");
		}
	}

	public String getIdUlasan() {
		return idUlasan;
	}

	public void setIdUlasan(String idUlasan) {
		this.idUlasan = idUlasan;
	}

	public String getIdBarang() {
		return idBarang;
	}

	public void setIdBarang(String idBarang) {
		this.idBarang = idBarang;
	}

	public LocalDate getTglUlasan() {
		return tglUlasan;
	}

	public void setTglUlasan(LocalDate tglUlasan) {
		this.tglUlasan = tglUlasan;
	}

	public String getUlasan() {
		return ulasan;
	}

	public void setUlasan(String ulasan) {
		this.ulasan = ulasan;
	}

	@Override
	public String toString() {
		return "\nProduct's Review\nidUlasan : " + idUlasan + "\nidBarang : " + idBarang + "\ntglUlasan : " + tglUlasan
				+ "\nulasan : " + ulasan;
	}

}
