
package subProgram;
//step 1
import java.io.*;

public class subProgram_Latihan1 {
    public static int totalSPP; //variabel global (bisa dibaca disemua blok program)
    
    public static void main(String[] args) {
        //step 3: deklarasi bufferedreader
        BufferedReader br = new BufferedReader 
        (new InputStreamReader (System.in));
        
        /*soal latihan 1:
            membuat program utk menghitung
            total SPP mahasiswa berdasarkan 
            jumlah semester yang sudah ditempuh
        */
        
        //step 2
        try {
            do {                
                //Variabel
                String nim, nama;
                int jml_semester;

                //Menu dg Switch-Case
                System.out.println("---------------");
                System.out.println("1. Input Data");
                System.out.println("2. Output Data");
                System.out.println("3. Logout");
                System.out.println("---------------");
                System.out.print("Pilih menu : ");
                //inputan dg bufferedreader (tipe: int)
                int menu = Integer.parseInt(br.readLine());

                switch(menu){
                    case 1: //menu 1
                        System.out.print("Isi NIM : ");
                        //input BR tipe String
                        nim = br.readLine();
                        System.out.print("Isi Nama : ");
                        nama = br.readLine();
                        System.out.print("Isi Semester yg "
                                + "Sudah Ditempuh : ");
                        jml_semester = Integer.parseInt(br.readLine());
                        
                        //cara call function/fungsi
                        total_SPP(jml_semester);
                        //gunakan println jika di dalam fungsi tidak ada 
                        //System.out.println
                        System.out.println("Total SPP : " +
                                total_SPP(jml_semester));
                        
                        break; //program break
                    case 2: //menu 2 
                        //cetak data (nim, nama, jml semester, total spp)
                        break;
                    default: //else 
                        System.exit(0); //perintah keluar program
                }
            } while (true);          
            
        } catch (Exception e) {
            //jika ada kesalahan dari blok try
            //kelebihan: pesan error mudah dipahami
            System.out.println("Error adalah "
                    + e.getMessage());
        }
    }
    
    //membuat fungsi
    static public int total_SPP(int smt){ //int smt --> parameter
       //nilai yg dikembalikan = variabel total SPP
       //contoh: 4 smt x 15.000.000 = 60.000.0000
        totalSPP = smt * 15000000;
        return totalSPP;
    }
    
    //membuat prosedur
    static public void cetakData(){
        
    }
    
}
