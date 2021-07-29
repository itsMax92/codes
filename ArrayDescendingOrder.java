public class ArrayDescendingOrder {

    public static void main(String... args){

        int[] arr = new int[]{5,2,8,7,1};
        int temp = 0;

        System.out.println("original Array: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[j] > arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Descending Order: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
