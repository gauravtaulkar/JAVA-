import java.io.*;
class Pattern5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int row= Integer.parseInt(br.readLine());
        int a= 10;
        char ch='j';
        for (int i=1; i<=row; i++){
            for (int j=1; j<=i;j++){
                if(i%2==0){
                   System.out.print(ch +"  ");
                }
                else{
                    System.out.print(a +"  ");
                }
                ch--;
                a--;
            }
            System.out.println();
        }
    }
}