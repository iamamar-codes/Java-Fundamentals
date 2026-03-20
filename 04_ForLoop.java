import java.util.Scanner;

class ForLoop {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your Number");
            int num = sc.nextInt();

            int sum = 0;

            for(int i=1; i<=num; i++){
                sum = sum+i;
            }
            System.out.println(sum);
        }
    }
}
