import java.util.ArrayList;

public class Pembeli 
{
	public String idPembeli;
	public String emailPembeli;
	public String password;
	public String namaPembeli;
	public String alamatPembeli;
	public String noTelepon;
	ArrayList<Pembeli> arrp = new ArrayList<Pembeli>();
	ArrayList<Pembeli> arrfix = new ArrayList<Pembeli>();
	
	public Pembeli(String idPembeli, String emailPembeli, String password, String namaPembeli, String alamatPembeli,
			String noTelepon) 
	{
		this.idPembeli = idPembeli;
		this.emailPembeli = emailPembeli;
		this.password = password;
		this.namaPembeli = namaPembeli;
		this.alamatPembeli = alamatPembeli;
		this.noTelepon = noTelepon;
	}
	
	public Pembeli() 
	{
		// Constructor
	}

	public void buatAkunBaru(String idPembeli, String emailPembeli, String password, String namaPembeli, String alamatPembeli,
			String noTelepon)
	{
		if(!emailPembeli.isEmpty() && !idPembeli.isEmpty() && !password.isEmpty() && !namaPembeli.isEmpty() && !alamatPembeli.isEmpty() )
		{
			simpanDataPembeli(idPembeli, emailPembeli, password, namaPembeli, alamatPembeli,noTelepon);
		}
	}
	
	public void simpanDataPembeli(String idPembeli, String emailPembeli, String password, String namaPembeli, String alamatPembeli,
			String noTelepon)
	{
		arrp.add(new Pembeli(idPembeli, emailPembeli, password, namaPembeli, alamatPembeli,noTelepon));
		System.out.println("Account Successfully Created");
	}
	
	public void lihatDetailPembeli(String tIdPembeli)
	{
		int flag = 0;
		for(Pembeli i : arrp) 
		{
			if(arrp.stream().filter(o -> i.getIdPembeli().equals(tIdPembeli)).findFirst().isPresent()) 
			{
				System.out.println(i);
				flag = 1;
			}
		}
		if(flag == 0)
		{
			System.out.println("No User with this Id Exist");
		}
	}
	
	public String getIdPembeli() {
		return idPembeli;
	}

	public void setIdPembeli(String idPembeli) {
		this.idPembeli = idPembeli;
	}

	public String getEmailPembeli() {
		return emailPembeli;
	}

	public void setEmailPembeli(String emailPembeli) {
		this.emailPembeli = emailPembeli;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNamaPembeli() {
		return namaPembeli;
	}

	public void setNamaPembeli(String namaPembeli) {
		this.namaPembeli = namaPembeli;
	}

	public String getAlamatPembeli() {
		return alamatPembeli;
	}

	public void setAlamatPembeli(String alamatPembeli) {
		this.alamatPembeli = alamatPembeli;
	}

	public String getNoTelepon() {
		return noTelepon;
	}

	public void setNoTelepon(String noTelepon) {
		this.noTelepon = noTelepon;
	}

	@Override
	public String toString() {
		return "\nPembeli\nidPembeli : " + idPembeli + "\nemailPembeli : " + emailPembeli + "\npassword : " + password
				+ "\nnamaPembeli : " + namaPembeli + "\nalamatPembeli : " + alamatPembeli + "\nnoTelepon : " + noTelepon;
	}
}
