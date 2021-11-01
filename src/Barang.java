import java.util.ArrayList;

public class Barang 
{
	String idBarang;
	String namaBarang;
	String deskripsiBarang;
	float ukuranBarang;
	float hargaBarang;
	int jumlahBarang = 0;
	ArrayList<Barang> list = new ArrayList<Barang>();
	
	public Barang(String idBarang, String namaBarang, String deskripsiBarang, float ukuranBarang, float hargaBarang) 
	{
		this.idBarang = idBarang;
		this.namaBarang = namaBarang;
		this.deskripsiBarang = deskripsiBarang;
		this.ukuranBarang = ukuranBarang;
		this.hargaBarang = hargaBarang;
	}
	
	public Barang()
	{
		//Constructor
	}
	
	public void simpanData(String idBarang, String namaBarang, String deskripsiBarang, float ukuranBarang, float hargaBarang)
	{
		list.add(new Barang(idBarang, namaBarang, deskripsiBarang, ukuranBarang, hargaBarang));
		tambahBarang();
		System.out.println("The product and details have been saved");
	}
	
	public void queryPencarianBarang(String nama)
	{
		int flag = 0;
		for(Barang i : list)
		{
			if(i.getNamaBarang().indexOf(nama) != -1)
			{
				System.out.println("\n The result found for these keywords\n"+i);
				flag = 1;
			}
		}
		
		if(flag == 0 )
		{
			System.out.println("Sorry, the keywords seems doesn't match any product.");
		}
	}
	
	public void queryDetailBarang(String tIdBarang)
	{
		int flag = 0;
		for(Barang i : list)
		{
			if(list.stream().filter(o -> i.getIdBarang().equals(tIdBarang)).findFirst().isPresent())
			{
				System.out.println("\nDeskripsi Barang : " + i.getDeskripsiBarang());
				flag = 1;
			}
		}
		
		if(flag == 0)
		{
			System.out.println("\nThere's no product matches the ID");
		}
	}
	
	public void tambahBarang()
	{
		jumlahBarang = jumlahBarang + 1;
	}

	public String getIdBarang() {
		return idBarang;
	}

	public void setIdBarang(String idBarang) {
		this.idBarang = idBarang;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public String getDeskripsiBarang() {
		return deskripsiBarang;
	}

	public void setDeskripsiBarang(String deskripsiBarang) {
		this.deskripsiBarang = deskripsiBarang;
	}

	public float getUkuranBarang() {
		return ukuranBarang;
	}

	public void setUkuranBarang(float ukuranBarang) {
		this.ukuranBarang = ukuranBarang;
	}

	public float getHargaBarang() {
		return hargaBarang;
	}

	public void setHargaBarang(float hargaBarang) {
		this.hargaBarang = hargaBarang;
	}
	
	public ArrayList<Barang> getList()
	{
		return list;
	}

	@Override
	public String toString() {
		return "\nBarang\nidBarang :" + idBarang + "\nnamaBarang :" + namaBarang + "\ndeskripsiBarang :" + deskripsiBarang
				+ "\nukuranBarang :" + ukuranBarang + "\nhargaBarang :" + hargaBarang;
	}
}
