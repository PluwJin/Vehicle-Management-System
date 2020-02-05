
package prolabıı.proje2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


 public  class OkuYaz {
    
    File Dosya = new File("Kayıt.txt");
    static int araba=0;
    static int bisiklet=0;
    static int gemi=0;
    static int ucak=0;
    static int ucangemi=0;
    
    String[] Satırlar=new String[100];
    int sayac=0;
    static int i=0;
    
    public void oku(){
        

    try{
        //DOSYA ALINDI
     i=0;
    FileReader Reader =new FileReader(Dosya);
    BufferedReader oku=new BufferedReader(Reader);
    String satır=oku.readLine();
    while(satır!=null){
    Satırlar[i]=satır;
    i++;
    satır=oku.readLine();
    }
    sayac=i;
    Reader.close();
    oku.close();
        
    
}catch(Exception e){
    e.printStackTrace();
    
}
    
      
    }
    public void yaz(String Yazılacak){
       
        try {
            
            
            FileWriter Writer =new FileWriter(Dosya,true);
            BufferedWriter yazıcı= new BufferedWriter(Writer);
            /*if(i==0){
                yazıcı.write("");
                yazıcı.newLine();
                yazıcı.write("____________________________________________________________________");
                yazıcı.newLine();
                i++;
            }*/
            
            
            yazıcı.write(Yazılacak); 
            yazıcı.newLine();
            yazıcı.flush();
            yazıcı.close();           
            Writer.close();
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public void temizle(){
       
        try {
            
  
            // Dosyanin mevcut olup olmadigini kontrol et.
            if (!Dosya.exists())
            throw new IllegalArgumentException("İlgili Dosya Bulunamadı! : "
            + Dosya.getAbsolutePath());

            if (Dosya.delete()) {
            System.out.println("Dosya Başarı İle Silindi.");
            }

            else {
            System.out.println("Silme İşlemi Başarısız!");
            }

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    
    
    
    
    }
    
  
    
    
    
    
    
    
}
