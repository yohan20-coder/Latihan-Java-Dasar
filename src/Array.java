public class Array {

    public static void main(String[] args) {

        //Materi Contoh pengguna Array
        String nama [] = {
               "Andi", "Imel", "Ahmad", "Candra"
        };

        System.out.println(nama[3]);

        //Membuuat Array Dalama Array
        String name[][]= new String[][]{
                {"Andi", "Rosa"},
                {"Imel","Fini"},
                {"Raya","Afila"}
        };

        System.out.println(name[1]);
        System.out.println(name[0][1]);
        System.out.println(name[1][0]);
        System.out.println(name[2][1]);

        //Mengubah isi array dan menghitung panjang array menggunakan lenght
        int angka[] = {
                10, 11, 12, 13, 14
        };

        angka [0] = 20;     //mengubah isi value di array angka

        System.out.println(angka[0]);
        System.out.println(angka.length);   // menghitung banyaknya data dalam array angka

    }

}
