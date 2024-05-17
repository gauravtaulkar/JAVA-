
import java.io.*;
class Pattern4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int row= Integer.parseInt(br.readLine());
        int a= 4;
        for (int i=1; i<=row; i++){
            for (int j=1; j<=i;j++){
                System.out.print( a+"  ");
                a=a+4;
            }
            System.out.println();
        }
    }
}