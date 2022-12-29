import java.util.Scanner;
/*
In this section we will see how to find second-largest number in given array.
_______________________________________________________________________________
Question : find the second-largest element in given array and in array answer will always present.
___________________________________________________________________________________________________
Algorithm : first find maximum and mark them as infinite and then again find maximum and print the result.
 */
class largest{
    static int findLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int findFirstLargest(int arr[]){
        int max = findLargest(arr);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int SecondArray = findLargest(arr);
        return SecondArray;
    }
}
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the value of array : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println("first printing the of arrays :" + arr[i]);
        }
            System.out.println();
            System.out.println("Now printing the result : " + largest.findFirstLargest(arr));
    }
}