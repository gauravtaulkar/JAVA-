
import java.io.*;
class Pattern{
    public static void main(String []args ) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());

        for (int i=1;i<=row;i++){
            for (int j=1; j<=row-i+1;j++){
                System.out.print("   ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k +"  ");
            }
            System.out.println();
        }

    }
}