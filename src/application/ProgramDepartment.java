/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author Junior
 */
public class ProgramDepartment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("---------- TEST 1: department finById ----------");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("");

        System.out.println("---------- TEST 2: department finAll ----------");
        List<Department> list = departmentDao.findAll();

        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("");

        /*System.out.println("---------- TEST 3: department insert ----------");
        Department newDepartment = new Department(null, "Game");
        departementDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());*/

        /*System.out.println("---------- TEST 4: seller update ----------");
        department = departmentDao.findById(5);
        department.setName("Games");
        departmentDao.updade(department);
        System.out.println("Update Completed!");*/
 
        /*System.out.println("---------- TEST 5: department delete ----------");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete Completed!");*/
        
        sc.close();
    }
}
