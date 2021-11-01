import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


public class Pembelian
{
	String idPembelian;
	String idPembeli;
	String idPengiriman;
	String namaBarang;
	int kuantitas;
	LocalDate tanggalBeli;
	char statusPembelian;
	int totalpembelian = 0;
	ArrayList<Pembelian> arr = new ArrayList<Pembelian>();
	
	public Pembelian(String idPembelian, String idPembeli, String idPengiriman, String namaBarang, int kuantitas,
			LocalDate tanggalBeli, char statusPembelian) 
	{
		this.idPembelian = idPembelian;
		this.idPembeli = idPembeli;
		this.idPengiriman = idPengiriman;
		this.namaBarang = namaBarang;
		this.kuantitas = kuantitas;
		this.tanggalBeli = tanggalBeli;
		this.statusPembelian = statusPembelian;
	}
	
	public Pembelian()
	{
		//Constructor
	}

	//Implemented class
	public void simpanStatusPemesanan(String idPembelian, String idPembeli, String idPengiriman, String namaBarang, int kuantitas,
			LocalDate d, char statusPembelian)
	{
		arr.add(new Pembelian(idPembelian, idPembeli, idPengiriman, namaBarang, kuantitas, d, statusPembelian));
		perbaruiPembelian();
		System.out.println("Data Added Successfully.");
	}
	
	public void perbaruiPembelian()
	{
		totalpembelian = totalpembelian + 1;
	}
	
	public void queryRiwayatPembelian(String tIdPembeli)
	{
		int flag = 0;
		 for (Pembelian i : arr) 
		 {
		      if(arr.stream().filter(o -> i.getIdPembeli().equals(tIdPembeli)).findFirst().isPresent())
		      {
		    	  System.out.println(i);
		    	  flag = 1;
		      }
		 }
		 if(flag == 0)
		 {
			 System.out.println("You currently have no Purchase History, Come and Shop with us!\n");
		 }
	}

	public void ambilTampilanRiwayat(String tIdPembeli)
	{
		if(tIdPembeli != null && !tIdPembeli.isEmpty())
		{
			queryRiwayatPembelian(tIdPembeli);
		}
		else
		{
			System.out.println("You haven't entered the buyer ID or it's invalid, please try again\n");
		}
	}
	
	public boolean queryStatus(String tIdPembeli, String tIdPengiriman)
	{
		int flag = 0;
		 for (Pembelian i : arr) 
		 {
		      if(arr.stream().filter(o -> i.getIdPembeli().equals(tIdPembeli)).findFirst().isPresent() 
		    		  && arr.stream().filter(o -> i.getIdPembeli().equals(tIdPengiriman)).findFirst().isPresent())
		      {
		    	  flag = 1;
		      }
		 }
		 if(flag == 0)
		 {
			 return false;
		 }
		 else
		 {
			 return true;
		 }
	}
	
	//Getter and Setter
	public String getIdPembelian() 
	{
		return idPembelian;
	}
	public void setIdPembelian(String idPembelian) 
	{
		this.idPembelian = idPembelian;
	}
	public String getIdPembeli() 
	{
		return idPembeli;
	}
	public void setIdPembeli(String idPembeli) 
	{
		this.idPembeli = idPembeli;
	}
	public String getIdPengiriman() 
	{
		return idPengiriman;
	}
	public void setIdPengiriman(String idPengiriman) 
	{
		this.idPengiriman = idPengiriman;
	}
	public String getNamaBarang() 
	{
		return namaBarang;
	}
	public void setNamaBarang(String namaBarang) 
	{
		this.namaBarang = namaBarang;
	}
	public int getKuantitas() 
	{
		return kuantitas;
	}
	public void setKuantitas(int kuantitas) 
	{
		this.kuantitas = kuantitas;
	}
	public LocalDate getTanggalBeli() 
	{
		return tanggalBeli;
	}
	public void setTanggalBeli(LocalDate tanggalBeli) 
	{
		this.tanggalBeli = tanggalBeli;
	}
	public char getStatusPembelian() 
	{
		return statusPembelian;
	}
	public void setStatusPembelian(char statusPembelian) 
	{
		this.statusPembelian = statusPembelian;
	}
	
	public ArrayList<Pembelian> getList()
	{
		return arr;
	}

	@Override
	public String toString() {
		return "Pembelian\nidPembelian : " + idPembelian + "\nidPembeli : " + idPembeli + "\nidPengiriman : " + idPengiriman
				+ "\nnamaBarang : " + namaBarang + "\nkuantitas : " + kuantitas + "\ntanggalBeli : " + tanggalBeli
				+ "\nstatusPembelian : " + statusPembelian;
	}
	
}
