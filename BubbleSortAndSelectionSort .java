import java.util.Scanner;
public class Main
{
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    // public static void selectionSort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         int min=i;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[min]>arr[j]){
    //                 min=j;
    //             }
    //         }
    //         int temp=arr[min];
    //         arr[min]=arr[i];
    //         arr[i]=temp;
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		bubbleSort(arr);
		//selectionSort(arr);
		
	}
}
