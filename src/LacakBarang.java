import java.util.ArrayList;

public class LacakBarang 
{
	public String idPengiriman;
	public String idPembelian;
	String statusPengiriman;
	ArrayList<Pembelian> arr = new ArrayList<Pembelian>();
	ArrayList<LacakBarang> list = new ArrayList<LacakBarang>();
	
	
	
	public LacakBarang(String idPengiriman, String idPembelian, String statusPengiriman) {
		this.idPengiriman = idPengiriman;
		this.idPembelian = idPembelian;
		this.statusPengiriman = statusPengiriman;
	}
	
	public void LacakBarangPembelian(ArrayList<Pembelian> zzz)
	{
		this.arr = zzz;
	}
	
	public LacakBarang()
	{
		//Constructor
	}

	public void setLacakBarang(String tIdPembelian, String tIdPengiriman, String zstatusPengiriman)
	{
		int flag = 0;
		for(Pembelian i : arr )
		{
			if(arr.stream().filter(o -> i.getIdPembelian().equals(tIdPembelian)).findFirst().isPresent()
					&& arr.stream().filter(o -> i.getIdPengiriman().equals(tIdPengiriman)).findFirst().isPresent() )
		      {
		    	  list.add(new LacakBarang(tIdPengiriman, tIdPembelian, zstatusPengiriman));
				  System.out.println("\nLacakBarang \nBuying and Delivery ID found, New data sets successfully.");
		    	  flag = 1;
		      }
		}
		if(flag == 0)
		{
			System.out.println("\nBuying ID or Delivery Is is not found in Buying Database.");
		}
	}

	public void queryLacakBarang (String tIdPengiriman)
	{
		int flag = 0;
		for(LacakBarang i : list )
		{
			if(list.stream().filter(o -> i.getIdPengiriman().equals(tIdPengiriman)).findFirst().isPresent())
		      {
		    	  System.out.println("\nDelivery Status is " + i.getStatusPengiriman());
		    	  flag = 1;
		      }
		}
		if(flag == 0)
		{
			System.out.println("\nDelivery Status not found.");
		}
	}
	
	public String getIdPengiriman() {
		return idPengiriman;
	}
	public void setIdPengiriman(String idPengiriman) {
		this.idPengiriman = idPengiriman;
	}
	public String getIdPembelian() {
		return idPembelian;
	}
	public void setIdPembelian(String idPembelian) {
		this.idPembelian = idPembelian;
	}
	public String getStatusPengiriman() {
		return statusPengiriman;
	}
	public void setStatusPengiriman(String statusPengiriman) {
		this.statusPengiriman = statusPengiriman;
	}

	@Override
	public String toString() {
		return "\nLacakBarang\nidPengiriman=" + idPengiriman + "\nidPembelian=" + idPembelian + "\nstatusPengiriman="
				+ statusPengiriman;
	}	
	
}
