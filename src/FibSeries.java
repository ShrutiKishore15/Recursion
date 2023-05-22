public class FibSeries {
    public static int FibNumber(int n){
        if(n==1 || n==2){
            return 1;
        }
        return FibNumber(n-1)+FibNumber(n-2);
    }

    public static void main(String[] args) {
        System.out.println(FibNumber(4));
    }
}
