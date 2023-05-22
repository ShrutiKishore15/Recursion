public class QuickSort {
    public static void quickSort(int[] input, int startIndex, int endIndex) {
        // your code goes here
        if(startIndex>=endIndex){
            return;
        }
        int indexPivot=partition(input, startIndex, endIndex);
        quickSort(input, startIndex, indexPivot-1);
        quickSort(input, indexPivot+1, endIndex);
    }

    public static int partition(int[] input,int startIndex, int endIndex){
        int pivot=input[startIndex];
        int count=0;
        for(int i=startIndex+1; i<=endIndex; i++){
            if(input[i]<pivot){
                count++;
            }
        }
        int temp=input[startIndex+count];
        input[startIndex+count]=pivot;
        input[startIndex]=temp;
        int i=startIndex;
        int j=endIndex;
        while(i<j){
            if(input[i]<pivot){
                i++;
            }
            else if(input[j]>=pivot){
                j--;
            }
            else{
                int temp2=input[i];
                input[i]=input[j];
                input[j]=temp2;
                i++;
                j--;
            }
        }
        return startIndex+count;
    }

    public static void main(String[] args) {
        int[] input={2,6,8,5,4,3};
        quickSort(input, 0, input.length-1);
        for(int i=0; i< input.length; i++){
            System.out.print(input[i] + " ");
        }
    }
}
