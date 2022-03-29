/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoonline;

import java.util.ArrayList;

/**
 *
 * @author orinz
 */
public class Member implements User { 
    
    private ArrayList <String> namaMember = new ArrayList <String>(); 
    private ArrayList <String> alamat = new ArrayList <String>(); 
    private ArrayList <String> telepon = new ArrayList <String>(); 
    private ArrayList <Integer> saldo = new ArrayList <Integer>(); 
    
    public Member(){
        this.namaMember.add("Orinn"); 
        this.alamat.add("Blitar"); 
        this.telepon.add("01234"); 
        this.saldo.add(700000); 
        
        this.namaMember.add("Uwen"); 
        this.alamat.add("Tulungagung"); 
        this.telepon.add("01342"); 
        this.saldo.add(550000); 
        
        this.namaMember.add("Rain"); 
        this.alamat.add("Kediri"); 
        this.telepon.add("01293"); 
        this.saldo.add(650000);  
    }
    
    public void setSaldo (int saldo){ 
        this.saldo.add(saldo); 
    }
    
    public int getSaldo(int idMember){ 
        return this.saldo.get(idMember); 
    }
    
    //Untuk perubahan saldo member (yang dinamakan dengan OVERLOAD)  
    public void editSaldo (int saldo, int idMember){
        this.saldo.set(saldo, idMember);
    }
    
    //Untuk mengetahui jumlah data arraylist nama member 
    public int getJmlMember(){ 
        return this.namaMember.size(); 
    } 
    
    
    

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelepon(String Telepon) {
        this.telepon.add(Telepon); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember); 
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
