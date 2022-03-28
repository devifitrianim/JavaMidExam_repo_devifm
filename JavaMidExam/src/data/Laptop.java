package data;
/**
 *
 * @author Devi
 */

public class Laptop {

    String name;
    String brand;
    String processorName, SO, jenisStorage;
    byte jumlahCore, RAM, stok;
    
    public Laptop (String name, String brand, byte stok){
        setName(name);
        setBrand(brand);
        setStok(stok);
    }
    
    public Laptop (String name, String brand, String processorName, String SO, 
            String jenisStorage, byte jumlahCore, byte RAM, byte stok){
        this(name, brand,stok);
        setProcessorName(processorName);
        setSO(SO);
        setJenisStorage(jenisStorage);
        setJumlahCore(jumlahCore);
        setRAM(RAM);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getJenisStorage() {
        return jenisStorage;
    }

    public void setJenisStorage(String jenisStorage) {
        this.jenisStorage = jenisStorage;
    }

    public byte getJumlahCore() {
        return jumlahCore;
    }

    public void setJumlahCore(byte jumlahCore) {
        this.jumlahCore = jumlahCore;
    }

    public byte getRAM() {
        return RAM;
    }

    public void setRAM(byte RAM) {
        this.RAM = RAM;
    }

    public byte getStok() {
        return stok;
    }

    public void setStok(byte stok) {
        this.stok = stok;
    }

    
    
}
