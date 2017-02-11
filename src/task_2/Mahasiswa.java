/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author Jeremi
 * Nama : Jeremiah Hasudungan 
 * NIM  : 1301154287
 */
public class Mahasiswa {
    
    private String NIM, Nama, Status;
    private char Nilai[];
    private int i;
    
    //Constructor 
    
    public Mahasiswa (String NIM , String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        Status = "Tidak Lulus";
        i=0;
        Nilai = new char[10];

}
    
    public Mahasiswa (){
        Status = "Tidak Lulus";
        i=0;
        Nilai = new char[10];
        
    }
    
    //Setter 
    
     public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
    public void addNilai(char nilai){
        if (i < 10) {
            i++;
            this.Nilai[i] = nilai;
        }
    }
    
    public char getNilai(int i) {
        return Nilai[i+1];
    }
    
    public char cekNilai(Mahasiswa m) {
        char p = 0;
        for (char q = 'A'; q < 'E'; q++) {
            for (int r = 0; r < i; r++) {
                if (Nilai[r] == q) {
                    for (int s = 0; s < m.i; s++) {
                        if (m.Nilai[s] == q) {
                            return q;
                        }
                    }
                }
            }
        }
        return p;
    }
    
    public String toString() {
        String n = NIM + ", " + Nama + ", " + Status + ", "+ "Nilai = ";
        for (int m = 0; m <= i; m++) {
            n = n + Nilai[m] + ",";
        }
        return n;
    }
    
    
    
    
}
