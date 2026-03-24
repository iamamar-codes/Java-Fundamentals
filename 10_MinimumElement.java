class MinimumElement {
    public static void main(String[] args) {
        int[] a = {12, 22, 43, 5, 44, 26};
        int min = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum is: "+ min);
    }
}
