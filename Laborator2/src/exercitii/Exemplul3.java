package exercitii;

public class Exemplul3 {
    /*
        for
        while
        do while
     */

    public static void main(String[] args) {
        int n = 10;
        int suma = 0;

        for(int i = 0; i <= n; i++){
            suma += i;
        }
        System.out.println("suma numerelor este:" + suma);

        suma = 0;
        while(n > 0) {
            suma += n;
            n--;
        }
        System.out.println("suma numerelor este:" + suma);

        n = 10;
        suma = 0;
        do {
            suma += n;
            n--;
        } while (n > 0);

        System.out.println("suma numerelor este:" + suma);

        System.out.println("suma numerelor este:" + getSumaNumerelor(10));
    }

    public static int getSumaNumerelor(int n) {
        if(n == 0){
            return 0;
        } else
            return getSumaNumerelor(n-1) + n;
    }
}
