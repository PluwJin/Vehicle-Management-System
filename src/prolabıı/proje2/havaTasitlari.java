
package prolabıı.proje2;


public abstract class havaTasitlari extends Arac {
    public boolean havadami;
 
    
    public havaTasitlari(String marka,double hiz,int yolcu_sayisi,double fiyat,int uretim_yili,String yakıttürü,String Serinumarası,int tekerlek_sayisi,String renk,boolean havadami){
        super(marka,hiz,yolcu_sayisi,fiyat,uretim_yili,Serinumarası,renk);
        this.havadami=havadami;
        setYakıttürü(yakıttürü); 
        System.out.println("Hava taşıtı yaratıldı!");
    }
    public havaTasitlari(){}
    
    
    
    
    public void Hizlan(double v){  
            this.hiz+=v;
    }
    
    public void Yavasla(double v){
       
            this.hiz-=v;
        
    }
    
    public void Dur(){
        
            this.hiz=0;
            
        
            
    };
    
    public void setHavadamı(Boolean havadamı){
        this.havadami=havadamı;
    }
    
    public Boolean getHavadamı(){
        return this.havadami;
    }
    
}
