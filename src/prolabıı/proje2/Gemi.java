
package prolabıı.proje2;

import java.text.DecimalFormat;


public class Gemi extends denizTasitlari {
//    static int Serinumarası=1;
//    static String son="Gemi"+Serinumarası;
    public Gemi(String marka,double hiz,int yolcu_sayisi,double fiyat,int uretim_yili,String Yakıttürü,String renk,int aracsayısı){
        super(marka,hiz,yolcu_sayisi,fiyat,uretim_yili,"Gemi"+aracsayısı,renk,Yakıttürü);
//        this.Serinumarası++;  
//        son="Gemi"+Serinumarası;
        //yazdır();
        System.out.println("Gemi yaratıldı!");
    }
    
    public Gemi(){
        
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
