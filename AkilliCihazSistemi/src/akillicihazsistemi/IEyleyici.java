/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akillicihazsistemi;

/**
 *
 * @author Samet Yılmaz
 */
public interface IEyleyici {
     public void ekle(IObserver observer);
  public void sogutucuAcik();
   public void sogutucuKapali();
}
