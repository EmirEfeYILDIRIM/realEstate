package realEstate;

public class EstateAgent {
	private String name;
	private Location location;
	private String logo;
	private String phone;
	private String mail;
	public EstateAgent() {
		super();
	}
	public EstateAgent(String name, String logo, String phone, String mail) {
		super();
		this.name = name;
		this.logo = logo;
		this.phone = phone;
		this.mail = mail;
	}
	public EstateAgent(String name, Location location, String logo, String phone, String mail) {
		super();
		this.name = name;
		this.location = location;
		this.logo = logo;
		this.phone = phone;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
