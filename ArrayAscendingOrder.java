import java.util.Scanner;

public class ArrayAscendingOrder {
    public static void main(String... args){

        Scanner scan= new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the size of an Array: ");
        int n = scan.nextInt();

        System.out.println("Enter the Elements of Array: ");
        for (int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("original Array: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        int temp = 0;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println();
        System.out.println("Array in Ascending Order: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }


    }
}
