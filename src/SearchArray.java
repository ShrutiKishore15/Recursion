public class SearchArray {
    public static int binarySearch(int[] arr, int start, int end, int x){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]<x){
            return binarySearch(arr, mid+1, end, x);
        }
        else{
            return binarySearch(arr, start, mid-1, x);
        }
    }

    public static void main(String[] args) {
        int[] input={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(input, 0, 8,3 ));
    }
}
