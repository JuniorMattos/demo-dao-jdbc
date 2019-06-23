/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author Junior
 */
public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("---------- TEST 1: seller finById ----------");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);

        System.out.println("");

        System.out.println("---------- TEST 2: seller finByDepartment ----------");
        Department department = new Department(3, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("");

        System.out.println("---------- TEST 3: seller finByDepartment ----------");
        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("");

       /* System.out.println("---------- TEST 4: seller insert ----------");
        Seller newSeller = new Seller(null, "Greg Black", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id: " + newSeller.getId());*/
       
        /*System.out.println("---------- TEST 5: seller update ----------");
        seller = sellerDao.findById(9);
        seller.setName("Seth Yellow");
        seller.setEmail("seth@gmail.com");
        seller.setBirthDate(new Date());
        seller.setDepartment(department);
        sellerDao.update(seller);
        System.out.println("Update Completed!");*/
        
        /*System.out.println("---------- TEST 6: seller delete ----------");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Completed!");*/
        
        sc.close();
    }
}
