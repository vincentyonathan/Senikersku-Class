import java.time.LocalDate;
import java.util.Date;

public class maintest 
{
	public static void main(String[] args) 
	{
			Pembayaran test1 = new Pembayaran();
			LocalDate d = LocalDate.of(2020, 1, 8);
			test1.simpanFormPembayaran("XA11", "A01", "TRANSFER BCA", d , 950000f, "DONE");
			test1.tambahkanPembayaranBerhasil();
			test1.simpanFormPembayaran("XA12", "A02", "TRANSFER MANDIRI", d.now(), 250000f, "NOT YET");
			System.out.println("\n\nTotal Transaksi Berhasil adalah "+ test1.getBanyakPembayaran());
			
			System.out.println("------------------");
			
			Pembelian test2 = new Pembelian();
			test2.simpanStatusPemesanan("BE12", "A01", "UW11", "Jordan 1 Bred", 1, d, 'Y');
			test2.simpanStatusPemesanan("BE19", "A01", "UW17", "Jordan 4 Bred", 1, d, 'Y');
			test2.simpanStatusPemesanan("BE22", "A01", "UW50", "Air Yeezy", 1, d, 'Y');
			test2.simpanStatusPemesanan("BE27", "A01", "UW65", "Yeezy Boost 350", 2, d, 'Y');
			test2.simpanStatusPemesanan("BE30", "A01", "UK12", "Vans Old Skool", 3, d.now(), 'N');
			test2.simpanStatusPemesanan("BE1", "A02", "UW9", "Jordan 1 Orange", 1, d, 'Y');
			test2.simpanStatusPemesanan("BE2", "A04", "U1", "Airforce 1", 2, d, 'Y');
//			System.out.println(test2.checkSize()); 
			
			test2.ambilTampilanRiwayat("A03");
			
			System.out.println("------------------");
			
			Barang test3 = new Barang();
			test3.simpanData("AAA1", "El Poco Loco", "EL Poco Loco Es Santos del Primo", 43, 234.500f );
			test3.simpanData("AAA2", "El Poco Loco2", "EL Poco Loco Es Santos del Primo", 43, 234.500f );
			test3.simpanData("AAA3", "El Poco Loco3", "EL Poco Loco Es Santos del Primo", 43, 234.500f );
			test3.simpanData("AAA4", "El Poco Loco4", "EL Poco Loco Es Santos del Primo", 43, 234.500f );
			test3.queryPencarianBarang("El Poco Loco");
			test3.queryDetailBarang("AAA1");
			
			System.out.println("------------------");
			
			LacakBarang test4 = new LacakBarang();
			test4.LacakBarangPembelian(test2.getList());
			test4.setLacakBarang("BE12", "UW11", "In Progress");
			test4.setLacakBarang("BE19", "UW10", "Not yet delivered");
			test4.queryLacakBarang("UW11");
			
			System.out.println("------------------");
			
			KeranjangBelanja test5 = new KeranjangBelanja();
			test5.tambahKeranjangBelanja("AAA1", "User001", "El Polo Loco", 1, 254.54f, 1);
			test5.queryKeranjangBelanja("User001");
			
			System.out.println("------------------");
			
			UlasanBarang test6 = new UlasanBarang();
			test6.UlasanBarang2(test3.getList());
			test6.simpanForm("UB-001", "AAA91", d.now(), "Barangnya luar biasa, mantap sekali, cuma kurang banyak aja, masa dateng sebelah doang");
			test6.ambilUlasanBarang("AAA2");
			
			System.out.println("------------------");
			Wishlist test7 = new Wishlist();
			test7.addToWishlist("AAA1", "User001", "Kenzo Hat", 1, 1550000f);
			
			System.out.println("------------------");
			Pembeli test8 = new Pembeli();
			test8.buatAkunBaru("User001", "akubcd@gmail.com", "abcd1234", "Joko", "Jalan Burbolinggo No 123", "0899212412431");
			test8.lihatDetailPembeli("User001");
	}

}
