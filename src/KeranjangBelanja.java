import java.util.ArrayList;
public class KeranjangBelanja 
{
	private String idBarang;
	private String idPembeli;
	public String namaBarang;
	public int jumlahBarang;
	public float hargaBarang;
	public int totalBarang;
	ArrayList<KeranjangBelanja> arr = new ArrayList<KeranjangBelanja>();
	
	public KeranjangBelanja(String idBarang, String idPembeli, String namaBarang, int jumlahBarang, float hargaBarang, int totalBarang) 
	{
		this.idBarang = idBarang;
		this.idPembeli = idPembeli;
		this.namaBarang = namaBarang;
		this.jumlahBarang = jumlahBarang;
		this.hargaBarang = hargaBarang;
		this.totalBarang = totalBarang;
	}
	
	public KeranjangBelanja()
	{
		//Constructor
	}
	
	public void tambahKeranjangBelanja(String idBarang, String idPembeli, String namaBarang, int jumlahBarang, float hargaBarang, int totalBarang) 
	{
		arr.add(new KeranjangBelanja(idBarang, idPembeli, namaBarang, jumlahBarang, hargaBarang, totalBarang));
		jumlahBarang = jumlahBarang + 1;
		System.out.println("\nProduct successfully added to your shopping cart.");
	}
	
	public void queryKeranjangBelanja(String tIdPembeli) 
	{
		int flag = 0;
		for(KeranjangBelanja i : arr) 
		{
			if(arr.stream().filter(o -> i.getIdPembeli().equals(tIdPembeli)).findFirst().isPresent()) 
			{
				System.out.println(i);
				flag = 1;
			}
		}
		if(flag == 0)
		{
			System.out.println("Shopping Cart for this user is Empty");
		}
	}

	public String getIdBarang() {
		return idBarang;
	}

	public void setIdBarang(String idBarang) {
		this.idBarang = idBarang;
	}

	public String getIdPembeli() {
		return idPembeli;
	}

	public void setIdPembeli(String idPembeli) {
		this.idPembeli = idPembeli;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public int getJumlahBarang() {
		return jumlahBarang;
	}

	public void setJumlahBarang(int jumlahBarang) {
		this.jumlahBarang = jumlahBarang;
	}

	public float getHargaBarang() {
		return hargaBarang;
	}

	public void setHargaBarang(float hargaBarang) {
		this.hargaBarang = hargaBarang;
	}

	public int getTotalBarang() {
		return totalBarang;
	}

	public void setTotalBarang(int totalBarang) {
		this.totalBarang = totalBarang;
	}

	@Override
	public String toString() {
		return "\nKeranjangBelanja User\nidBarang : " + idBarang + "\nidPembeli : " + idPembeli + "\nnamaBarang : " + namaBarang
				+ "\njumlahBarang : " + jumlahBarang + "\nhargaBarang : " + hargaBarang + "\ntotalBarang : " + totalBarang;
	}

}