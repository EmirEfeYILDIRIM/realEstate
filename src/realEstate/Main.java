package realEstate;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<City> cities = new ArrayList<>();
		cities.add(new City("Bolu", "Türkiye", 80000));
		cities.add(new City("Ankara", "Türkiye", 150000));
		cities.add(new City("İstanbul", "Türkiye", 800000));
		cities.add(new City("Antalya", "Türkiye", 120000));
		cities.add(new City("Konya", "Türkiye", 100000));
		ArrayList<Location> locations = new ArrayList<>();
		locations.add(new Location(cities.get(0), "Merkez", "Borazanlar"));
		locations.add(new Location(cities.get(1), "Nallıhan", "Atatürk"));
		locations.add(new Location(cities.get(2), "Beşiktaş", "Akpınar"));
		locations.add(new Location(cities.get(3), "Alanya", "Alpınar"));
		locations.add(new Location(cities.get(4), "Galatasaray", "Yeniköy"));
		ArrayList<Category> category = new ArrayList<>();
		category.add(new Category("Akpınar Apartmanı", "akpinarap.png"));
		category.add(new Category("Sultan Apartmanı", "sultanap.png"));
		category.add(new Category("Beşiktaş Boş Arsa", "boşarsa.png"));
		category.add(new Category("Yıldırım Apartmanı", "yildirimap.png"));
		category.add(new Category("Galtasay Boş Arsa", "aboşarsa.png"));
		ArrayList<EstateAgent> estateagents = new ArrayList<>();
		estateagents
				.add(new EstateAgent("Uğur Emlak", locations.get(0), "uğurlogo.png", "05748749635", "uğur@gmail.com"));
		estateagents.add(
				new EstateAgent("Talha Emlak", locations.get(1), "talhalogo.png", "05187536598", "talh@gmail.com"));
		estateagents.add(
				new EstateAgent("Burak Emlak", locations.get(2), "buraklogo.png", "05362489878", "bura@gmail.com"));
		ArrayList<Advert> adverts = new ArrayList<>();
		adverts.add(new Advert("Bolu merkezde tertemiz bir ev", "Satılık Ev", "22.12.2022", "Satılık", category.get(0),
				250000, 125, locations.get(0), estateagents.get(0), "boluev.png", true));
		adverts.add(new Advert("Ankara Nallıhanda  tertemiz bir ev", "Kiralık Ev", "22.12.2012", "Kiralık",
				category.get(1), 10000, 200, locations.get(1), estateagents.get(1), "ankaraev.png", false));
		adverts.add(new Advert("İstanbul Beşiktaşda temiz boş arsa", "Satılık Ev", "22.12.2022", "Satılık",
				category.get(0), 250000, 125, locations.get(2), estateagents.get(2), "istanbularsa.png", true));
		adverts.add(new Advert("Bolu Merkezde tertemiz bir ev", "Satılık Ev", "22.12.2021", "Satılık", category.get(0),
				22000, 120, locations.get(0), estateagents.get(0), "boluev2.png", true));
		adverts.add(new Advert("Antalya alanyada boş bir ev", "Satılık Ev", "22.12.2020", "Satılık", category.get(0),
				200000, 150, locations.get(3), estateagents.get(1), "antalyaev.png", false));
		adverts.add(new Advert("Konya Galatasayda tertemiz bir arsa", "Satılık Ev", "22.12.2022", "Satılık",
				category.get(4), 1500000, 1000, locations.get(4), estateagents.get(2), "boluev.png", false));
		adverts.add(new Advert("Antalya alanyada tertemiz bir ev", "Kirakla Ev", "22.12.2019", "Satılık",
				category.get(3), 950, 100, locations.get(3), estateagents.get(1), "boluev.png", true));
		adverts.add(new Advert("İstanbul beşiktaşda sıfır  bir ev", "Satılık Ev", "22.12.2022", "Satılık",
				category.get(2), 450000, 145, locations.get(2), estateagents.get(0), "istanbulev.png", true));
		
		for (Advert advert : adverts) {
			System.out.println("<---" + advert.getLocation().getCity().getName() + "--->");
			System.out.println("Açıklama: " + advert.getPropert());
			System.out.println("İlan Tarihi: " + advert.getAdvertDate());
			System.out.println("İlan Tipi: " + advert.getAdvertType());
			System.out.println("Konut: " + advert.getCategory().getName());
			System.out.println("Konut Logo: " + advert.getCategory().getLogo());
			System.out.println("Fiyat: " + advert.getPrice());
			System.out.println("Yüz Ölçümü: " + advert.getArea());
			System.out.println("Ülke: " + advert.getLocation().getCity().getCountry());
			System.out.println("İl: " + advert.getLocation().getCity().getName());
			System.out.println("Şehir Nüfusu: " + advert.getLocation().getCity().getPopulation());
			System.out.println("İlçe: " + advert.getLocation().getDistrict() + " İlçesi");
			System.out.println("Mahalle: " + advert.getLocation().getNeighbourhood() + " Mahallesi");
			System.out.println("Resim: " + advert.getPhoto());
			System.out.println("<--Emlakçı Bilgileri-->");
			System.out.println("İsmi: " + advert.getEstateagent().getName());
			System.out.println("İl: " + advert.getEstateagent().getLocation().getCity().getName() );
			System.out.println("İlçe: "+advert.getEstateagent().getLocation().getDistrict()+" İlçesi");
			System.out.println("Mahalle: "+advert.getEstateagent().getLocation().getNeighbourhood()+" Mahallesi");
			System.out.println("Logo: " + advert.getEstateagent().getLogo());
			System.out.println("Telefon No: " + advert.getEstateagent().getPhone());
			System.out.println("Mail Adresi: " + advert.getEstateagent().getMail());
			System.out.println("<--İlan Yayındamı?-->");
			System.out.println(advert.isActive()?"Evet":"Hayır");

		}
	}

}
