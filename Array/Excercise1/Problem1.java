// take values for array and print sum of odd elements
import java.io.*;
class p1{
    public static void main(String[] args) throws IOException{
        int a=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int size= Integer.parseInt(br.readLine());
        int arr[]= new int[size];
        System.out.println("Enter the value in array");
        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]%2==1){
                a= arr[i]+a;
            }
        }
        System.out.println(a);
    }
}
