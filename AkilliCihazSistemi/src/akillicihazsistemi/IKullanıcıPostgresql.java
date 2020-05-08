/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akillicihazsistemi;

import java.sql.Connection;

/**
 *
 * @author Samet Yılmaz
 */
public interface IKullanıcıPostgresql {
      public Kullanıcı ara(String Ad,String Sifre);
     public Connection baglan();
     public Object klon() throws CloneNotSupportedException;
     
}
