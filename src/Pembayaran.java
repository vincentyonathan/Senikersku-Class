import java.awt.Image;
import java.time.LocalDate;
import java.util.Date;

public class Pembayaran 
{
	String idPembayaran;
	String idPembelian;
	String metodePembayaran;
	LocalDate tanggalPembayaran;
	float totalPembayaran;
	String buktiPembayaran;
	int banyakPembayaran = 0;
	
	public Pembayaran(String idPembayaran, String idPembelian, String metodePembayaran, LocalDate tanggalPembayaran2,
			float totalPembayaran, String buktiPembayaran) 
	{
		this.idPembayaran = idPembayaran;
		this.idPembelian = idPembelian;
		this.metodePembayaran = metodePembayaran;
		this.tanggalPembayaran = tanggalPembayaran2;
		this.totalPembayaran = totalPembayaran;
		this.buktiPembayaran = buktiPembayaran;
	}
	
	public Pembayaran()
	{
		
	}
	
	//Implemented Class
	public void simpanFormPembayaran(String idPembayaran, String idPembelian, String metodePembayaran, LocalDate tanggalPembayaran,
			float totalPembayaran, String buktiPembayaran)
	{
		Pembayaran C = new Pembayaran(idPembayaran, idPembelian, metodePembayaran, 
				tanggalPembayaran, totalPembayaran, buktiPembayaran);
		System.out.println(C.toString());
		System.out.println("New Form Added\n");
	}
	
	public void tambahkanPembayaranBerhasil()
	{
		banyakPembayaran = banyakPembayaran + 1;
	}
	
	//Getter and Setter
	
	public String getIdPembayaran() 
	{
		return idPembayaran;
	}
	
	public int getBanyakPembayaran() {
		return banyakPembayaran;
	}

	public void setBanyakPembayaran(int banyakPembayaran) {
		this.banyakPembayaran = banyakPembayaran;
	}

	public void setIdPembayaran(String idPembayaran) 
	{
		this.idPembayaran = idPembayaran;
	}
	
	public String getIdPembelian() 
	{
		return idPembelian;
	}
	
	public void setIdPembelian(String idPembelian) 
	{
		this.idPembelian = idPembelian;
	}
	
	public String getMetodePembayaran() 
	{
		return metodePembayaran;
	}
	
	public void setMetodePembayaran(String metodePembayaran) 
	{
		this.metodePembayaran = metodePembayaran;
	}
	
	public LocalDate getTanggalPembayaran() 
	{
		return tanggalPembayaran;
	}
	
	public void setTanggalPembayaran(LocalDate tanggalPembayaran) 
	{
		this.tanggalPembayaran = tanggalPembayaran;
	}
	
	public float getTotalPembayaran() 
	{
		return totalPembayaran;
	}
	
	public void setTotalPembayaran(float totalPembayaran) 
	{
		this.totalPembayaran = totalPembayaran;
	}
	
	public String getBuktiPembayaran() 
	{
		return buktiPembayaran;
	}
	public void setBuktiPembayaran(String buktiPembayaran) 
	{
		this.buktiPembayaran = buktiPembayaran;
	}

	@Override
	public String toString() {
		return "Pembayaran\nidPembayaran : " + idPembayaran + "\nidPembelian : " + idPembelian + "\nmetodePembayaran : "
				+ metodePembayaran + "\ntanggalPembayaran : " + tanggalPembayaran + "\ntotalPembayaran : " + totalPembayaran
				+ "\nbuktiPembayaran : " + buktiPembayaran;
	}
	
}
