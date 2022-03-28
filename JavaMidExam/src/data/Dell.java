package data;
/**
 *
 * @author Devi
 */
public class Dell extends Laptop {
    private int tahunrilis;
    String brandlaptop;
    
    public Dell(String name, String brand, String processorName, String SO, 
                    String jenisStorage, byte jumlahCore, byte RAM, byte stok, int tahunrilis){
        super(name, brand, processorName, SO, jenisStorage, jumlahCore , RAM, stok);
        this.tahunrilis = tahunrilis;
    }
    
    public int getTahunrilis(){
        return tahunrilis;
    }
    
    public void brandLaptop(){
        System.out.println("== BRAND LAPTOP HP ==" +'\n');
    }
    
    String StoreFrontPosition;
    
    @Override
    public void setJenisStorage(String jenisStorage){
        super.setJenisStorage(jenisStorage);
    }
    
    public void ketJenisStorage(){
        if (jenisStorage.equals("ssd m.2") || jenisStorage.equals("SSD M.2")){
            StoreFrontPosition = "Best";
        }
        else if (jenisStorage.equals("ssd sata") || jenisStorage.equals("SSD SATA")){
            StoreFrontPosition = "Good";
        }
        else if (jenisStorage.equals("hdd") || jenisStorage.equals("HDD")){
            StoreFrontPosition = "Middle";
        }
        else{
            StoreFrontPosition = "Oops, Jenis storage yang diinput tidak tersedia";
        }
        
        System.out.println("StoreFrontPosition\t\t: " + StoreFrontPosition);
    }
    
    
    @Override
    public void setJumlahCore(byte jumlahCore) {
        super.setJumlahCore(jumlahCore);
    }
    
    public void ketCore(){
        if (jumlahCore < 0){
            System.out.println("Note : Oops, Jumlah Core yang diinput Bernilai Negatif, Jumlah Core digangti default");
            System.out.println("Jumlah Core Default\t\t: 2");
        }
    }
    
    @Override
    public void setRAM(byte RAM) {
        super.setRAM(RAM);
    }
    
    public void ketRAM(){
        if (RAM < 0){
            System.out.println("Note : Oops, RAM yang diinput Tidak Bernilai Negatif. Besar RAM diganti default");
            System.out.println("RAM default\t\t\t: 4");
 
        } 
        
    }
    
    @Override
    public void setStok(byte stok) {
        super.setStok(stok);
    }
    
    public void ketStok(){
        if (stok < 0){
            System.out.println("Oops, stok Tidak Bernilai Negatif. Besar stok akan default");
            System.out.println("Stok default\t\t\t: 1");
            stok = 1;
        }
    }
}