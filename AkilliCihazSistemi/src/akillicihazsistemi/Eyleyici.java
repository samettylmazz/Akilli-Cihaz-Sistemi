/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akillicihazsistemi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samet Yılmaz
 */
public class Eyleyici implements IEyleyici{
      private List<IObserver> observerList = new ArrayList<>();
    private String message = "Soğutucu Açıldı";
 private String message1 = "Soğutucu Kapatıldı";
    @Override
    public void ekle(IObserver observer) {
        observerList.add(observer); 
    }

  
    @Override
    public void sogutucuAcik() {
        for (IObserver observer : observerList) {
             observer.bildirim(message);          
        }
    }
    @Override
     public void sogutucuKapali() {
        for (IObserver observer : observerList) {
             observer.bildirim(message1); 
         
           
        }
    }
}
