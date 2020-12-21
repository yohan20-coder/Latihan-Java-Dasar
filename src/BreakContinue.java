public class BreakContinue {

    public static void main(String[] args) {
        //Materi Contoh Perulangan dengan mengguakan keyword break
        var angka = 1;
        while (true){
            System.out.println("Perulangan Ke "+angka);
            angka++;

            if (angka > 10){
                break;
            }
        }

        System.out.println("Perulangan Berhenti");

        //Materi Contoh Penggunaan Perulangan dengan menggunakan keyword Continue
        for(int nilai = 1; nilai <= 100; nilai++){
            if(nilai % 2 == 0){
                continue;
            }

            System.out.println("Perulangan Ganjil "+ nilai);
        }

    }

}
