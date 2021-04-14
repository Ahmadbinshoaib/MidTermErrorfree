/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcurementManagementSystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maria
 */
public class Studio {
    public List<Employee>list= new ArrayList<>();

   
    public void addList( Employee a)
    {
        list.add(a);
    }
    
   public void deleteEmployee(int a)
   {
       list.remove(a);
   }
   
   public void updateEmployee(Employee b, int a)
   {
       list.set(a,b);
       
   }
    
}
