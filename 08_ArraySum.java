class ArraySum {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int result= 0;
        for(int Elements: a){
            result= result + Elements;
        }
        System.out.println("Sum of Array is: " + result);


        float [] arr = {10.5f, 76.3f, 65.5f, 22.5f};
        float sum = 0;
        for(float Elements: arr){
            sum = sum + Elements;
        }
        System.out.println("The sum of Array is: "+ sum);
    }
}
