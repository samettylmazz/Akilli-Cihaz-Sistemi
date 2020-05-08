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
public class AkilliCihazSistemi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        AraYuzu araYuzu=AraYuzu.getInstance();
        KullanıcıPostgresql kullanıcıPostgresql=KullanıcıPostgresql.getInstance();
        araYuzu.dogrula(kullanıcıPostgresql);
        
    }
}
