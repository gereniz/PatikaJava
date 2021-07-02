package PatikaStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobilPhone{
	
	private int id;
	private double unitPrice;
	private double discountRate;
	private int qualityInStock;
	private String productName;
	private String brandName;
	private int ram;
	private double screenSize;
	private int memory;
	private int batteryPower;
	private String color;
	
	public MobilPhone(int id, double unitPrice, double discountRate, int qualityInStock,
			String productName, String brandName, int ram, double screenSize, int memory, int batteryPower,
			String color) {
		super();
		this.id = id;
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
		this.qualityInStock = qualityInStock;
		this.productName = productName;
		this.brandName = brandName;
		this.ram = ram;
		this.screenSize = screenSize;
		this.memory = memory;
		this.batteryPower = batteryPower;
		this.color = color;
	}


	
	



	public static List<MobilPhone> mobilPhone = new ArrayList<MobilPhone>();
	
	public static List<MobilPhone> add(){
		Scanner input = new Scanner(System.in);
		
		
		System.out.println();
		
		System.out.print("ÜrünAdı : ");
		String productName = input.next();
		System.out.println();
		
		System.out.print("Fiyat : ");
		double unitPrice = input.nextDouble();
		System.out.println();
		
		int i = 1;
		for(Brand brand : Brand.brands()) {
			System.out.println( i + " - " +brand.getName());
			i++;
		}
		System.out.println();
		
		System.out.print("Marka : ");
		int brandid = input.nextInt();
		System.out.println();
		
		System.out.print("Depolama : ");
		int memory = input.nextInt();
		System.out.println();
		
		System.out.print("Ekran : ");
		int screenSize = input.nextInt();
		System.out.println();
		
		System.out.print("Ram : ");
		int ram = input.nextInt();
		System.out.println();
		
		System.out.print("Pil Gücü : ");
		int batteryPower = input.nextInt();
		System.out.println();
		
		System.out.print("Renk : ");
		String color = input.next();
		System.out.println();
		
		String brandname = null;
		for(Brand brand : Brand.brands()) {
			if(brand.getId() == brandid) {
				brandname = brand.getName();
			}
		}
		int id =  0;
		for(MobilPhone mobilPhone : mobilPhone) {
			if(mobilPhone.getId()>id) {
				id = mobilPhone.getId();
			}
		}
		id++;
		mobilPhone.add(new MobilPhone(id, unitPrice, 0.0, 0, productName, brandname, ram, screenSize, memory,batteryPower,color));
		return mobilPhone;
	}
	
	public static boolean remove(int id){
		try {
			mobilPhone.remove(id-1);
		} catch (Exception e) {
			return false;
		}
		
		return true;
		
	}
	
	public static List<MobilPhone> filtreId(int id){
		List<MobilPhone> filtreList = new ArrayList<MobilPhone>();
		for(MobilPhone phone : mobilPhone) {
			if(phone.getId() == id){
				filtreList.add(phone);
			}
		}
		return filtreList;
	}
	
	public static List<MobilPhone> filtreBrand(int id){
		
		List<MobilPhone> filtreList = new ArrayList<MobilPhone>();
		for(MobilPhone phone : mobilPhone) {
			if(phone.getBrandName() == Brand.brand(id) ){
				filtreList.add(phone);
			}
		}
		return filtreList;
	}
	
	public static List<MobilPhone> mobilPhones() {
		
		mobilPhone.add(new MobilPhone(1, 3199, 0.0, 5, "Samsung Galaxy A51", Brand.brand(1), 6, 6.5, 128, 4000, "Siyah"));
		mobilPhone.add(new MobilPhone(2, 7379, 0.0, 5, "iPhone 11 64 GB", Brand.brand(3), 6, 6.1, 64, 3046, "Mavi"));
		mobilPhone.add(new MobilPhone(3, 4012, 0.0, 5, "Redmi Note 10 Pro 8GB", Brand.brand(8), 12, 6.5, 128, 4000, "Beyaz"));

		return mobilPhone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double  getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double  unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public int getQualityInStock() {
		return qualityInStock;
	}

	public void setQualityInStock(int qualityInStock) {
		this.qualityInStock = qualityInStock;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}


	public int getMemory() {
		return memory;
	}


	public void setMemory(int memory) {
		this.memory = memory;
	}


	public int getBatteryPower() {
		return batteryPower;
	}


	public void setBatteryPower(int batteryPower) {
		this.batteryPower = batteryPower;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

}
