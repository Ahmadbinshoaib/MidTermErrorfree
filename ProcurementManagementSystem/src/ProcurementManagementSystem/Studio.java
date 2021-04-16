/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcurementManagementSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Maria
 */
public class Studio {
    static Studio instance;
    static Studio a= new Studio();
    
    
    
    
    public List<Employee>list= new ArrayList<>();
    public List<Products>product= new ArrayList<>();
    public List<Request>request= new ArrayList<>();
    private Studio()
    {
        
    }
    
     public static Studio getInstance(){
        if(instance==null)
        {
            instance = new Studio();
        }
        
        return instance;
    }
     
     
  
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
   
     public boolean saveData(String filename)
    { boolean flag= false;
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            
            for(int i = 0 ; i < list.size();i++)
            {
                bw.write(list.get(i).getName() + ","+
                        list.get(i).getEmail() + ","+
                        list.get(i).getPhoneNumber()+","+
                        list.get(i).getDesignation()+","+
                        list.get(i).getUsername()+","+
                        list.get(i).getPassword()+","+
                        list.get(i).getEmployeeID()+","+
                        list.get(i).getCNIC()+"\n"
                        
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
            flag= true;
        } catch (Exception ex) {
            flag= false;
        }
        return flag;
        
    }
     
  public void loadData()
    { //Studio a= Studio.getInstance();
        try {
            try (FileReader fr = new FileReader("Employee.txt")) {
                BufferedReader br = new BufferedReader(fr);
                
                String line = br.readLine();
                
                line = br.readLine();
                while(line != null)
                {
                    Employee c = new Employee();
                    String[] toks = line.split(",");
                    
                    c.setName(toks[0]);
                    c.setEmail(toks[1]);
                    c.setPhoneNumber(toks[2]);
                    c.setDesignation(toks[3]);
                    c.setUsername(toks[4]);
                    c.setPassword(toks[5]);
                    c.setEmployeeID(toks[6]);
                    c.setCNIC(toks[7]);
                    list.add(c);
                    line= br.readLine();
                    
                }
                
                
                
                
                
                br.close();
                fr.close();
            }
        } catch (IOException ex) {
           
        }
        
        
    }
     
     
     
     
     public void addProductList( Products a)
    { 
        product.add(a);
      
    }
    
   public void deleteProductList(int a)
   {
       product.remove(a);
   }
   
   public void updateProductList(Products b, int a)
   {
       product.set(a,b);
       
   }
   
   public boolean saveProductData(String filename)
    { boolean flag= false;
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            
            for(int i = 0 ; i < product.size();i++)
            {
                bw.write(product.get(i).getProductName() + ", "+
                        product.get(i).getCompanyName() + ","+
                        product.get(i).getPrice()+","+
                        product.get(i).getQuantity()+","+
                        product.get(i).getType()+"\n"
                        
                        
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
            flag= true;
        } catch (Exception ex) {
            flag= false;
        }
        return flag;
        
    }
   
   public void addRequestList( Request obj)
    {
        request.add(obj);
    }
    
   public void deleteRequestList(int a)
   {
       request.remove(a);
   }
   
   public void updateRequestList(Request b, int a)
   {
       request.set(a,b);
       
   }
   
   public boolean saveRequestData(String filename)
    { boolean flag= false;
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            
            for(int i = 0 ; i < request.size();i++)
            {
                bw.write(request.get(i).getEmpName() + ", "+
                        request.get(i).getEmpUsername() + ","+
                        request.get(i).getProductName()+","+
                        request.get(i).getProductType()+","+
                        request.get(i).getEMPID()+"," +
                        request.get(i).getApproval() + ","+                        
                        request.get(i).getAccRej()+"\n"
                        
                        
                );
            }
            
            bw.flush();
            bw.close();
            fw.close();
            flag= true;
        } catch (Exception ex) {
            flag= false;
        }
        return flag;
        
    }
        
    
}
