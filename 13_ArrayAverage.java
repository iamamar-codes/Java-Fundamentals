class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int sum = 0;

        //Calculate Sum
        for(int i=0; i<arr.length; i++){
            sum = sum+ arr[i];
        }

        //Calculate Average
        double avg = (double) sum/arr.length; //type casting
        System.out.println(avg);
    }
}
