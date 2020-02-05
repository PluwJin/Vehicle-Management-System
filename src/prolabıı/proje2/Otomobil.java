
package prolabıı.proje2;
import java.text.DecimalFormat;


public class Otomobil extends karaTasitlari{
OkuYaz txt=new OkuYaz();

//     static int Serinumarası=1;
//    static String son="Otomobil"+Serinumarası;
    
    public Otomobil(String marka,double hiz,int yolcu_sayisi,double fiyat,int uretim_yili,int tekerlek_sayisi,String Yakıttürü,String renk,int otosayı){
        super(marka,hiz,yolcu_sayisi,fiyat,uretim_yili,"Otomobil"+otosayı,tekerlek_sayisi,renk); 
//       this.Serinumarası++;
//       son="Otomobil"+Serinumarası;   
         setYakıttürü(Yakıttürü);     
        //yazdır();
        System.out.println("Otomobil yaratıldı!");
    }
    public Otomobil(){
        
    }
    public void yazdır(){   
        
        if(hiz<0)
            hiz=0.0;
        
        if(fiyat<0)
            fiyat=0.0;

         String Yazılacak=aracID+"/"+marka+"/"+new DecimalFormat("##.#").format(hiz).replace(',','.')+"/"+new DecimalFormat("##.#").format(fiyat).replace(',','.')+"/"+
                          Integer.toString(yolcu_sayisi)+"/"+Integer.toString(uretim_yili)+"/"+renk+"/"+
                          Integer.toString(teker_sayısı)+"/"+Yakıttürü;
         
        txt.yaz(Yazılacak);
        //txt.oku(); 
    }
}
