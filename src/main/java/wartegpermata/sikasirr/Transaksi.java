/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wartegpermata.sikasirr;

import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    private List<Barang> daftarBarang = new ArrayList<>();
    private List<Integer> daftarJumlah = new ArrayList<>();

    public void tambahBarang(Barang barang, int jumlah) {
        daftarBarang.add(barang);
        daftarJumlah.add(jumlah);
    }

    public double hitungTotal() {
        double total = 0;
        for (int i = 0; i < daftarBarang.size(); i++) {
            Barang b = daftarBarang.get(i);
            int jumlah = daftarJumlah.get(i);
            total += b.hitungSubtotal(jumlah);
        }
        return total;
    }

    public void resetTransaksi() {
        daftarBarang.clear();
        daftarJumlah.clear();
    }
    public void hapusitemterakhir (){
        if (!daftarBarang.isEmpty()){
            int indeksTerakhir = daftarBarang.size() - 1;
            daftarBarang.remove(indeksTerakhir);
            daftarJumlah.remove(indeksTerakhir);
        }
    }
    
    public boolean kosong (){
        return daftarBarang.isEmpty();
    }
}

     