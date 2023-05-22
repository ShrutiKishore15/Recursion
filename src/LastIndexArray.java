public class LastIndexArray {
    public static int lastIndex(int[] arr, int x, int si){
        if(si== arr.length){
            return -1;
        }
        int li=lastIndex(arr, x, si+1);
        if(li!= -1){
            return li;
        }
        else{
           if(arr[si]==x){
               return si;
           }
           else{
               return -1;
           }
        }
    }

    public static void main(String[] args) {
        int [] input={2,2,2,2};
        System.out.println(lastIndex(input, 2, 0));
    }
}
