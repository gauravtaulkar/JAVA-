
import java.io.*;
class Pattern9{
    public static void main(String []args ) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());

        for (int i=1;i<=row;i++){
            int a=4;
            for (int j=1; j<=row-i+1;j++){
                System.out.print("   ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(a-- +"  ");
            }
            System.out.println();
        }

    }
}