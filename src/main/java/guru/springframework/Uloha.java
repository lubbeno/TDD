package guru.springframework;

public class Uloha {
    public static void main(String[] args) {
        ukol(5);
    }

    public static void ukol(int x){

        int numberOf;
        int nubmerOfspace;
        for(int i = 1; i <= x; i++){
            nubmerOfspace = x-i;
            numberOf=i;
            for(int j = 0; j< nubmerOfspace;j++ ){
                System.out.print(" ");
            }
            for (int b =0; b<numberOf; b++) {
                System.out.print("@");
            }
            System.out.print("\n");
        }

    }
}
