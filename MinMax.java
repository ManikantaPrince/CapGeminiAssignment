public class MinMax {
    public int FindMax(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public int FindMin(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {9,12,67,42,56};
        MinMax obj=new MinMax();
        System.out.println("Maximum value in the array is::"+obj.FindMax(arr));
        System.out.println("Minimum value in the array is::"+obj.FindMin(arr));

    }
}
