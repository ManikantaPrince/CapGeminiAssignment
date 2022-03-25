import java.util.Scanner;

public class Sort{
    public void SortArray(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    s = a[i];
                    a[i] = a[j];
                    a[j] = s;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int len = sc.nextInt();
        int[] array = new int[len];
        for(int i =0;i<len;i++){
            array[i] = sc.nextInt();
        }
        Sort ob = new Sort();
        ob.SortArray(array);

    }
}

