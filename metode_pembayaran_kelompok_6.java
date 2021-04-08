
package relasi_kelompok_6;


public class metode_pembayaran_kelompok_6 {
    private String emoney;
    private String tunai;

    
    public metode_pembayaran_kelompok_6(String Emoney, String Tunai){
        
        emoney = Emoney;
        tunai = Tunai;

    }
    
    public void setEmoney(String Emoney){
        
        emoney = Emoney;
    }
    
    public void setTunai(String Tunai){
        
        tunai = Tunai;
    }
    
    public String getEmoney(){
        
        return emoney;
    }
    
    public String getTunai(){
        
        return tunai;
    }
}
