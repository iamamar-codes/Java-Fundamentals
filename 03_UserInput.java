import java.util.Scanner;
 class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int Age = sc.nextInt();
        if(Age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Minor");
        }

    }
}
