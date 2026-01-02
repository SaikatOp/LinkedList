import java.util.Scanner;
public class Main
{
    public static int linerSearch(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
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
		int result=linerSearch(arr,k);
		System.out.print("Index : ");
		System.out.println(result);
	}
}
