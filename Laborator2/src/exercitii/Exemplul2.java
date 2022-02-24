package exercitii;

public class Exemplul2 {

    public static void main(String[] args) {
        int value = 20;

        if (value % 2 == 0) {
            System.out.println("numarul este par");
        } else if (value > 10){
            System.out.println("numarul este impar mai mare ca 10");
        } else {
            System.out.println("numarul este impar mai mic ca 10");
        }

        if (value < 10) {
            System.out.println("numarul este mai mic decat 20");
        } else if (value != 20) {
            System.out.println("numarul nu este egal cu 20");
        } else {
            System.out.println("numarul este mai mare decat 20");
        }

        switch (value) {
            case 5:
                System.out.println("numarul este 5");
                break;
            case 10:
                System.out.println("numarul este 10");
            case 20:
                System.out.println("numarul este 20");
                break;
            default:
                System.out.println("numarul nu a fost gasit");
                break;
        }
    }
}
