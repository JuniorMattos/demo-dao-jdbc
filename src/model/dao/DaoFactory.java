/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.doa.impl.SellerDaoJDBc;

/**
 *
 * @author Junior
 */
public class DaoFactory {
    
    private static SellerDao createSellerDao(){
        return new SellerDaoJDBc();
    }
}
