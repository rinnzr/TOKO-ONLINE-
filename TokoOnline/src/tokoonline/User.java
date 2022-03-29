/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoonline;

/**
 *
 * @author orinz
 */
public interface User {
    
    public abstract void setNama (String nama); 
    public abstract void setAlamat (String alamat); 
    public abstract void setTelepon (String Telepon); 
    
    public String getNama (int id); 
    public String getAlamat (int id); 
    public String getTelepon (int id); 

}
