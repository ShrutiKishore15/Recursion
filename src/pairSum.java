public class pairSum{

    public static void mergeSort(int[]arr){
        if(arr.length==0 || arr.length==1){
            return;
        }
        int[] newArr1= new int[arr.length/2];
        int[] newArr2= new int[arr.length-newArr1.length];
        for(int i=0; i<arr.length/2; i++){
            newArr1[i]=arr[i];
        }
        for(int i=arr.length/2; i<arr.length; i++){
            newArr2[i-arr.length/2]=arr[i];
        }
        mergeSort(newArr1);
        mergeSort(newArr2);
        merge(newArr1, newArr2, arr);
    }

    public static void merge(int[] arr1, int[] arr2, int[] ans){
        int m=arr1.length;
        int n=arr2.length;
        int i=0;
        int j=0;
        int k=0;
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
        while(i<m){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n){
            ans[k]=arr2[j];
            j++;
            k++;
        }
    }

    public static int linearSearch(int[] arr, int findNum){
        int countNum=0;
        for(int i=0; i<arr.length; i++){
            if(findNum==arr[i]){
                countNum++;
            }
        }
        if(countNum==arr.length){
            return countNum*2;
        }
        return countNum;
    }
    public static int pairSum(int[] arr, int k) {
        mergeSort(arr);
        int count=0;
        int findNum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(findNum== arr[i]){
                break;
            }
            findNum=k-arr[i];
            int countNum=linearSearch(arr, findNum);
            if(findNum==arr[i] && countNum!=arr.length*2 ){
                countNum--;
            }
            count+=countNum;
        }
        return count;
    }

    public static void main(String[] args) { // 1 2 2 3 3 4 4 5 6
        int[] arr={3,3,3,3,3,3};
        System.out.println(pairSum(arr, 6));
    }
}
