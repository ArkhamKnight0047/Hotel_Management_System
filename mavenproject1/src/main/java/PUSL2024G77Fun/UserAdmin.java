package PUSL2024G77Fun;

public class UserAdmin {
	protected int id;
	protected String name;
	protected String email;
	protected String country;
        protected String payer_id;
	
	public UserAdmin() {
	}
	
	public UserAdmin(String name, String email, String country,String payer_id) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;
                this.payer_id =payer_id ;
	}

	public UserAdmin(int id, String name, String email, String country,String payer_id) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
                this.payer_id =payer_id ;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpayer_id() {
		return payer_id;
	}
	public void setpayer_id(String payer_id) {
		this.payer_id = payer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
