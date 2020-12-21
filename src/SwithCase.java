public class SwithCase {

    public static void main(String[] args) {

        var nilai = "B";

        //Mater Contoh Penggunaan SwitchCase Sederhana
        switch (nilai) {
            case "A" :
                System.out.println("Selamat Nilai Anda Sangat Baik");
                break;
            case "B" :
            case "C" :
                System.out.println("Selamat Nilai Anda Cukup Baik");
                break;
            default:
                System.out.println("Maaf Anda Tidak Lulus");
        }

        //Materi Contoh Penggunaan SwitchCase Lambda
        switch (nilai){
            case "A" -> System.out.println("Nilai Sangat baik");
            case "B", "C" -> System.out.println("Nilai Cukup Baik");
            default -> {
                System.out.println("Maaf Anda Tidak Lulus");
            }
        }
    }

}
