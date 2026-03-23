class ArrayDemo {
    public static void main(String[] args){
        //Mrthod 1- for initilize array
          int[] arr = {4, 6, 7, 5, 8, 2};

          System.out.println(arr[0]);
          System.out.println(arr[1]);
          System.out.println(arr[2]);
          System.out.println(arr[3]);
          System.out.println(arr[4]);
          System.out.println(arr[5]);
          

        //Method 2- for initilize array
        int[] arr1 = new int [5];
          arr1[0] = 10;
          arr1[1] = 20;
          arr1[2] = 30;
          arr1[3] = 40;
          arr1[4] = 50;

        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

    }
}
