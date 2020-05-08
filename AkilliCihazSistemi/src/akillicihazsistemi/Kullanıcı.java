/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akillicihazsistemi;

import java.util.Random;


/**
 *
 * @author Samet Yılmaz
 */
public class Kullanıcı implements IObserver{
      private String kullaniciadi;
    private String sifre;
     
    public Kullanıcı()
    {
    
    }
 
         
    @Override
    public void bildirim(String message) {
        System.out.println( message);
    }
     
    public Kullanıcı(String KullanıcıAdı,String Sifre)
    {
    this.kullaniciadi=KullanıcıAdı;
    this.sifre=Sifre;
    }
}
