import java.io.*;
class Pattern6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int row= Integer.parseInt(br.readLine());

        for (int i=1; i<=row; i++){
            int a= 1;
            for (int j=1; j<=row-i+1;j++){
                System.out.print(a++ +"  ");
            }
            System.out.println();
        }
    }
}