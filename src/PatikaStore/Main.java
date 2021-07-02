package PatikaStore;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int n = 0 ;
		Notebook.notebooks();
		MobilPhone.mobilPhones();
		while(n == 0 ) {
			Scanner input = new Scanner(System.in);
			System.out.println("PatikaStore Ürün Yönetim Paneli !\n");
			System.out.println("1 - Notebook İşlemleri\n"
					+ "2 - Cep Telefonu İşlemleri\n"
					+ "3 - Marka Listele\n"
					+ "0 - Çıkış Yap\n");
			System.out.print("Tercihiniz : ");
			int select = input.nextInt();
			int add;
			switch (select) {
			case 1:
				System.out.println("\nNotebook Listesi\n");
				System.out.println("---------------------------------------------------------------------------------------------------------\n");
				System.out.println("| ID \t| ÜrünAdı \t| Fiyat \t| Marka \t| Depolama \t| Ekran | Ram\t| " );
				
				System.out.println("---------------------------------------------------------------------------------------------------------\n");
				for(Notebook notebook : Notebook.notebook) {   
					System.out.println("| " +notebook.getId() + "\t| "+ notebook.getProductName() + "\t| " + notebook.getUnitPrice() + "\t| " + notebook.getBrandName() + "\t| " + notebook.getMemory() + "\t| " + notebook.getScreenSize() + "\t| " + notebook.getRam() + "\t| ");
					System.out.println();
				}
				System.out.println("---------------------------------------------------------------------------------------------------------\n");
				System.out.println("Ürün eklemek ister misiniz ? \n1-Evet \n2-Hayır");
				System.out.print("Seçim : ");
				add = input.nextInt();
				if(add == 1) {
					Notebook.add();
					System.out.println("Ürün eklendi");
					for(Notebook notebook : Notebook.notebook) {   
						System.out.println("| " +notebook.getId() + "\t| "+ notebook.getProductName() + "\t| " + notebook.getUnitPrice() + "\t| " + notebook.getBrandName() + "\t| " + notebook.getMemory() + "\t| " + notebook.getScreenSize() + "\t| " + notebook.getRam() + "\t| ");
						System.out.println();
					}
				}
				if(add == 2) {
					
				}
				else {
					System.out.println("Hatalı işlem yaptınız.");
				}
				System.out.println("Ürün silmek ister misiniz ? \n1-Evet \n2-Hayır");
				System.out.print("Seçim : ");
				int delete = input.nextInt();
				if(delete == 1) {
					System.out.println("Silmek istediğiniz ürünün id sini giriniz : ");
					System.out.print("Seçim : ");
					int id = input.nextInt();
					if(Notebook.remove(id) == true) {
						System.out.println("Ürün silindi");
					}else {
						System.out.println("Ürün silinemedi");
					}
					
				}
				if(delete == 2) {
					
				}
				else {
					System.out.println("Hatalı işlem yaptınız.");
				}
				System.out.println();
				System.out.println("Ürün filtrelemek ister misiniz ? \n1-Evet \n2-Hayır");
				System.out.print("Seçim : ");
				int filtre = input.nextInt();
				if(filtre == 1) {
					System.out.println("Filtreleme için  : \n1-Id \n2-Marka ");
					System.out.print("Seçim : ");
					select = input.nextInt();
					if(select == 1) {
						System.out.print("Filtrelemek istediğiniz Id yi giriniz : ");
						int id = input.nextInt();
						for(MobilPhone mobilPhone : MobilPhone.filtreId(id)) {   
							System.out.println("| " + mobilPhone.getId() + "\t| "+ mobilPhone.getProductName() + "\t| " + mobilPhone.getUnitPrice() + "\t| " + mobilPhone.getBrandName() + "\t| " + mobilPhone.getMemory() + "\t| " + mobilPhone.getScreenSize() + "\t| " + mobilPhone.getBatteryPower() + "\t| " + mobilPhone.getRam() + "\t| " + mobilPhone.getColor() + "\t| " );
							System.out.println();
						}
					}else if(select == 2) {
						int i = 1;
						for(Brand brand : Brand.brands()) {
							System.out.println( i + " - " +brand.getName());
							i++;
						}
						System.out.println();
						System.out.print("Filtrelemek istediğiniz Marka yı giriniz : ");
						int id = input.nextInt();
						
						
						for(MobilPhone mobilPhone : MobilPhone.filtreBrand(id)) {   
							System.out.println("| " + mobilPhone.getId() + "\t| "+ mobilPhone.getProductName() + "\t| " + mobilPhone.getUnitPrice() + "\t| " + mobilPhone.getBrandName() + "\t| " + mobilPhone.getMemory() + "\t| " + mobilPhone.getScreenSize() + "\t| " + mobilPhone.getBatteryPower() + "\t| " + mobilPhone.getRam() + "\t| " + mobilPhone.getColor() + "\t| " );
							System.out.println();
						}
					}else {
						System.out.println("Hatalı işlem yaptınız.");
					}
					
				}
				if(filtre == 2) {
					
				}
				else {
					System.out.println("Hatalı işlem yaptınız.");
				}
				break;
			case 2:
				System.out.println("\nCep Telefonu Listesi\n");
				System.out.println("---------------------------------------------------------------------------------------------------------\n");
				System.out.println("| ID \t| ÜrünAdı \t| Fiyat \t| Marka \t| Depolama \t| Ekran | Pil\t| Ram\t| Renk \t| " );
				
				System.out.println("---------------------------------------------------------------------------------------------------------\n");
				for(MobilPhone mobilPhone : MobilPhone.mobilPhone) {   
					System.out.println("| " + mobilPhone.getId() + "\t| "+ mobilPhone.getProductName() + "\t| " + mobilPhone.getUnitPrice() + "\t| " + mobilPhone.getBrandName() + "\t| " + mobilPhone.getMemory() + "\t| " + mobilPhone.getScreenSize() + "\t| " + mobilPhone.getBatteryPower() + "\t| " + mobilPhone.getRam() + "\t| " + mobilPhone.getColor() + "\t| " );
					System.out.println();
				}
				System.out.println("---------------------------------------------------------------------------------------------------------\n");
				System.out.println();
				System.out.println("Ürün eklemek ister misiniz ? \n1-Evet \n2-Hayır");
				System.out.print("Seçim : ");
				add = input.nextInt();
				if(add == 1) {
					MobilPhone.add();
					System.out.println("Ürün eklendi");
					for(MobilPhone mobilPhone : MobilPhone.mobilPhone) {   
						System.out.println("| " + mobilPhone.getId() + "\t| "+ mobilPhone.getProductName() + "\t| " + mobilPhone.getUnitPrice() + "\t| " + mobilPhone.getBrandName() + "\t| " + mobilPhone.getMemory() + "\t| " + mobilPhone.getScreenSize() + "\t| " + mobilPhone.getBatteryPower() + "\t| " + mobilPhone.getRam() + "\t| " + mobilPhone.getColor() + "\t| " );
						System.out.println();
					}
				}
				if(add == 2) {
					
				}
				else {
					System.out.println("Hatalı işlem yaptınız.");
				}
				System.out.println();
				System.out.println("Ürün silmek ister misiniz ? \n1-Evet \n2-Hayır");
				System.out.print("Seçim : ");
				delete = input.nextInt();
				if(delete == 1) {
					System.out.println("Silmek istediğiniz ürünün id sini giriniz : ");
					System.out.print("Seçim : ");
					int id = input.nextInt();
					if(MobilPhone.remove(id) == true) {
						System.out.println("Ürün silindi");
					}else {
						System.out.println("Ürün silinemedi");
					}
					
				}
				if(delete == 2) {
					
				}
				else {
					System.out.println("Hatalı işlem yaptınız.");
				}
				System.out.println();
				System.out.println("Ürün filtrelemek ister misiniz ? \n1-Evet \n2-Hayır");
				System.out.print("Seçim : ");
				filtre = input.nextInt();
				if(filtre == 1) {
					System.out.println("Filtreleme için  : \n1-Id \n2-Marka ");
					System.out.print("Seçim : ");
					select = input.nextInt();
					if(select == 1) {
						System.out.print("Filtrelemek istediğiniz Id yi giriniz : ");
						int id = input.nextInt();
						for(MobilPhone mobilPhone : MobilPhone.filtreId(id)) {   
							System.out.println("| " + mobilPhone.getId() + "\t| "+ mobilPhone.getProductName() + "\t| " + mobilPhone.getUnitPrice() + "\t| " + mobilPhone.getBrandName() + "\t| " + mobilPhone.getMemory() + "\t| " + mobilPhone.getScreenSize() + "\t| " + mobilPhone.getBatteryPower() + "\t| " + mobilPhone.getRam() + "\t| " + mobilPhone.getColor() + "\t| " );
							System.out.println();
						}
					}else if(select == 2) {
						int i = 1;
						for(Brand brand : Brand.brands()) {
							System.out.println( i + " - " +brand.getName());
							i++;
						}
						System.out.println();
						System.out.print("Filtrelemek istediğiniz Marka yı giriniz : ");
						int id = input.nextInt();
						
						
						for(MobilPhone mobilPhone : MobilPhone.filtreBrand(id)) {   
							System.out.println("| " + mobilPhone.getId() + "\t| "+ mobilPhone.getProductName() + "\t| " + mobilPhone.getUnitPrice() + "\t| " + mobilPhone.getBrandName() + "\t| " + mobilPhone.getMemory() + "\t| " + mobilPhone.getScreenSize() + "\t| " + mobilPhone.getBatteryPower() + "\t| " + mobilPhone.getRam() + "\t| " + mobilPhone.getColor() + "\t| " );
							System.out.println();
						}
					}else {
						System.out.println("Hatalı işlem yaptınız.");
					}
					
				}
				if(filtre == 2) {
					
				}
				else {
					System.out.println("Hatalı işlem yaptınız.");
				}
				break;
			case 3:
				System.out.println("\nMarkalarımız\n");
				System.out.println("------------\n");
				for(Brand brand : Brand.brands()) {
					System.out.println("- " + brand.getName());
				}
				System.out.println();
				break;
			case 0:
				n =1;
			default:
				System.out.println("Hatalı işlem yaptınız.");
				break;
			}
		}
	}
}
