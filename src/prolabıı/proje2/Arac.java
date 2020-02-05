

package prolabıı.proje2;
import java.util.ArrayList;



public abstract class Arac {
    
  
    
    public String marka;
    public double hiz;
    public int yolcu_sayisi;
    public double fiyat;
    public int uretim_yili;
    public String aracID;
    public String renk;
    public int teker_sayısı;
    public String Yakıttürü; 
   
    
 
    public Arac(){};
    public Arac(String marka,double hiz,int yolcu_sayisi,double fiyat,int uretim_yili,String Serinumarası,String renk){
        this.marka=marka;
        this.hiz=hiz;
        this.yolcu_sayisi=yolcu_sayisi;
        this.fiyat=fiyat;
        this.uretim_yili=uretim_yili;
        this.aracID=Serinumarası;
        this.renk=renk;
        System.out.println("Araç Yaratıldı !!");
    }
  
    public abstract  void Hizlan(double v);
    
    public abstract  void Yavasla(double v);
    
    public abstract void Dur();
    
    public abstract void yazdır();
    
    
    //-----------------------------
     public void setMarka(String marka){
        this.marka=marka;
    }
    
    public String getMarka(){
        return this.marka;
    }
    //----------------------------------------------
    public void setTekersayisi(int teker_sayısı){
        this.teker_sayısı=teker_sayısı;
    }
    
    public int getTekersayisi(){
        return this.teker_sayısı;
    }
   //----------------------------------------------
    public void setYakıttürü(String Yakıttürü){
        this.Yakıttürü=Yakıttürü;
    }
    
    public String getYakıttürü(){
        return this.Yakıttürü;
    }
   //---------------------------------------------------------
    public void setHiz(double hiz){
        this.hiz=hiz;
    }
    
    public double getHiz(){
        return this.hiz;
    }
    //--------------------------------------------------------
    public void setYolcuSayisi(int yolcu_sayisi){
        this.yolcu_sayisi=yolcu_sayisi;
    }
    
    public int getYolcuSayisi(){
        return this.yolcu_sayisi;
    }
   //---------------------------------------------------------
    public void setFiyat(double fiyat){
        this.fiyat=fiyat;
    }
    
    public double getFiyat(){
        return this.fiyat;
    }
    //----------------------------------------------------------
    public void setUretimYili(int uretim_yili){
        this.uretim_yili=uretim_yili;
    }
    
    public int getUretimYili(){
        return this.uretim_yili;
    }
   //------------------------------------------------------------
    public void setRenk(String Renk){
        this.renk=Renk;
    }
    
    public String getRenk(){
        return this.renk;
    }
    //-----------------------------------------------------------
    public void setAracID(String AracID){
        this.aracID=AracID;
    }
    
    public String getAracID(){
        return this.aracID;
    }
    
    
    
}
