package realEstate;

public class Advert {
	private String propert;
	private String name;
	private String advertDate;
	private String advertType;
	private Category category;
	private int price;
	private double area;
	private Location location;
	private EstateAgent estateagent;
	private String photo;
	private boolean isActive;
	public Advert() {
		super();
	}
	public Advert(String propert, String name, String advertDate, String advertType, int price, double area,
			String photo, boolean isActive) {
		super();
		this.propert = propert;
		this.name = name;
		this.advertDate = advertDate;
		this.advertType = advertType;
		this.price = price;
		this.area = area;
		this.photo = photo;
		this.isActive = isActive;
	}
	public Advert(String propert, String name, String advertDate, String advertType, Category category, int price,
			double area, Location location, EstateAgent estateagent, String photo, boolean isActive) {
		super();
		this.propert = propert;
		this.name = name;
		this.advertDate = advertDate;
		this.advertType = advertType;
		this.category = category;
		this.price = price;
		this.area = area;
		this.location = location;
		this.estateagent = estateagent;
		this.photo = photo;
		this.isActive = isActive;
	}
	public String getPropert() {
		return propert;
	}
	public void setPropert(String propert) {
		this.propert = propert;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdvertDate() {
		return advertDate;
	}
	public void setAdvertDate(String advertDate) {
		this.advertDate = advertDate;
	}
	public String getAdvertType() {
		return advertType;
	}
	public void setAdvertType(String advertType) {
		this.advertType = advertType;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public EstateAgent getEstateagent() {
		return estateagent;
	}
	public void setEstateagent(EstateAgent estateagent) {
		this.estateagent = estateagent;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public void printisActive() {
		System.out.println(this.isActive?"Evet":"Hayır");
	}
}
