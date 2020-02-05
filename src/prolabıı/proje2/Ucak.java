
package prolabıı.proje2;

import java.text.DecimalFormat;


public class Ucak extends havaTasitlari{
//    static int Serinumarası=1;
//    static String son="Ucak"+Serinumarası;
     public Ucak(String marka,double hiz,int yolcu_sayisi,double fiyat,int uretim_yili,int tekerlek_sayisi,String Yakıttürü,String renk,boolean havadami,int aracsayısı){
        super(marka,hiz,yolcu_sayisi,fiyat,uretim_yili,Yakıttürü,"Ucak"+aracsayısı,tekerlek_sayisi,renk,havadami);
//        this.Serinumarası++;  
//        son="Ucak"+Serinumarası;
         setTekersayisi(tekerlek_sayisi);    
        //yazdır();
        System.out.println("Ucak yaratıldı!");
    }
     
     public Ucak(){
         
     }
     public void yazdır(){
         OkuYaz txt=new OkuYaz();
         
         if(hiz<0)
            hiz=0.0;
        
        if(fiyat<0)
            fiyat=0.0;
         
          
         String Yazılacak=aracID+"/"+marka+"/"+new DecimalFormat("##.#").format(hiz).replace(',','.')+"/"+new DecimalFormat("##.#").format(fiyat).replace(',','.')+"/"+
                          Integer.toString(yolcu_sayisi)+"/"+Integer.toString(uretim_yili)+"/"+renk+"/"+
                          Integer.toString(teker_sayısı)+"/"+Yakıttürü+"/"+havadami;
         
        txt.yaz(Yazılacak);
       
        
        
        
    }
}
