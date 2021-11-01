import java.util.ArrayList;

public class Wishlist
{
	public String idBarang;
	public String idPembeli;
	public String namaBarang;
	public int stokBarang;
	public float ukuranBarang;
	ArrayList<Wishlist> arr = new ArrayList<Wishlist>();
	
	public Wishlist(String idBarang, String idPembeli, String namaBarang, int stockBarang, float ukuranBarang) {
		this.idBarang = idBarang;
		this.idPembeli = idPembeli;
		this.namaBarang = namaBarang;
		this.stokBarang = stockBarang;
		this.ukuranBarang = ukuranBarang;
	}
	
	public Wishlist()
	{
		//Constructor
	}
	
	public void addToWishlist(String idBarang, String idPembeli, String namaBarang, int stokBarang, float ukuranBarang) 
	{
		arr.add(new Wishlist(idBarang,idPembeli,namaBarang,stokBarang,ukuranBarang));
		System.out.println("Product successfully added to your wishlist.");
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

	public int getStokBarang() {
		return stokBarang;
	}

	public void setStokBarang(int stokBarang) {
		this.stokBarang = stokBarang;
	}

	public float getUkuranBarang() {
		return ukuranBarang;
	}

	public void setUkuranBarang(float ukuranBarang) {
		this.ukuranBarang = ukuranBarang;
	}

	@Override
	public String toString() {
		return "\nWishlist\nidBarang : " + idBarang + ", idPembeli : " + idPembeli + ", namaBarang : " + namaBarang
				+ ", stokBarang : " + stokBarang + ", ukuranBarang : " + ukuranBarang;
	}
	
	

}
