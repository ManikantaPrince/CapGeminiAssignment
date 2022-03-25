import java.util.Scanner;

public class Reverse {
    public void rev(int arr[]){
        int s = arr.length;
        for(int i=s-1;i>=0;i--){
            System.out.print(arr[i]+" ");
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
        Reverse ob = new Reverse();
        ob.rev(array);

    }
}
