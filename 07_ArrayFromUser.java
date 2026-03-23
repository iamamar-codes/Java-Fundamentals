import java.util.Scanner;

class ArrayFromUser {
    public static void main(String[] args) {
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of Array: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        for(i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Printed Array Elements ");
        for(i=0; i<size; i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
}
