public class ArraySort {
    public static boolean checkArraySorted(int[] arr){
        if(arr.length ==1){
            return true;
        }
        if(arr[0]<arr[1]){
            int[] newArr= new int[arr.length-1];
            for(int i=1; i< arr.length; i++){
                newArr[i-1]=arr[i];
            }
            return checkArraySorted(newArr);
        }
        else{
            return false;
        }

    }
    public static boolean betterCheckArraySorted(int[] arr, int startIndex){
        if(startIndex== arr.length-1){
            return true;
        }
        if(arr[startIndex]<arr[startIndex+1]){
            return betterCheckArraySorted(arr, startIndex+1);
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        int[] input={1, 2, 38, 4,5};
        System.out.println(betterCheckArraySorted(input, 0));
    }

}
