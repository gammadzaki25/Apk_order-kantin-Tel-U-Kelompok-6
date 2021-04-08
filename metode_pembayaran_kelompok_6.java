

package relasi_kelompok_6;
import entitas_kelompok_6.list_menu_kelompok_6;
import entitas_kelompok_6.pelanggan_kelompok_6;
import java.util.Scanner;

public class metode_pembayaran_kelompok_6 extends order_kelompok_6{
    
    private String kode_pembayaran;
    private int total_dibayar;
    private int dompet_digital;

    public metode_pembayaran_kelompok_6(String nama, int harga, int jum, String deskripsi) {
        super(nama, harga, jum, deskripsi);
    }
    
    public void AddPembayaran(){
        
            Scanner key = new Scanner(System.in);
      
        this.kode_pembayaran = super.getId_order();
        super.setTotal_Harga(super.getTotal_harga());
        
        System.out.print("Total yang perlu dibayar           : " );
        this.total_dibayar =  super.getTotal_harga();
        System.out.print("Bayar pesanan anda sesuai nominal  : " );
        this.dompet_digital = key.nextInt();
        int bayaran = this.dompet_digital - this.total_dibayar;
        
        if (bayaran < this.total_dibayar){
            System.out.print("Uang anda kurang               : " );
        
        } else if (bayaran > this.total_dibayar) {
        
        System.out.print("Kembalian Anda                     : " );
        System.out.println(bayaran);
        }
    } 
    
    public String getKode_pembayaran(){
        
        return kode_pembayaran;
    }
       
    public int getTotal_dibayar(){
        
        return total_dibayar;
    }
    
    
    public int getDompet_digital(){
        
        return dompet_digital;
    }
    
    public void setKode_pembayaran(String Kode_Pembayaran){
        
        
        kode_pembayaran = Kode_Pembayaran;
    }
    
    
    public void setTotal_dibayar(int Total_dibayar){
        
        total_dibayar = Total_dibayar;
    }
    
    
    public void setDompet_digital(int Dompet_Digital){
        
        dompet_digital = Dompet_Digital;
    }
    
    public void infoPembayaran(){
        
            System.out.println(" ");
            System.out.println("Kode Pembayaran        : " + getKode_pembayaran());
            System.out.println("Total Dibayar          : " + getTotal_dibayar());
            System.out.println("Kembalian              : " + getDompet_digital());
            System.out.println("Pesanan Sudah di bayar");
    }
}
