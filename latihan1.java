import java.io.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
public class latihan1 {
    public static void main (String[]args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int menu1;
        do {
            System.out.println("Datetime");
            System.out.println("1. Class yg digunakan bisa dua class yaitu class Date atau class Calendar. \n Class Calendar memiliki spesifik method untuk konversi waktu dan tanggal. \n import java.util.Calendar ");
            System.out.println("2. Inisiasi class-nya adalah \nCalendar (var) = Calendar.getInstance() ");
            System.out.println("3. Beberapa contoh implementasi class Calendar ");
            System.out.println("4. SimpleDateFormat ");
            System.out.print("Pilih menu :\n Tekan 0 untuk keluar program\n");
            System.out.println();
            menu1 = Integer.parseInt(br.readLine());
            switch (menu1){
                case 3:
                    System.out.println("3. Beberapa contoh implementasi class Calendar");
                    String menu2 = null;
                    Calendar calendar = Calendar.getInstance();
                    do {
                        System.out.println("A. Ambil tanggal sekarang");
                        System.out.println("B. Spesifik Tanggal, Bulan, Tahun");
                        System.out.println("C. Menampilkan waktu 15 hari yg lalu");
                        System.out.println("D. Menampilkan waktu 4 bulan yg akan datang");
                        System.out.println("E. Menampilkan waktu 2 tahun yg akan datang");
                        System.out.print("Pilih menu :  \nTekan 0 untuk kembali ke menu utama\n");
                        menu2 = br.readLine();
                        System.out.println();
                        switch(menu2){
                            case "A":
                                System.out.println("A. Ambil tanggal sekarang");
                                System.out.println("Waktu sekarang adalah " + calendar.getTime());
                                System.out.println();                            
                                break;
                            case "B":
                                System.out.println("B. Spesifik Tanggal, Bulan, Tahun");
                                System.out.println("Tanggal : " + calendar.get(Calendar.DATE));
                                System.out.println("Bulan   : " + calendar.get(Calendar.MONTH));
                                System.out.println("Tahun   : " + calendar.get(Calendar.YEAR));
                                System.out.println(); 
                                break;
                            case "C":
                                System.out.println("C. Menampilkan waktu 15 hari yg lalu");
                                calendar.add(Calendar.DATE, -15);
                                System.out.println("15 hari yang lalu: " + calendar.getTime());
                                System.out.println(); 
                                break;
                            case "D":
                                System.out.println("D. Menampilkan waktu 4 bulan yg akan datang");
                                calendar.add(Calendar.MONTH, 4);
                                System.out.println("4 bulan kemudian: " + calendar.getTime());
                                System.out.println();
                                break;
                            case "E":
                                System.out.println("E. Menampilkan waktu 2 tahun yg akan datang");
                                calendar.add(Calendar.YEAR, 2);
                                System.out.println("2 tahun kemudian: " + calendar.getTime());
                                System.out.println();
                                break;
                        }
                    } while (!menu2.equals("0"));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("4. SimpleDateFormat ");
                    System.out.println("SimpleDateFormat berfokus utk memformat dan parsing data tanggal dan waktu serta normalisasi waktu.");
                    System.out.println("library: import java.text.SimpleDateFormat \n cara inisiasi: SimpleDateFormat (var) = new SimpleDateFormat(format)");
                    
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
                    String dateFormated = sdf.format(new Date());
                    System.out.println("Format tanggal default : " + new Date());
                    System.out.println("Format tanggal dengan format : " + dateFormated);
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
            }
        
        } while(menu1 != 0);
        
    }
}