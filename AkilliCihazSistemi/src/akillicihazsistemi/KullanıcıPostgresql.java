/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akillicihazsistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Samet Yılmaz
 */
public class KullanıcıPostgresql implements IKullanıcıPostgresql{
      private static KullanıcıPostgresql instance = null;
    
    private KullanıcıPostgresql()
    {
    
    }
    public synchronized static KullanıcıPostgresql getInstance()
    {
       
        if(instance == null)
        {
            instance  = new KullanıcıPostgresql();
        }
        return instance;
    }
    
    @Override
     public Object klon() throws CloneNotSupportedException 
    {
        throw new CloneNotSupportedException("Ben eşsiz bir parçayım");
    }
    
     @Override
    public Connection baglan()
    {
     Connection connect=null;
  
        try {
            connect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/sogutucu","postgres", "aslanbarca5234");
            if (connect != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");

        } catch (Exception e) {
            e.getMessage();
           
        }
        return connect;
    
    }
    
   @Override
   public Kullanıcı ara(String Ad,String Sifre){
        System.out.println(" Yetkili Kullanıcı aranıyor...");
        Kullanıcı kullanıcı=null;

      
        Connection connect=this.baglan();
        try{
            Statement stmt = connect.createStatement();           
            ResultSet rs = stmt.executeQuery("SELECT * FROM kullanici where isim='" + Ad + "' ;");
            rs=stmt.executeQuery("SELECT * FROM kullanici where sifre='" + Sifre+ "' ;");
         
            connect.close();  
            
            String kullaniciadi;
            String sifre;
            while(rs.next())
            {
              kullaniciadi=rs.getString("isim");
              sifre=rs.getString("sifre");
              kullanıcı=new Kullanıcı(kullaniciadi, sifre);
                    
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kullanıcı;
    }
}
