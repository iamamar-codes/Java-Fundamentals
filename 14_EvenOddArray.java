import java.util.Scanner;
class EvenOddArray {
    public static void main(String[] args) {
        int size, i;
        int evenCount = 0;
        int oddCount = 0;
        Scanner sc = new Scanner(System.in);

        //Take size of Array
        System.out.print("Enter Array Size: ");
        size = sc.nextInt();
        int arr[] = new int[size];

        //Take array elements
        System.out.print("Enter element: ");
        for(i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        
        //Count even and odd
        for(int elements: arr){
            if(elements % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Even = " + evenCount);
        System.out.println("odd = " + oddCount);
        
        sc.close();
    }
}
