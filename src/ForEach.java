public class ForEach {

    public static void main(String[] args) {
        //materi contoh perulangan foraeach mengakses data array
        String names [] ={
                "Andi", "Imel", "Afila",
                "Isabel", "Lukas", "Peter"
        };

        //akses menggunakan perulangan for biasa
        for (var i = 1; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("======================");

        //akses mengguanakan perulangan for each
        for (var name : names){
            System.out.println(name);
        }
    }

}
