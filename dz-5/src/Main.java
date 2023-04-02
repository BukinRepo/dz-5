public class Main {

    public static void main(String[] args) {
        int a = 8;
        int b = 10;
        int c = 7;
        int d = 13;

        int sumAB = a + b;
        int sumCD = c + d;

        System.out.println(sumAB>sumCD);

        sumAB++;
        sumCD--;
        sumCD--;

        System.out.println(sumAB>sumCD);

        System.out.println(sumAB%2==0 || sumCD%2==0);
    }




}
