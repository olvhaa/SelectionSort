import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz ile tablica ma mieć miejsc");
        int wybor_size = scanner.nextInt();
        System.out.println("Czy tablicę wygenerować? Czy podajesz wartości z klawiatury?");
        System.out.println("Wpisz 1 lub 2");
        int wybor = scanner.nextInt();

        double[] numberArray = new double[wybor_size];
        double[] sorterArray = new double[wybor_size];

        if (wybor == 1) {
            System.out.println("Podaj dolny zakres tablicy");
            int dolny = scanner.nextInt();
            System.out.println("Podaj górny zakres tablicy");
            int gorny = scanner.nextInt();
            System.out.println("Tablica jest nie posortowana.");
            for (int i = 0; i < wybor_size; i++) {
                numberArray[i] = (int) (Math.random() * (gorny - dolny)) * dolny;
                System.out.print(numberArray[i] + ", ");
            }
            System.out.println();
            System.out.println("Posortowana tablica.");

            sorterArray = selectionSort(numberArray);
            for (int i = 0; i < wybor_size; i++) {
                System.out.print(sorterArray[i] + ", ");
            }
        } else if (wybor == 2) {
            System.out.println("Wprowadź kolejno " + wybor_size + " liczb.");
            for (int i = 0; i < wybor_size; i++) {
                numberArray[i] = scanner.nextInt();
            }
            System.out.println("Nieposortowana tablica");
            for (int i = 0; i < wybor_size; i++) {
                System.out.print(numberArray[i] + ", ");
            }
            System.out.println();
            System.out.println("Posortowana tablica");
            double[] sortedArray = selectionSort(numberArray);

            for (int i = 0; i < wybor_size; i++) {
                System.out.print(sortedArray[i] + ", ");
            }
        }
    }

    public static double[] selectionSort(double[] numberArray) {
        int n = numberArray.length;


        for (int i = 0; i < n - 1; i++) {

            int k = i;
            for (int j = i + 1; j < n; j++)
                if (numberArray[j] < numberArray[k])
                    k = j;
            double temp = numberArray[k];
            numberArray[k] = numberArray[i];
            numberArray[i] = temp;
        }
        return numberArray;
    }
}





















































/*import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Czy tablice wygenerowac czy podajesz wartosci z klawiatury?");
        //System.out.println("Wpisz 1 - wypisywanie z klawiatury");

        // String choice = scanner.nextLine();
        System.out.println("Ile liczb  posortowac");
        int sizeArray = scanner.nextInt();
        int[] numberArray = new int[sizeArray];
        scanner.nextLine();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Czy tablice wygenerowac czy podajesz wartosci z klawiatury?");
        System.out.println("Wpisz 1 - wypisywanie z klawiatury");
        String choice = scanner.nextLine();

        if (!choice.equals("1")) {
            System.out.println("Podaj zakres dolny losowania liczb");
            int start = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Podaj zakres gorny losowania liczb");
            int end  = scanner.nextInt();
            scanner.nextLine();

//           System.out.println("Tablica jest nieposortowana");
            for (int i = 0; i < sizeArray; i++) {
                numberArray[i] = (int) (random() * (end - start)) +start;
                System.out.print(numberArray[i] + ", ");

            }
        } else {
            System.out.printf("Wprowadz kolejno %d liczb\n", sizeArray);
            for (int i = 0; i < sizeArray; i++) {
                numberArray[i] = scanner.nextInt();


            }
            for (int i = 0; i < sizeArray; i++) {
                System.out.print(numberArray[i] + ", ");
            }


        }


        System.out.println();
        System.out.println("Tablica jest posortowana");
        double[] sortedArray = new double[sizeArray];
        sortedArray = selectionSort(numberArray);
        for (int i = 0; i < sizeArray; i++) {
            System.out.print(sortedArray[i] + ", ");
        }


    }
    public static double[] selectionSort(double[] numberArray){
        int size = numberArray.length;
        int k;
        double temp;
        for(int i = 0; i < size; i++){
            k = i;
            for(int j = i + 1; j < size; j++){
                if(numberArray[j] < numberArray[k]) k = j;
                temp = numberArray[k];
                numberArray[k] = numberArray[i];
                numberArray[i] = temp;
            }
        }
        return numberArray;
    }

}
*/
