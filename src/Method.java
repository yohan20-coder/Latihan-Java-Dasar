public class Method {

    public static void main(String[] args) {
        sayHelloWorld();     //Pemanggilan method di main function
        paramHello("Yohanes","Ardianus");  //Pemanggilan method menggunakan parameter di main function
        paramHello("Imelda","Cantik");  //Pemanggilan method menggunakan parameter di main function
    }

    //Materi Contoh Membuat method di java
    // NB : Pembuatan method diawali dengan huruf kecil
    static void sayHelloWorld(){
        System.out.println("Hello Andi");
    }

    //contoh penggunaan method parameter
    static void paramHello(String firstname, String lastname){
        System.out.println("Hello My Firstname "+firstname+" and My Lastname "+lastname);
    }
}
