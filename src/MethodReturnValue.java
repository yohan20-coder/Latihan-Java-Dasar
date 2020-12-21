public class MethodReturnValue {

    public static void main(String[] args) {
        //Materi contoh penggunaan method return value
        var c = sum(300,200);       //pemanggilan method return value
        System.out.println(c);
    }

    //karna tipe data integer maka keyword void diganti int
    static int sum(int value1, int value2){
        int total = value1 + value2;
        return total;
    }

}
