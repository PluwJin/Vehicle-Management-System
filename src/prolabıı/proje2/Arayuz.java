package prolabıı.proje2;

import java.awt.event.ActionListener; //ActionListener ekleyebilmemiz için içe aktarmamız gereken interface
import java.awt.event.ActionEvent;    //ActionEvent türünden bir nesne oluşturabilmemiz için içe aktarmamız gereken sınıf
import javax.swing.JFrame;            //Pencere nesnesi oluşturabilmemiz için içe aktarmamız gereken sınıf
import javax.swing.JPanel;            //Panel nesnesi oluşturabilmemiz için içe aktarmamız gereken sınıf
import javax.swing.JButton;           //Buton nesnesi oluşturabilmemiz için içe aktarmamız gereken sınıf
import javax.swing.JTextField;        //TextField nesnesi oluşturabilmemiz için içe aktarmamız gereken sınıf
import javax.swing.JPasswordField;    //PasswordField nesnesi oluşturabilmemiz için içe aktarmamız gereken sınıf
import javax.swing.JLabel;            //Label nesnesi oluşturabilmemiz için içe aktarmamız gereken sınıf
import javax.swing.JOptionPane;

public class Arayuz extends JFrame{
    JFrame frame;
    JPanel panel;
    JButton button[] = new JButton[30];
    JTextField txtYazi[] = new JTextField[30];
    JPasswordField passField;
    JLabel label[]= new JLabel[40];
    static int k;
    static boolean b;
    
    
    /*Otomobil[] arabalar= new Otomobil[1000];
    Bisiklet[] bisikletler= new Bisiklet[1000];
    Ucak[] ucaklar= new Ucak[1000];
    Gemi[] gemiler=new Gemi[1000];
    UcanGemi[] ucangemiler=new UcanGemi[1000];*/
    

    // Sınıfın Constructor' ı
    public Arayuz()
   {
       
        super("Araç Yönetim Sistemi");
        main calistir=new main();
        setBounds(100, 100, 500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Paneli oluşturuyorum
        panel = new JPanel();
        
        panel.setLayout(null);

        add(panel);

        label[0] = new JLabel("Yapmak istediğiniz işlemi seçiniz:");
        label[0].setBounds(10, 10, 400, 30);
        panel.add(label[0]);
        //--------------------
        button[0] = new JButton("1-");
        button[0].setBounds(10, 35, 50, 20);
        panel.add(button[0]);
        
        label[1] = new JLabel("Veri girişinde bulun");
        label[1].setBounds(70, 30, 200, 30);
        panel.add(label[1]);
        //----------------------
        button[1] = new JButton("2-");
        button[1].setBounds(10, 55, 50, 20);
        panel.add(button[1]);
        
        label[2] = new JLabel("Veri listele");
        label[2].setBounds(70, 50, 200, 30);
        panel.add(label[2]);
        //-----------------------
        button[2] = new JButton("3-");
        button[2].setBounds(10, 75, 50, 20);
        panel.add(button[2]);
        
        label[3] = new JLabel("Veri güncelle");
        label[3].setBounds(70, 70, 200, 30);
        panel.add(label[3]);
        //----------------------
        
        button[3] = new JButton("Çıkış");
        button[3].setBounds(10, 100, 200, 20);
        panel.add(button[3]);
        
        
        panel.repaint();
        
        
        //==========1========
                label[4] = new JLabel("Veri girişinde bulunacağınız aracı seçiniz:");
                label[4].setBounds(10, 10, 400, 30);
                
                
                //--------------------
                button[4] = new JButton("1-");
                button[4].setBounds(10, 35, 50, 20);
                

                label[5] = new JLabel("Otomobil");
                label[5].setBounds(70, 30, 200, 30);
                
                
                //--------------------
                button[5] = new JButton("2-");
                button[5].setBounds(10, 55, 50, 20);
                

                label[6] = new JLabel("Bisiklet");
                label[6].setBounds(70, 50, 200, 30);
                
                
                //-----------------------
                button[7] = new JButton("3-");
                button[7].setBounds(10, 75, 50, 20);
                

                label[8] = new JLabel("Gemi");
                label[8].setBounds(70, 70, 200, 30);
                
                
                //-----------------------
                button[8] = new JButton("4-");
                button[8].setBounds(10, 95, 50, 20);
                

                label[9] = new JLabel("Uçak");
                label[9].setBounds(70, 90, 200, 30);
                
                
                //-----------------------
                button[9] = new JButton("5-");
                button[9].setBounds(10, 115, 50, 20);
                

                label[10] = new JLabel("Uçan Gemi");
                label[10].setBounds(70, 110, 200, 30);
                
                
                //---------------------
                
                button[10] = new JButton("Bir önceki menüye dön");
                button[10].setBounds(10, 135, 200, 20);
                
          //==========
          label[11] = new JLabel("Listelemek istediğiniz veri tipini seçiniz:");
                label[11].setBounds(10, 10, 400, 30);
                
                //--------------------
                button[11] = new JButton("1-");
                button[11].setBounds(10, 35, 50, 20);
                

                label[12] = new JLabel("Otomobil");
                label[12].setBounds(70, 30, 200, 30);
                
                
                //--------------------
                button[12] = new JButton("2-");
                button[12].setBounds(10, 55, 50, 20);
                

                label[13] = new JLabel("Bisiklet");
                label[13].setBounds(70, 50, 200, 30);
                
                //-----------------------
                button[13] = new JButton("3-");
                button[13].setBounds(10, 75, 50, 20);
                

                label[14] = new JLabel("Uçak");
                label[14].setBounds(70, 70, 200, 30);
                //-----------------------
                button[14] = new JButton("4-");
                button[14].setBounds(10, 95, 50, 20);
                

                label[15] = new JLabel("Gemi");
                label[15].setBounds(70, 90, 200, 30);
                //-----------------------
                button[15] = new JButton("5-");
                button[15].setBounds(10, 115, 50, 20);
                

                label[16] = new JLabel("Uçan Gemi");
                label[16].setBounds(70, 110, 200, 30);
                
          //**********
          label[17] = new JLabel("Güncellemek istediğiniz aracın ID'sini giriniz:");
          label[17].setBounds(10, 10, 400, 30);
         
          
          txtYazi[0] = new JTextField("", 20);
          txtYazi[0].setBounds(10, 40, 200, 30);
                
          
          
          button[16] = new JButton("Bul");
          button[16].setBounds(10, 70, 100, 30);
          
          label[18] = new JLabel("Girdiğiniz ID bulunamadı!");
          label[18].setBounds(10, 10, 300, 30);
          
          int i, j=30;
          
          for(i=1; i<20; i++){
              txtYazi[i] = new JTextField("", 20);
              txtYazi[i].setBounds(120, j, 200, 30);
              
              
              
              j+=30;
          }
          
          label[19] = new JLabel("Yeni değerleri girin:");
          label[19].setBounds(10, 1, 300, 30);
          
          label[20] = new JLabel("Marka:");
          label[20].setBounds(10, 30, 100, 30);
          
          label[21] = new JLabel("Hız:");
          label[21].setBounds(10, 60, 100, 30);
          
          label[22] = new JLabel("Fiyat:");
          label[22].setBounds(10, 90, 100, 30);
          
          label[23] = new JLabel("Yolcu sayısı:");
          label[23].setBounds(10, 120, 100, 30);
          
          label[24] = new JLabel("Üretim yılı:");
          label[24].setBounds(10, 150, 100, 30);
          
          label[25] = new JLabel("Renk:");
          label[25].setBounds(10, 180, 100, 30);
          
          label[26] = new JLabel("Yakıt türü:");
          label[26].setBounds(10, 210, 100, 30);
          
          label[27] = new JLabel("Teker sayısı:");
          label[27].setBounds(10, 240, 100, 30);
          
          button[17] = new JButton("Değiştir");
          button[17].setBounds(10,270, 100, 30);
          
          
          
          
          //**********
          
          //++++++++++++++++++++
          
          label[28] = new JLabel("Başlangıç değerlerini girin:");
          label[28].setBounds(10, 1, 300, 30);
          
          button[18] = new JButton("Oluştur");
          button[18].setBounds(10,270, 100, 30);
          
          
          j=30;
          
          for(i=9; i<17; i++){
              txtYazi[i] = new JTextField("", 20);
              txtYazi[i].setBounds(120, j, 200, 30);
              
              
              
              j+=30;
          }
          
          
          //++++++++++++++++++++
          
          //~~~~~~~~~~~
          label[29] = new JLabel("Girdiğiniz hız bilgilerini değiştirmek istiyor musunuz?");
          label[29].setBounds(10, 10, 300, 30);
          
          button[19] = new JButton("Evet");
          button[19].setBounds(10, 60, 100, 30);
          
          button[20] = new JButton("Hayır");
          button[20].setBounds(150,60, 100, 30);
          
//          label[30] = new JLabel("Eklemek istediğiniz hız değerini giriniz:");
//          label[30].setBounds(10, 10, 300, 30);

          txtYazi[21] = new JTextField("Eklemek istediğiniz hız değerini buraya giriniz", 20);
          txtYazi[21].setBounds(10, 10, 300, 30);
          
          button[21] = new JButton("Dur");
          button[21].setBounds(350,10, 100, 30);
          
          
          button[22] = new JButton("Ekle ve Oluştur");
          button[22].setBounds(10,100, 200, 30);
          
          
          
          
          
          //~~~~~~~~~~~

        
        
        
        button[0].addActionListener(new ActionListener()//Veri Girişinde Bulun butonu tepkisi
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("'1- Veri girişinde bulun' butonuna basıldı!");
                
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                panel.add(label[4]);
                
                panel.add(button[4]);
                panel.add(label[5]);
                
                panel.add(button[5]);
                panel.add(label[6]);
                
                panel.add(button[7]);
                panel.add(label[8]);
                
                panel.add(button[8]);
                panel.add(label[9]);
                
                panel.add(button[9]);
                panel.add(label[10]);
                
                button[10].setBounds(10, 135, 200, 20);
                panel.add(button[10]);
                
                
                //-------------------
                
                button[3].setBounds(10, 155, 200, 20);
                panel.add(button[3]);
                
                
                
                
                
                
                
            }
        });
        
        button[4].addActionListener(new ActionListener()//'Otomobil oluştur' butonu tepkisi
        {
            public void actionPerformed(ActionEvent e)
            {
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                for(int l=20; l<=28; l++){
                    panel.add(label[l]);
                }
                
                for(int t=9; t<17; t++){
                    panel.add(txtYazi[t]);
                }
                
                panel.add(button[18]);
                
               //---------------------
               
           
                button[3].setBounds(10, 320, 200, 20);
                panel.add(button[3]);
                
                
                
                button[18].addActionListener(new ActionListener()//'Oluştur' butonu tepkisi
                {
                    public void actionPerformed(ActionEvent e)
                    {
                
                        OkuYaz txt=new OkuYaz();
                        txt.oku();
                        int k=0;
                        int sayac=0;
                        while(txt.Satırlar[k]!=null){
                            if(txt.Satırlar[k].startsWith("Otomobil")){
                                sayac++;
                            }
                            k++;
                        }
                        
                        
                        //>>>>>Hız güncellemesini sorma ekranı
                        panel.removeAll();
                        panel.revalidate();
                        panel.repaint();
                        
                        panel.add(label[29]);
                        label[29].setText("Girdiğiniz hız bilgilerini değiştirmek istiyor musunuz?");
                        
                        panel.add(button[19]);
                        panel.add(button[20]);
                        
                        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                        
                        
                        calistir.arabalar[0] = new Otomobil(txtYazi[9].getText(),
                                Double.parseDouble(txtYazi[10].getText()),
                                Integer.parseInt(txtYazi[12].getText()),
                                Double.parseDouble(txtYazi[11].getText()),
                                Integer.parseInt(txtYazi[13].getText()),
                                Integer.parseInt(txtYazi[16].getText()),
                                txtYazi[15].getText(),
                                txtYazi[14].getText(),
                                 sayac+1
                                );
                        button[19].addActionListener(new ActionListener()//'Evet' butonu tepkisi
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                System.out.println("'Evet' butonuna basıldı!");
                                
                                panel.removeAll();
                                panel.revalidate();
                                panel.repaint();
                                
                                
                                panel.add(txtYazi[21]);
                                panel.add(button[21]);
                                panel.add(button[22]);
                                
                                
                                
                                button[21].addActionListener(new ActionListener()//'Dur' butonu tepkisi
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        System.out.println("'Dur' butonuna basıldı!");
                                        
                                        txtYazi[21].setText("Durdur");
                                    }
                                });
                                
                                button[22].addActionListener(new ActionListener()//'Ekle ve Oluştur' butonu tepkisi
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        System.out.println("'Ekle ve Oluştur' butonuna basıldı!");
                                        
                                        if(txtYazi[21].getText().equals("Durdur"))
                                            calistir.arabalar[0].Dur();
                                        
                                        else if(Double.parseDouble(txtYazi[21].getText())>=0)
                                            calistir.arabalar[0].Hizlan(Double.parseDouble(txtYazi[21].getText()));
                                        
                                        else if(Double.parseDouble(txtYazi[21].getText())<0)
                                            calistir.arabalar[0].Yavasla(-1*Double.parseDouble(txtYazi[21].getText()));
                                        
                                        if(calistir.arabalar[0].hiz<0)
                                            calistir.arabalar[0].hiz=0.0;
                                        
                                        calistir.arabalar[0].yazdır();
                                        
                                        JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                                        
                                        panel.remove(button[22]);
                                        
                                        button[3].setBounds(10,100, 200, 30);
                                        panel.add(button[3]);
                                        
                                        panel.repaint();
                                       
                                    }
                                });
                                
                                
                                
                                
                                //JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                            }
                        });
                         
                         button[20].addActionListener(new ActionListener()//'Hayır' butonu tepkisi
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        System.out.println("'Hayır' butonuna basıldı!");
                                        JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                                        calistir.arabalar[0].yazdır();
                                        panel.removeAll();
                                        
                                        button[3].setBounds(10,10, 200, 30);
                                        panel.add(button[3]);
                                        
                                        panel.revalidate();
                                        panel.repaint();
                                    }
                                });

                    }
                });
                
                
                
                
            }
        });
        
        button[5].addActionListener(new ActionListener()//'Bisiklet oluştur' butonu tepkisi
        {
            public void actionPerformed(ActionEvent e)
            {
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                for(int l=20; l<=28; l++){
                    
                    panel.add(label[l]);
                }
                
                for(int t=9; t<17; t++){
                    if(t==15)
                        continue;
                    panel.add(txtYazi[t]);
                }
                
                panel.add(button[18]);     
                //---------------------
              
                
                
                button[3].setBounds(10, 320, 200, 20);
                panel.add(button[3]);
                
                
                
                button[18].addActionListener(new ActionListener()//'Oluştur' butonu tepkisi
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        OkuYaz txt=new OkuYaz();
                        txt.oku();
                        int k=0;
                        int sayac=0;
                        while(txt.Satırlar[k]!=null){
                            if(txt.Satırlar[k].startsWith("Bisiklet")){
                                sayac++;
                            }
                            k++;
                        }
                        
                        //>>>>>Hız güncellemesini sorma ekranı
                        panel.removeAll();
                        panel.revalidate();
                        panel.repaint();
                        
                        panel.add(label[29]);
                        label[29].setText("Girdiğiniz hız bilgilerini değiştirmek istiyor musunuz?");
                        
                        panel.add(button[19]);
                        panel.add(button[20]);
                        
                        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                        
                        
                        
                        
                        calistir.bisikletler[0] = new Bisiklet(txtYazi[9].getText(),
                                Double.parseDouble(txtYazi[10].getText()),
                                Integer.parseInt(txtYazi[12].getText()),
                                Double.parseDouble(txtYazi[11].getText()),
                                Integer.parseInt(txtYazi[13].getText()),
                                Integer.parseInt(txtYazi[16].getText()),    
                                txtYazi[14].getText(),
                                sayac+1
                                
                                );
                         
                         
                         button[19].addActionListener(new ActionListener()//'Evet' butonu tepkisi
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                System.out.println("'Evet' butonuna basıldı!");
                                
                                panel.removeAll();
                                panel.revalidate();
                                panel.repaint();
                                
                                
                                panel.add(txtYazi[21]);
                                panel.add(button[21]);
                                panel.add(button[22]);
                                
                                
                                
                                button[21].addActionListener(new ActionListener()//'Dur' butonu tepkisi
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        System.out.println("'Dur' butonuna basıldı!");
                                        
                                        txtYazi[21].setText("Durdur");
                                    }
                                });
                                
                                button[22].addActionListener(new ActionListener()//'Ekle ve Oluştur' butonu tepkisi
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        System.out.println("'Ekle ve Oluştur' butonuna basıldı!");
                                        
                                        if(txtYazi[21].getText().equals("Durdur"))
                                            calistir.bisikletler[0].Dur();
                                        
                                        else if(Double.parseDouble(txtYazi[21].getText())>=0)
                                            calistir.bisikletler[0].Hizlan(Double.parseDouble(txtYazi[21].getText()));
                                        
                                        else if(Double.parseDouble(txtYazi[21].getText())<0)
                                            calistir.bisikletler[0].Yavasla(-1*Double.parseDouble(txtYazi[21].getText()));
                                        
                                        if(calistir.bisikletler[0].hiz<0)
                                            calistir.bisikletler[0].hiz=0.0;
                                        
                                        calistir.bisikletler[0].yazdır();
                                        
                                        JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                                        
                                        panel.remove(button[22]);
                                        
                                        button[3].setBounds(10,100, 200, 30);
                                        panel.add(button[3]);
                                        
                                        panel.repaint();
                                       
                                    }
                                });
                                
                                
                                
                                
                                //JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                            }
                        });
                         
                         button[20].addActionListener(new ActionListener()//'Hayır' butonu tepkisi
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                System.out.println("'Hayır' butonuna basıldı!");
                                JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                                calistir.bisikletler[0].yazdır();
                                
                                panel.removeAll();

                                button[3].setBounds(10,10, 200, 30);
                                panel.add(button[3]);

                                panel.revalidate();
                                panel.repaint();
                            }
                        });
                         
                         

                    }
                });
                
                
                
                
            }
        });
        
        button[7].addActionListener(new ActionListener()//'Gemi oluştur' butonu tepkisi
        {
            public void actionPerformed(ActionEvent e)
            {
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                for(int l=20; l<=28; l++){
                    if(l!=27)
                        panel.add(label[l]);
                }
                
                for(int t=9; t<17; t++){
                    if(t!=16)
                        panel.add(txtYazi[t]);
                }
                
                panel.add(button[18]);
                //---------------------
               
               
                button[3].setBounds(10, 320, 200, 20);
                panel.add(button[3]);
                
                
                
                button[18].addActionListener(new ActionListener()//'Oluştur' butonu tepkisi
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        OkuYaz txt=new OkuYaz();
                        txt.oku();
                        int k=0;
                        int sayac=0;
                        while(txt.Satırlar[k]!=null){
                            if(txt.Satırlar[k].startsWith("Gemi")){
                                sayac++;
                            }
                            k++;
                        }
                        
                        //>>>>>Hız güncellemesini sorma ekranı
                        panel.removeAll();
                        panel.revalidate();
                        panel.repaint();
                        
                        panel.add(label[29]);
                        label[29].setText("Girdiğiniz hız bilgilerini değiştirmek istiyor musunuz?");
                        
                        panel.add(button[19]);
                        panel.add(button[20]);
                        
                        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                        
                        calistir.gemiler[0] = new Gemi(txtYazi[9].getText(),
                                Double.parseDouble(txtYazi[10].getText()),
                                Integer.parseInt(txtYazi[12].getText()),
                                Double.parseDouble(txtYazi[11].getText()),
                                Integer.parseInt(txtYazi[13].getText()),
                                //Integer.parseInt(txtYazi[16].getText()),
                                txtYazi[15].getText(),
                                txtYazi[14].getText(),
                                sayac+1
                                
                                );
                          button[19].addActionListener(new ActionListener()//'Evet' butonu tepkisi
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                System.out.println("'Evet' butonuna basıldı!");
                                
                                panel.removeAll();
                                panel.revalidate();
                                panel.repaint();
                                
                                
                                panel.add(txtYazi[21]);
                                panel.add(button[21]);
                                panel.add(button[22]);
                                
                                
                                
                                button[21].addActionListener(new ActionListener()//'Dur' butonu tepkisi
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        System.out.println("'Dur' butonuna basıldı!");
                                        
                                        txtYazi[21].setText("Durdur");
                                    }
                                });
                                
                                button[22].addActionListener(new ActionListener()//'Ekle ve Oluştur' butonu tepkisi
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        System.out.println("'Ekle ve Oluştur' butonuna basıldı!");
                                        
                                        if(txtYazi[21].getText().equals("Durdur"))
                                            calistir.gemiler[0].Dur();
                                        
                                        else if(Double.parseDouble(txtYazi[21].getText())>=0)
                                            calistir.gemiler[0].Hizlan(Double.parseDouble(txtYazi[21].getText()));
                                        
                                        else if(Double.parseDouble(txtYazi[21].getText())<0)
                                            calistir.gemiler[0].Yavasla(-1*Double.parseDouble(txtYazi[21].getText()));
                                        
                                        if(calistir.gemiler[0].hiz<0)
                                            calistir.gemiler[0].hiz=0.0;
                                        
                                        calistir.gemiler[0].yazdır();
                                        
                                        JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                                        
                                        panel.remove(button[22]);
                                        
                                        button[3].setBounds(10,100, 200, 30);
                                        panel.add(button[3]);
                                        
                                        panel.repaint();
                                       
                                    }
                                });
                                
                                
                                
                                
                                //JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                            }
                        });
                         
                         button[20].addActionListener(new ActionListener()//'Hayır' butonu tepkisi
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                System.out.println("'Hayır' butonuna basıldı!");
                                JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                                calistir.gemiler[0].yazdır();
                                
                                panel.removeAll();

                                button[3].setBounds(10,10, 200, 30);
                                panel.add(button[3]);

                                panel.revalidate();
                                panel.repaint();
                            }
                        });

                    }
                });
                
                
                
                
            }
        });
        
        
        button[8].addActionListener(new ActionListener()//'Uçak oluştur' butonu tepkisi
        {
            public void actionPerformed(ActionEvent e)
            {
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                for(int l=20; l<=28; l++){
                    panel.add(label[l]);
                }
                
                for(int t=9; t<17; t++){
                    panel.add(txtYazi[t]);
                }
                
                panel.add(button[18]);
                //---------------------
                
               
               
                button[3].setBounds(10, 320, 200, 20);
                panel.add(button[3]);
                
                
                
                button[18].addActionListener(new ActionListener()//'Oluştur' butonu tepkisi
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        OkuYaz txt=new OkuYaz();
                        txt.oku();
                        int k=0;
                        int sayac=0;
                        while(txt.Satırlar[k]!=null){
                            if(txt.Satırlar[k].startsWith("Ucak")){
                                sayac++;
                            }
                            k++;
                        }
                        double hiz=Double.parseDouble(txtYazi[10].getText());
                        //System.out.println(">"+hiz);
                        b=false;
                        
                        if(hiz>100)
                            b=true;
                        
                        
                        //>>>>>Hız güncellemesini sorma ekranı
                        panel.removeAll();
                        panel.revalidate();
                        panel.repaint();
                        
                        panel.add(label[29]);
                        label[29].setText("Girdiğiniz hız bilgilerini değiştirmek istiyor musunuz?");
                        
                        panel.add(button[19]);
                        panel.add(button[20]);
                        
                        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                        
                        calistir.ucaklar[0] = new Ucak(txtYazi[9].getText(),
                                Double.parseDouble(txtYazi[10].getText()),
                                Integer.parseInt(txtYazi[12].getText()),
                                Double.parseDouble(txtYazi[11].getText()),
                                Integer.parseInt(txtYazi[13].getText()),
                                Integer.parseInt(txtYazi[16].getText()),
                                txtYazi[15].getText(),
                                txtYazi[14].getText(),
                                b,sayac+1
                                
                                );
                         button[19].addActionListener(new ActionListener()//'Evet' butonu tepkisi
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                System.out.println("'Evet' butonuna basıldı!");
                                
                                panel.removeAll();
                                panel.revalidate();
                                panel.repaint();
                                
                                
                                panel.add(txtYazi[21]);
                                panel.add(button[21]);
                                panel.add(button[22]);
                                
                                
                                
                                button[21].addActionListener(new ActionListener()//'Dur' butonu tepkisi
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        System.out.println("'Dur' butonuna basıldı!");
                                        if(b){
                                            JOptionPane.showMessageDialog(null,"Arac havada olduğundan önce yavaşlatılıp sonra durdurulacak!" );
                                        }
                                        
                                       
                                        
                                        txtYazi[21].setText("Durdur");
                                        panel.repaint();
                                        
                                        
                                    }
                                });
                                
                                button[22].addActionListener(new ActionListener()//'Ekle ve Oluştur' butonu tepkisi
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        System.out.println("'Ekle ve Oluştur' butonuna basıldı!");
                                        
                                        if(txtYazi[21].getText().equals("Durdur")){
                                            if(!b)
                                                calistir.ucaklar[0].Dur();
                                            
                                            else{
                                                calistir.ucaklar[0].Yavasla(Double.parseDouble(txtYazi[10].getText())-100);// Uçağı önce yavaşlat
                                                calistir.ucaklar[0].Dur();//sonra durdur
                                            }
                                            
                                                
                                        }
                                            
                                        
                                        else if(Double.parseDouble(txtYazi[21].getText())>=0)
                                            calistir.ucaklar[0].Hizlan(Double.parseDouble(txtYazi[21].getText()));
                                        
                                        else if(Double.parseDouble(txtYazi[21].getText())<0)
                                            calistir.ucaklar[0].Yavasla(-1*Double.parseDouble(txtYazi[21].getText()));
                                        
                                        if(calistir.ucaklar[0].hiz<0)
                                            calistir.ucaklar[0].hiz=0.0;
                                        
                                        calistir.ucaklar[0].yazdır();
                                        
                                        JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                                        
                                        panel.remove(button[21]);
                                        panel.remove(button[22]);
                                        panel.remove(txtYazi[21]);
                                        
                                        
                                        
                                        button[3].setBounds(10,10, 200, 30);
                                        panel.add(button[3]);
                                        
                                        panel.repaint();
                                       
                                    }
                                });
                                
                                
                                
                                
                                
                                
                                
                                
                            }
                        });
                         
                         
                         button[20].addActionListener(new ActionListener()//'Hayır' butonu tepkisi
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                System.out.println("'Hayır' butonuna basıldı!");
                                JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                                calistir.ucaklar[0].yazdır();
                                
                                panel.removeAll();

                                button[3].setBounds(10,10, 200, 30);
                                panel.add(button[3]);

                                panel.revalidate();
                                panel.repaint();
                            }
                        });
                         
                         
                         
                         

                    }
                });
                
                
                
                
            }
        });
        
        
        button[9].addActionListener(new ActionListener()//'Uçangemi oluştur' butonu tepkisi
        {
            public void actionPerformed(ActionEvent e)
            {
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                for(int l=20; l<=28; l++){
                    if(l!=27)
                        panel.add(label[l]);
                }
                
                for(int t=9; t<17; t++){
                    if(t!=16)
                        panel.add(txtYazi[t]);
                }
                
                panel.add(button[18]);
                
               //---------------------
               
                
                button[3].setBounds(10, 320, 200, 20);
                panel.add(button[3]);
                
                
                
                button[18].addActionListener(new ActionListener()//'Oluştur' butonu tepkisi
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        OkuYaz txt=new OkuYaz();
                        txt.oku();
                        int k=0;
                        int sayac=0;
                        while(txt.Satırlar[k]!=null){
                            if(txt.Satırlar[k].startsWith("Ucangemi")){
                                sayac++;
                            }
                            k++;
                        }
                        double hiz=Double.parseDouble(txtYazi[10].getText());
                        //System.out.println(">"+hiz);
                        b=false;
                        
                        if(hiz>100)
                            b=true;
                        
                        //>>>>>Hız güncellemesini sorma ekranı
                        panel.removeAll();
                        panel.revalidate();
                        panel.repaint();
                        
                        panel.add(label[29]);
                        label[29].setText("Girdiğiniz hız bilgilerini değiştirmek istiyor musunuz?");
                        
                        panel.add(button[19]);
                        panel.add(button[20]);
                        
                        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                        
                        calistir.ucangemiler[0] = new UcanGemi(txtYazi[9].getText(),
                                Double.parseDouble(txtYazi[10].getText()),
                                Integer.parseInt(txtYazi[12].getText()),
                                Double.parseDouble(txtYazi[11].getText()),
                                Integer.parseInt(txtYazi[13].getText()),
                                //Integer.parseInt(txtYazi[16].getText()),
                                txtYazi[15].getText(),
                                txtYazi[14].getText(),
                                b,sayac+1
                                
                                );
                          button[19].addActionListener(new ActionListener()//'Evet' butonu tepkisi
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                System.out.println("'Evet' butonuna basıldı!");
                                
                                panel.removeAll();
                                panel.revalidate();
                                panel.repaint();
                                
                                
                                panel.add(txtYazi[21]);
                                panel.add(button[21]);
                                panel.add(button[22]);
                                
                                
                                
                                button[21].addActionListener(new ActionListener()//'Dur' butonu tepkisi
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        System.out.println("'Dur' butonuna basıldı!");
                                        if(b){
                                            JOptionPane.showMessageDialog(null,"Arac havada olduğundan önce yavaşlatılıp sonra durdurulacak!" );
                                        }
                                        
                                       
                                        
                                        txtYazi[21].setText("Durdur");
                                        panel.repaint();
                                            
                                        
                                        
                                    }
                                });
                                
                                button[22].addActionListener(new ActionListener()//'Ekle ve Oluştur' butonu tepkisi
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        System.out.println("'Ekle ve Oluştur' butonuna basıldı!");
                                        
                                        if(txtYazi[21].getText().equals("Durdur")){
                                            if(!b)
                                                calistir.ucangemiler[0].Dur();
                                            
                                            else{
                                                calistir.ucangemiler[0].Yavasla(Double.parseDouble(txtYazi[10].getText())-100);// Uçangemiyi önce yavaşlat
                                                calistir.ucangemiler[0].Dur();//sonra durdur
                                            }
                                        }
                                            
                                        
                                        else if(Double.parseDouble(txtYazi[21].getText())>=0)
                                            calistir.ucangemiler[0].Hizlan(Double.parseDouble(txtYazi[21].getText()));
                                        
                                        else if(Double.parseDouble(txtYazi[21].getText())<0)
                                            calistir.ucangemiler[0].Yavasla(-1*Double.parseDouble(txtYazi[21].getText()));
                                        
                                        if(calistir.ucangemiler[0].hiz<0)
                                            calistir.ucangemiler[0].hiz=0.0;
                                        
                                        calistir.ucangemiler[0].yazdır();
                                        
                                        JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                                        
                                        panel.remove(button[21]);
                                        panel.remove(button[22]);
                                        panel.remove(txtYazi[21]);
                                        
                                        button[3].setBounds(10,10, 200, 30);
                                        panel.add(button[3]);
                                        
                                        panel.repaint();
                                       
                                    }
                                });
                                
                                
                                
                                
                                
                                
                                
                            }
                        });
                          
                          
                        button[20].addActionListener(new ActionListener()//'Hayır' butonu tepkisi
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                System.out.println("'Hayır' butonuna basıldı!");
                                JOptionPane.showMessageDialog(null,"Veri Girişi Yapıldı !" );
                                calistir.ucangemiler[0].yazdır();
                                
                                panel.removeAll();

                                button[3].setBounds(10,10, 200, 30);
                                panel.add(button[3]);

                                panel.revalidate();
                                panel.repaint();
                            }
                        });

                    }
                });
                
                
                
                
            }
        });
        
        
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
        
        button[1].addActionListener(new ActionListener()//'Veri listele' butonu tepkisi
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("'2- Veri listele' butonuna basıldı!");
                
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                panel.add(label[11]);
                
                panel.add(button[11]);
                panel.add(label[12]);
                
                panel.add(button[12]);
                panel.add(label[13]);
                
                panel.add(button[13]);
                panel.add(label[14]);
                
                panel.add(button[14]);
                panel.add(label[15]);
                
                panel.add(button[15]);
                panel.add(label[16]);
                
                
                button[10].setBounds(10, 135, 200, 20);
                panel.add(button[10]);
                
                
                button[3].setBounds(10, 155, 200, 20);
                panel.add(button[3]);
                
                
                
            }
        });
        //--------------------------------------------------------------------------------------------------
         button[11].addActionListener(new ActionListener()//Otomobil Listele
        {
            public void actionPerformed(ActionEvent e)
            {
               int j=10;
               int i=0;
               int k=0;
                System.out.println("'1- Otomobil Listele Butonuna Basıldı!");
                JLabel[] Kayıtlar=new JLabel[100];
                OkuYaz oku=new OkuYaz();
                oku.oku();
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                while(oku.Satırlar[i]!=null){
                  if(oku.Satırlar[i].startsWith("Otomobil")){
                Kayıtlar[i]=new JLabel(oku.Satırlar[i]);
                panel.add(Kayıtlar[i]);
                Kayıtlar[i].setBounds(10, j, 400,30);
                j=j+15;
                k++;
                        }
                  i++;
                  
                }
               // panel.add(label[10]);           
                button[10].setBounds(10, 90+k*15, 200, 20);
                panel.add(button[10]);
                //-------------------
                button[3].setBounds(10, 110+k*15, 200, 20);
                panel.add(button[3]);
                  
            }
        });
         //--------------------------------------------------------------------------------------------------
         button[12].addActionListener(new ActionListener()//Bisiklet Listele
        {
            public void actionPerformed(ActionEvent e)
            {
               int j=10;
               int i=0;
               int k=0;
                System.out.println("'2- Bisiklet Listele Butonuna Basıldı!");
                JLabel[] Kayıtlar=new JLabel[100];
                OkuYaz oku=new OkuYaz();
                oku.oku();
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                while(oku.Satırlar[i]!=null){
                  if(oku.Satırlar[i].startsWith("Bisiklet")){
                Kayıtlar[i]=new JLabel(oku.Satırlar[i]);
                panel.add(Kayıtlar[i]);
                Kayıtlar[i].setBounds(10, j, 400,30);
                j=j+15;
                k++;
                        }
                  i++;
                }
               // panel.add(label[10]);           
                button[10].setBounds(10, 90+k*15, 200, 20);
                panel.add(button[10]);
                //-------------------
                button[3].setBounds(10, 110+k*15, 200, 20);
                panel.add(button[3]);
                  
            }
        });
         //--------------------------------------------------------------------------------------------------------------
         button[13].addActionListener(new ActionListener()//Uçak Listele
        {
            public void actionPerformed(ActionEvent e)
            {
               int j=10;
               int i=0;
               int k=0;
                System.out.println("'3- Uçak Listele Butonuna Basıldı!");
                JLabel[] Kayıtlar=new JLabel[100];
                OkuYaz oku=new OkuYaz();
                oku.oku();
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                while(oku.Satırlar[i]!=null){
                  if(oku.Satırlar[i].startsWith("Ucak")){
                Kayıtlar[i]=new JLabel(oku.Satırlar[i]);
                panel.add(Kayıtlar[i]);
                Kayıtlar[i].setBounds(10, j, 400,30);
                j=j+15;
                k++;
                        }
                  i++;
                }
               // panel.add(label[10]);           
                button[10].setBounds(10, 90+k*15, 200, 20);
                panel.add(button[10]);
                //-------------------
                button[3].setBounds(10, 110+k*15, 200, 20);
                panel.add(button[3]);
                  
            }
        });
         //-----------------------------------------------------------------------------------------------------------------------------------
         button[14].addActionListener(new ActionListener()//Gemi Listele
        {
            public void actionPerformed(ActionEvent e)
            {
               int j=10;
               int i=0;
               int k=0;
                System.out.println("'4- Gemi Listele Butonuna Basıldı!");
                JLabel[] Kayıtlar=new JLabel[100];
                OkuYaz oku=new OkuYaz();
                oku.oku();
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                while(oku.Satırlar[i]!=null){
                  if(oku.Satırlar[i].startsWith("Gemi")){
                Kayıtlar[i]=new JLabel(oku.Satırlar[i]);
                panel.add(Kayıtlar[i]);
                Kayıtlar[i].setBounds(10, j, 400,30);
                j=j+15;
                k++;
                        }
                  i++;
                }
               // panel.add(label[10]);           
                button[10].setBounds(10, 90+k*15, 200, 20);
                panel.add(button[10]);
                //-------------------
                button[3].setBounds(10, 110+k*15, 200, 20);
                panel.add(button[3]);
                  
            }
        });
        //---------------------------------------------------------------------------------------------------------------------------------
         button[15].addActionListener(new ActionListener()//Uçan Gemi Listele
        {
            public void actionPerformed(ActionEvent e)
            {
               int j=10;
               int i=0;
               int k=0;
                System.out.println("'5- Uçangemi Listele Butonuna Basıldı!");
                JLabel[] Kayıtlar=new JLabel[100];
                OkuYaz oku=new OkuYaz();
                oku.oku();
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                while(oku.Satırlar[i]!=null){
                  if(oku.Satırlar[i].startsWith("Ucangemi")){
                Kayıtlar[i]=new JLabel(oku.Satırlar[i]);
                panel.add(Kayıtlar[i]);
                Kayıtlar[i].setBounds(10, j, 400,30);
                j=j+15;
                k++;
                        }
                  i++;
                }
               // panel.add(label[10]);           
                button[10].setBounds(10, 90+k*15, 200, 20);
                panel.add(button[10]);
                //-------------------
                button[3].setBounds(10, 110+k*15, 200, 20);
                panel.add(button[3]);
                  
            }
        });
         
         
        
        
        button[2].addActionListener(new ActionListener()//'Veri güncelle' butonu tepkisi
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("'Veri güncelle' butonuna basıldı!");
                
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                panel.add(label[17]);
                panel.add(txtYazi[0]);
                
                
                
                panel.add(button[16]);
                
                //---------------------
               button[10].setBounds(10, 100, 200, 20);
                panel.add(button[10]);
                //-------------------
                button[3].setBounds(10, 120, 200, 20);
                panel.add(button[3]);
                
                
                
                
                
                
            }
        });
        
        
        
        
        
        button[16].addActionListener(new ActionListener()//'Bul' butonu tepkisi
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("'Bul' butonuna basıldı!");
                
                
                
                OkuYaz d_oku = new OkuYaz();
                d_oku.oku();
                
                String okunan = txtYazi[0].getText();
                
                int i, bulundumu=0;
                
                for(i=0; i<d_oku.sayac; i++){
                    String satirdaki1[] = d_oku.Satırlar[i].split("/");
                    if(okunan.equals(satirdaki1[0])){
                        bulundumu=1;
                        k=i;
                    }
                    
                   
                        
                }
                if(bulundumu==1){
                    
                    panel.removeAll();
                    panel.revalidate();
                    panel.repaint();
                    
                    for(i=19; i<28; i++){
                        panel.add(label[i]);
                    }
                    
                    for(i=1; i<9; i++){
                        panel.add(txtYazi[i]);
                    }
                    
                    

                    
                    
                    panel.add(button[17]);
//                    panel.add(button[19]);
//                    panel.add(button[20]);
//                    panel.add(button[21]);
                    
                    //---------------------
                    
                    
                    
                    
                    
                    
                    
                    //+++++++++++++++++++
               
               
                button[3].setBounds(10, 320, 200, 20);
                panel.add(button[3]);
                    
                    
                    button[17].addActionListener(new ActionListener()//Değiştir butonu tepkisi
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            
                            
                            System.out.println("'Değiştir' butonuna basıldı!");
                            
                            
                            d_oku.Satırlar[k]=txtYazi[0].getText()+"/"+txtYazi[1].getText()+"/"+txtYazi[2].getText()+"/"+txtYazi[3].getText()+"/"+txtYazi[4].getText()+
                            "/"+txtYazi[5].getText()+"/"+txtYazi[6].getText()+"/"+"/"+txtYazi[8].getText()+"/"+txtYazi[7].getText();

                            //hiz=Integer.parseInt(txtYazi[1].getText());

                            
                            
                            d_oku.temizle();

                            for(int i=0; i<d_oku.sayac; i++){
                                d_oku.yaz(d_oku.Satırlar[i]);
                            }

                        }
                    });
                    
                    
                    
                    
                }
                
                else{
                    System.out.println("Girilen ID bulunamadı!");
                    
                    panel.removeAll();
                    panel.revalidate();
                    panel.repaint();
                    
                    panel.add(label[18]);
                    
                    
                    
                     button[3].setBounds(10, 60, 200, 20);
                   panel.add(button[3]);
                
                }
                
               
                
                    

                
                
                
                
                
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        button[10].addActionListener(new ActionListener()//Bir önceki menüye dön butonu tepkisi
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("'Bir önceki menüye dön' butonuna basıldı!");
                
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                
                panel.add(label[0]);
                
                panel.add(button[0]);
                panel.add(label[1]);
                
                panel.add(button[1]);
                panel.add(label[2]);
                
                panel.add(button[2]);
                panel.add(label[3]);
                
                button[3].setBounds(10, 100, 200, 20);
                panel.add(button[3]);

                
                
                
                
            }
        });
        
        
        button[3].addActionListener(new ActionListener()//Çıkış butonu tepkisi
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("'Çıkış' butonuna basıldı!");
                
                
                
                setSize(100, 100);
                setVisible(false);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                System.exit(0);
                
            }
        });
        
        
        
        
        
        
        
        
        
        
   }
}