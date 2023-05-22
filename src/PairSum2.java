public class PairSum2 {

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

    public static int pairSum(int[] arr, int k) {
        mergeSort(arr);
        int count=0;
        int i=0, j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum>k){
                j--;
            }
            else if(sum<k){
                i++;
            }
            else{
                int counti=1;
                int countj=1;
                if (j==i+1){
                    count++;
                    i++;
                    j--;
                }
                else if(arr[i]==arr[i+1] && j != (i+1)){
                    while(i<j) {
                        if (arr[i] == arr[i + 1]) {
                            counti++;
                            i++;
                        } else {
                            i++;
                            break;
                        }
                    }
                    if(counti== arr.length){
                        return counti*2;
                    }
                }
                else if(arr[j]==arr[j-1] && j != (i+1)){
                    while(i<j){
                        if(arr[j]==arr[j-1]){
                            countj++;
                            j--;
                        }else {
                            j--;
                            break;
                        }
                    }
                }
                if(counti!=1 || countj!=1){
                    if(counti!=1 && countj!=1){
                        //System.out.println("if");
                        count+=counti*countj;
                    }
                    else if(counti!=1){
                        //System.out.println("else if");
                        count+=counti;
                        j--;
                    }
                    else{
                        //System.out.println("else!!");
                        count+=countj;
                        i++;
                    }
                }
                else{
                    //System.out.println("else");
                    count++;
                    i++;
                    j--;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) { // 1 2 2 3 3 4 4 5 6
        int[] arr={1,3,6,2,5,4,3,2,4};
        //int[] arr={-2,2,5,5,8,10};
        //int[] arr={3,3,3,3,3};
        //int[] arr={};
        System.out.println(pairSum(arr, 7));
    }
}
