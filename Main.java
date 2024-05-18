import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Element appears once: ");
        for (int i = 0 ; i < size ; i++){
            int count = 0;
            for(int j = i + 1 ; j <size ; j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] = 0;
                }
            }
            if(count == 0 && arr[i]!=0){
                System.out.println(arr[i]);
            }
        }
    }
}