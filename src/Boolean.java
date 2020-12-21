public class Boolean {

    public static void main(String[] args) {

        var nilai = 80;
        var absen = 70;

        //Materi boolean
        System.out.println(nilai > absen);
        System.out.println(nilai < absen);

        //Materi Kondisi if else menggunakan And
        if (nilai > 85 && absen > 60){
            System.out.println("Selamat Anda Lulus");
        }else{
            System.out.println("Maaf Anda Kurang Beruntung");
        }

        //Materi kondisi if else menggunakan OR
        if (nilai > 85 ||  absen > 60){
            System.out.println("Selamat Anda Lulus");
        }else{
            System.out.println("Maaf Anda Tidak Lulus");
        }
    }

}
