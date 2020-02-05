
package prolabıı.proje2;


public abstract class karaTasitlari extends Arac{
     
    public karaTasitlari(){};
    public karaTasitlari(String marka,double hiz,int yolcu_sayisi,double fiyat,int uretim_yili,String Serinumarası,int tekerlek_sayisi,String renk){
        super(marka,hiz,yolcu_sayisi,fiyat,uretim_yili,Serinumarası,renk);  
        setTekersayisi(tekerlek_sayisi);
        System.out.println("Kara Taşıtı Yaratıldı!!");
        
    }
    
    
    
    public void Hizlan(double v){
        this.hiz+=v;
    };
    
    public void Yavasla(double v){
        this.hiz-=v;
    };
    
    public void Dur(){
        this.hiz=0;
    };
}


