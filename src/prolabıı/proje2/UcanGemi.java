
package prolabıı.proje2;

import java.text.DecimalFormat;


public class UcanGemi extends denizTasitlari implements HavaArayuz{
//    static int Serinumarası=1;
//    static String son="Ucangemi"+Serinumarası;
    boolean havadami;
    
    public UcanGemi(String marka,double hiz,int yolcu_sayisi,double fiyat,int uretim_yili,String Yakıttürü,String renk,boolean havadami,int aracsayısı){
        super(marka,hiz,yolcu_sayisi,fiyat,uretim_yili,"Ucangemi"+aracsayısı,renk,Yakıttürü);     
//        this.Serinumarası++;  
//         son="Ucangemi"+Serinumarası;   
         setYakıttürü(Yakıttürü);
         this.havadami=havadami;
        //yazdır();
        System.out.println("UcanGemi yaratıldı!");
    }
    
    public UcanGemi(){
        
    }
    public void yazdır(){
         OkuYaz txt=new OkuYaz();
         
         if(hiz<0)
            hiz=0.0;
        
        if(fiyat<0)
            fiyat=0.0;
        
          
         String Yazılacak=aracID+"/"+marka+"/"+new DecimalFormat("##.#").format(hiz).replace(',','.')+"/"+new DecimalFormat("##.#").format(fiyat).replace(',','.')+"/"+
                          Integer.toString(yolcu_sayisi)+"/"+Integer.toString(uretim_yili)+"/"+renk+"/"+
                          Integer.toString(teker_sayısı)+"/"+Yakıttürü+" ve "+JetMotoruYakıtı;
         
        txt.yaz(Yazılacak);
        

    }
      
    public void Hizlan(double v){  
            this.hiz+=v;
    }
    
    public void Yavasla(double v){
       
            this.hiz-=v;
        
    }
    public void Dur(){
        
            this.hiz=0;
    };
    
    public void setHavadamı(Boolean havadami){
        this.havadami=havadami;
    }
    
    public Boolean getHavadamı(){
        return this.havadami;
    }
    
    
    
}
