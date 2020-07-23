/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugass;

/**
 *
 * @author Acer
 */
public class honda extends mobil{
   public void tampilkan(){
 double besarsilinder;
 String bahanbakar;
 String kategori;

 besarsilinder=32.5;
 bahanbakar="solar";
 kategori="Penumpang";

 mobil m = new mobil();

 m.inputData("BRIO", "Merah", "Ekonomis", 5);
 m.tampilkandata();

   System.out.println("silinder :"+besarsilinder);
   System.out.println("jenis bahan bakar :"+bahanbakar);
   System.out.println("jenis kategori :"+kategori);
}
}

