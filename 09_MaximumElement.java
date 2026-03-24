class MaximumElement {
    public static void main(String[] args) {
        int[] a = {12, 22, 43, 5, 44, 26};
        int max = a[0];
        //System.out.println(max);
        for(int i=1; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Max is: "+ max);
    }
}
