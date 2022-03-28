package application;
/**
 *
 * @author Devi
 */

import data.*;
import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) {
        String name, brand=null , processorName, SO, jenisStorage=null;
        byte jumlahCore=0, RAM=0, stok=0;
        int tahunrilis;
        String StoreFrontPosition, storage;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Data Laptop Sesuai Brand ");
        System.out.println("==========================");
        
        System.out.print("Name\t\t\t\t: ");
        name = input.nextLine();
        
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
        
        System.out.print("Tahun rilis\t\t\t: ");
        tahunrilis = input.nextInt();
        
        
        Dell lp1 = new Dell(name, brand, processorName, SO, jenisStorage, jumlahCore, RAM, stok, tahunrilis);
        
        System.out.println('\n'+ "=====================================" + '\n');
        lp1.brandLaptop();
        System.out.println("Nama Tipe\t\t\t: " + lp1.getName());
        System.out.println("Nama Processor\t\t\t: " + lp1.getProcessorName());
        System.out.println("Jumlah Core Pada Processor\t: " + jumlahCore);
        lp1.ketCore();
        System.out.println("Sistem Operasi\t\t\t: " + lp1.getSO());
        System.out.println("Jenis Storage\t\t\t: " + lp1.getJenisStorage());
        lp1.ketJenisStorage();
        System.out.println("Ukuran RAM dalam\t\t: " + lp1.getRAM() + "GB" );
        lp1.ketRAM();
        System.out.println("Stok Tersedia\t\t\t: " + lp1.getStok() + "Buah");
        lp1.ketStok();
        System.out.println("Tahun Rilis\t\t\t: " + lp1.getTahunrilis());
        
        
        
        System.out.println('\n'+"=============================="+'\n');
        
        System.out.print("Name\t\t\t\t: ");
        name = input.nextLine();
        
        System.out.print("Name of Processor \t\t\t: ");
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
        
        System.out.print("Tahun rilis\t\t\t: ");
        tahunrilis = input.nextInt();
        
        
        Axioo lp2 = new Axioo(name, brand, processorName, SO, jenisStorage, jumlahCore, RAM, stok, tahunrilis);
        
        System.out.println('\n'+ "=====================================" + '\n');
        lp1.brandLaptop();
        System.out.println("Nama Tipe\t\t\t: " + lp2.getName());
        System.out.println("Nama Processor\t\t\t: " + lp2.getProcessorName());
        System.out.println("Jumlah Core Pada Processor\t: " + jumlahCore);
        lp2.ketCore();
        System.out.println("Sistem Operasi\t\t\t: " + lp2.getSO());
        System.out.println("Jenis Storage\t\t\t: " + lp2.getJenisStorage());
        lp2.ketJenisStorage();
        System.out.println("Ukuran RAM dalam\t\t: " + lp2.getRAM() + "GB" );
        lp2.ketRAM();
        System.out.println("Stok Tersedia\t\t\t: " + lp2.getStok() + "Buah");
        lp2.ketStok();
        System.out.println("Tahun Rilis\t\t\t: " + lp2.getTahunrilis());
        
        
        
    }
    
}
