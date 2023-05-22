public class Merge2SortedArrays {
    public static void merge2Arrays(int[] arr1, int[] arr2, int[] ans){
        int m= arr1.length;
        int n= arr2.length;
        int i=0;
        int k=0;
        int j=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                ans[k]=arr1[i];
                i++;
                k++;
            }else{
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }
        while (i<m){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] input){
        // Write your code here
        if(input.length==0 || input.length==1){
            return;
        }
        int start=0;
        int end=input.length-1;
        int mid=(start + end)/2;
        int[] inp1= new int[mid+1];
        for(int i=0; i<mid+1; i++){
            inp1[i]=input[i];
        }
        int[] inp2;
        if(input.length%2==0){
            inp2= new int[mid+1];
        }else{
            inp2= new int[mid];
        }
        for(int i=mid+1; i<input.length; i++){
            inp2[i-(mid+1)]=input[i];
        }
        mergeSort(inp1);
        mergeSort(inp2);
        merge2Arrays(inp1, inp2, input);
    }

    public static void main(String[] args) {
        int[] arr1={1,24,6,5,17,16};
        mergeSort(arr1);

        for(int i=0; i< arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
