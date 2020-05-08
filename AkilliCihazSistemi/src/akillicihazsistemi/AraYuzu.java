/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akillicihazsistemi;

import java.util.Scanner;

/**
 *
 * @author Samet Yılmaz
 */
public class AraYuzu implements  IAraYuzu{
       private static AraYuzu instance = null;
     private AraYuzu()
    {
    
    }
    public synchronized static AraYuzu getInstance()
    {
       
        if(instance == null)
        {
            instance  = new AraYuzu();
        }
        return instance;
    }
       @Override
      public void dogrula(KullanıcıPostgresql kullanıcıPostgresql)
          {
              
              Scanner giris = new Scanner(System.in);
    
       
        String kullaniciadi=null;
        Kullanıcı kullanıcı=null;
        String  sifre= null;
        int cevap;     
    
  
        Kullanıcı kullanıcı1=new Kullanıcı();
        
        Eyleyici  eyleyici=new Eyleyici();
       eyleyici.ekle(kullanıcı1);
       
       SicaklikAlgilayici sicaklik=new SicaklikAlgilayici();
       
        System.out.println("*********************HOŞGELDİNİZ**************************");

       System.out.println("Lütfen Kullanıcı Adınızı ve Şifrenizi Giriniz");
       
          System.out.print("Kullanıcı Adınız="); 
          kullaniciadi=giris.nextLine();
         
        System.out.print("Şifreniz="); 
        sifre=giris.nextLine();
        
        kullanıcı=kullanıcıPostgresql.ara(kullaniciadi,sifre);
        if(kullanıcı!=null)
        {          
              System.out.println("Sistemde kayıtlı Kullanıcı Adı=" + kullaniciadi + ";");
            System.out.println("Sistemde kayıtlı Şifre="+ sifre + ";");
            System.out.println("***************************************************************");
                  
            gidilecekYer: do {
            System.out.println("1.Sıcaklık Görüntüle");
            System.out.println("2.Soğutucu Aç");
            System.out.println("3.Soğutucu Kapa");
                System.out.println("4.Sistemden Çıkış Yapınız");
           
            System.out.print("Lütfen Yapıcağınız İşlemi Seçiniz=");  
                cevap=giris.nextInt();
         if (cevap!=4) 
           {
               switch(cevap)
                   {
                     case 1:
                      sicaklik.Sicaklik();
                         break;
                        case 2:
                         eyleyici.sogutucuAcik();
                          break;
                            case 3:
                                 eyleyici.sogutucuKapali();
                             break;
                                 default:
                                   System.out.println("Hatalı Seçim!!");
                                     break;
                    }
                    System.out.println("Devam Etmek istiyor musunuz ? (e/h)");
                    String x1=giris.next();
                    char x2 = x1.charAt(0);
 
                    if(x2=='e'||x2=='E')
                    {
                         continue gidilecekYer; 
                    }
                    else
                    {
                         System.out.println("Sistemden Çıkış Yapıldı");
                             break;
                    }
            }
       
                
    else
       {
           System.out.println("Sistemden Çıkış Yaptınız");
             break;
        }
 
  } while(true);
                                         
        }
        
        else
            System.out.println("Kullanıcı Adı veya Şifre yanlış");

          }
}
