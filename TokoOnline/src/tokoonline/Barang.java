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
public class Barang {
    private ArrayList<String> namaBarang = new ArrayList<String>(); 
    private ArrayList<Integer> stok = new ArrayList<Integer>(); 
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    Barang(){
    this.namaBarang.add("Es krim"); 
    this.stok.add(2); 
    this.harga.add(15000); 
    
    this.namaBarang.add("Sari Roti"); 
    this.stok.add(3); 
    this.harga.add(10000); 
    
    this.namaBarang.add("air putih"); 
    this.stok.add(2); 
    this.harga.add(30000); 
    
    this.namaBarang.add("nasi"); 
    this.stok.add(2); 
    this.harga.add(20000); 
    
    this.namaBarang.add("saos"); 
    this.stok.add(3); 
    this.harga.add(40000);
    }
    
    public void setNamaBarang (String namaBarang){
        this.namaBarang.add(namaBarang); 
    }
    public String getNamaBarang(int idBarang){ 
        return this.namaBarang.get(idBarang); 
    }
    public void setStok(int stok){ 
        this.stok.add(stok);
    }
    public int getStok(int idBarang){ 
       return this.stok.get(idBarang); 
    }
    public void setHarga(int harga){
        this.harga.add(harga); 
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang); 
    }
    //jumlah barang : int 
    public int getJmlBarang(){
        return this.namaBarang.size(); 
    }
    
    public void editStok(int idBarang,int stok){
        this.stok.add(idBarang, stok); 
    }
    
    
    
    
}
