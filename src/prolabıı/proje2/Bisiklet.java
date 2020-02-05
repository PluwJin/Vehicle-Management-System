
package prolabıı.proje2;

import java.text.DecimalFormat;

public class Bisiklet extends karaTasitlari {
 //static int Serinumarası=1;
// static String son="Bisiklet"+Serinumarası;
    public Bisiklet(String marka,double hiz,int yolcu_sayisi,double fiyat,int uretim_yili,int tekerlek_sayisi,String renk,int aracsayısı){
        super(marka,hiz,yolcu_sayisi,fiyat,uretim_yili,"Bisiklet"+aracsayısı,tekerlek_sayisi,renk);
        
        //this.Serinumarası++;
        //son="Bisiklet"+Serinumarası;
         setYakıttürü("Yok");     
        //yazdır();
        System.out.println("Bisiklet yaratıldı!");
    }
    
    public Bisiklet(){
        
    }
    public void yazdır(){
         OkuYaz txt=new OkuYaz();
         
         if(hiz<0)
            hiz=0.0;
        
        if(fiyat<0)
            fiyat=0.0;
         

         String Yazılacak=aracID+"/"+marka+"/"+new DecimalFormat("##.#").format(hiz).replace(',','.')+"/"+new DecimalFormat("##.#").format(fiyat).replace(',','.')+"/"+
                          Integer.toString(yolcu_sayisi)+"/"+Integer.toString(uretim_yili)+"/"+renk+"/"+
                          Integer.toString(teker_sayısı)+"/"+Yakıttürü;
         
        txt.yaz(Yazılacak);
       
        
        
        
        
    }
    
    
    
}

