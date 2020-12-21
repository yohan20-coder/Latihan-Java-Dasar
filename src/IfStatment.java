public class IfStatment {

    public static void main(String[] args) {

        var nilaiTugas = 90;
        var nilaiUjian = 75;

        //Materi Contoh Penggunaan If
        if (nilaiTugas >= 90){
            System.out.println("Selamat Anda Mendapatkan Nilai A");
        }

        //Materi Contoh penggunaan If Else
        if (nilaiUjian >= 70){
            System.out.println("Selamat Anda Lulus");
        }else{
            System.out.println("Maaf Anda Tida Lulus");
        }

        //Materi contoh penggunaaan If Bersarang/ElseIf
        if (nilaiTugas >= 90 || nilaiUjian >= 75){
            System.out.println("Selamat Nilai Ujian Anda A");
        }else if (nilaiTugas >= 85 || nilaiUjian >= 70){
            System.out.println("Selamat Nilai Ujian Anda B");
        }else if (nilaiTugas >= 70 || nilaiUjian >= 60 ) {
            System.out.println("Selamat Nilai Ujian Anda  C");
        }else {
            System.out.println("Maaf Nilai Ujian Anda D");
        }

    }

}
