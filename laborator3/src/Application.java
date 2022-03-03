public class Application {

    public static void main(String[] args) {
        System.out.println("Second app");

        int[] vec = new int[10]; //intializare array
        vec[0] = 0;
        vec[1] = 1;

        //vec[20] = 20;  Exception Index out of bounds

        for(int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
        /*for(var number : vec) {
            System.out.println(number);
        }*/

        String[] words = new String[2];
        words[0] = "primul";
        words[1] = "al_Doi-lea";

      /*  String[] arr = new String[0];
        arr[0] = "first";*/


        int[][] matrice = new int[2][2];
        matrice[0][0] = 0;
        matrice[0][1] = 1;

        int num = 10;
        System.out.println("Value before change" + num);

        changeInt(num);
        System.out.println("Value after change" + num);

    }

    public static void changeInt(int value) {
        value = 20;
    }
}
