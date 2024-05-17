//it Split string by giver argument
class DeLimiter {
    public static void main(String []eee) {

        String str = "  My Name Is Gaurav";
        String[] result = str.split(" ");
        
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }

    }
}