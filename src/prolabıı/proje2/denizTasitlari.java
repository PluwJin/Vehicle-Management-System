
package prolabıı.proje2;


public abstract class denizTasitlari extends Arac{
    
    public denizTasitlari(String marka,double hiz,int yolcu_sayisi,double fiyat,int uretim_yili,String Serinumarası,String renk,String Yakıttürü){
        super(marka,hiz,yolcu_sayisi,fiyat,uretim_yili,Serinumarası,renk);
        setYakıttürü(Yakıttürü); 
        setTekersayisi(0);
        System.out.println("Deniz taşıtı yaratıldı!!");
    }
    public denizTasitlari(){}
    

    
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
