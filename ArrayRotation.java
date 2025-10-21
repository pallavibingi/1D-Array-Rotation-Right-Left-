import java.util.Scanner;
import java.util.Arrays;
public class ArrayRotation {
    public static void rotateRight(int arr[],int r,int n){
        for(int i=0;i<r;i++){
                int last=arr[n-1];
                for(int j=n-1;j>0;j--){
                   
                    arr[j]=arr[j-1];
                   
                }
                arr[0]=last;
            }
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateLeft(int arr[],int r,int n){
         for(int i=0;i<r;i++){
                int first=arr[0];
                for(int j=1;j<arr.length;j++){
                    arr[j-1]=arr[j];
                }
                arr[arr.length-1]=first;
            }
         System.out.println(Arrays.toString(arr));

    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size:");
        int n= sc.nextInt();

        int[] arr= new int[n];
        int[] newArr= new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Enter shift(right/left):");
        String shift=sc.nextLine();

        System.out.println("Enter the no.of rotations:");
        int rotations=sc.nextInt();

        int r=rotations%n;

      if(shift.equals("right")){
           rotateRight(arr, r, rotations);
        }
        else if(shift.equals("left")){
            rotateLeft(arr, r, rotations);
        }
        else{
            System.out.println("invalid input");
        }

        
    }
}