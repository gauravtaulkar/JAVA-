import java.io.*;
class Pattern2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int row= Integer.parseInt(br.readLine());
        int a= 1;
        for (int i=1; i<=row; i++){
            for (int j=1; j<=row;j++){
             System.out.print(a++ +"  ");
            }
            System.out.println();
        }

    }
}