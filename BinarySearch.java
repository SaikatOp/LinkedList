import java.util.Scanner;
public class Main
{
    // public static int linerSearch(int arr[],int k){
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==k){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    
    public static int binarySearch(int arr[],int k){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]>k){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
    
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
// 		int result=linerSearch(arr,k);
        int result=binarySearch(arr,k);
		System.out.print("Index : ");
		System.out.println(result);
	}
}
