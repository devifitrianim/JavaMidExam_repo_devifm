package data;
/**
 *
 * @author Devi
 */
import java.util.Scanner;

public class LaptopApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name, brand, processorName, SO, jenisStorage;
        byte jumlahCore=0, RAM=0, stok=0;
        
        System.out.println(" Data Laptop Tersedia ");
        System.out.println("======================");
        
        System.out.print("Name\t\t\t\t: ");
        name = input.nextLine();
        
        System.out.print("Brand\t\t\t\t: ");
        brand = input.nextLine();
        
        System.out.print("Nama Processor\t\t\t: ");
        processorName = input.nextLine();
        
        System.out.print("Sistem Operasi\t\t\t: ");
        SO = input.nextLine();
         
        System.out.print("Jenis Storage\t\t\t: ");
        jenisStorage = input.nextLine();
        
        System.out.print("Jumlah Core Pada Processor\t: ");
        jumlahCore = input.nextByte();
        
        System.out.print("Ukuran RAM dalam GB\t\t: ");
        RAM = input.nextByte();
        
        System.out.print("Stok\t\t\t\t: ");
        stok = input.nextByte();
        
        Laptop lp1 = new Laptop(name, brand, processorName, SO, jenisStorage, jumlahCore, RAM, stok);
        
        System.out.println('\n'+ "=====================================" + '\n');
        System.out.println("Nama Tipe\t\t\t: " + lp1.getName());
        System.out.println("Brand Laptop\t\t\t: " + lp1.getBrand() );
        System.out.println("Nama Processor\t\t\t: " + lp1.getProcessorName());
        System.out.println("Jumlah Core Pada Processor\t: " + lp1.getJumlahCore());
        System.out.println("Sistem Operasi\t\t\t: " + lp1.getSO());
        System.out.println("Ukuran RAM dalam\t\t: " + lp1.getRAM() + "GB" );
        System.out.println("Stok Tersedia\t\t\t: " + lp1.getStok() + "Buah");
        
        
        Laptop lp2 = new Laptop(name, brand, stok);
        
        System.out.println('\n' + " Data Umum Persediaan Laptop " );
        System.out.println("================================");
        System.out.println("Nama Tipe\t\t: " + name +"\t|");
        System.out.println("Brand Laptop\t\t: " + brand + "\t|");
        System.out.println("Stok Saat Ini\t\t: " + stok + "\t|");
        System.out.println("================================");
       
    } 
    
}
