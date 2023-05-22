public class ArraySorting {
    public static void bubbleSort(int [] arr){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            boolean flag=true;
            for (int j=1; j<n-i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    public static void insertionSort(int[] arr){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int num=arr[i+1];
            int j=i;
            for(; j>=0; j--){
                if(num<arr[j]){
                    arr[j+1]=arr[j];
                } else if (num>arr[j]) {
                    arr[j+1]=num;
                    break;
                }
            }
            if(j==-1){
                arr[0]=num;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={9,7,6,8,4,5,2,3};
        insertionSort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
