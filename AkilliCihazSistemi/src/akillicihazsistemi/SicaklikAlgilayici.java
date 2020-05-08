/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akillicihazsistemi;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Samet Yılmaz
 */
public class SicaklikAlgilayici implements ISicaklikAlgilayici{
     @Override
     public int Sicaklik()
    {
        Random random=new Random();
      int sicaklik_degeri=random.nextInt(40);
        System.out.println("Sıcaklık Değeri="+sicaklik_degeri+"°C");
      
     return sicaklik_degeri;
    }
}
