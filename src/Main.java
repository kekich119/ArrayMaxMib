import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напиши размер массива: ");

        int size = in.nextInt();

        int arraya[] = new int[size];
        for (int i = 0; i<size; i++){
            System.out.print(i+1 +" Число: ");
            arraya[i] = in.nextInt();

        }
        for (int i = 0; i<arraya.length;i++){

            System.out.print(arraya[i]+",");
            if (i==arraya.length){
                System.out.println(arraya[i]);
            }

        }
        System.out.println();

        int max = getMax(arraya);
        System.out.println("Самое большое число: " + max);
        int min = getMin(arraya);
        System.out.println("Самое маленькое: " + min);

    }


    public static int getMax(int [] inputArray){
        int maxValue = inputArray[0];
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }

        return maxValue;
    }

    public static int getMin(int [] inptArray){
        int minValue = inptArray[0];
        for (int i = 0; i<inptArray.length; i++){
            if (inptArray[i] < minValue){
                minValue = inptArray[i];
            }
        }

        return minValue;
    }


}
