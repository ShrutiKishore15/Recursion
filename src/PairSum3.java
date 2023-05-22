public class PairSum3 {

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
    public static int pairSum(int[] arr, int k){
        mergeSort(arr);
        int i=0, j= arr.length-1;
        int count=0;
        int counti=1, countj=1;
        while(i<j){
            if(arr[i]+arr[j]<k){
                i++;
            }
            else if(arr[i]+arr[j]>k){
                j--;
            }
            else{
                if(arr[i]==arr[i+1] && i+1!=j){
                    while(i< arr.length-1) {
                        if (arr[i] == arr[i + 1]) {
                            counti++;
                            i++;
                        } else {
                            i++;
                            break;
                        }
                    }
                }
                if(arr[j]==arr[j-1] && counti!= arr.length && j-1 !=i){
                    while(j>=0){
                        if(arr[j]==arr[j-1]){
                            countj++;
                            j--;
                        }
                        else{
                            j--;
                            break;
                        }
                    }
                }
                if(counti== arr.length){
                    count=2*counti;
                    return count;
                }
                if(counti!=1 && countj !=1){
                    count+=counti*countj;
                }
                else if(counti!=1 && countj==1){
                    count+=counti;
                    j--;
                }
                else if(counti==1 && countj !=1){
                    count+=countj;
                    i++;
                }
                else{
                    count++;
                    i++;
                    j--;
                }
            }
            counti=1;
            countj=1;
        }
        return count;
    }
    public static void main(String[] args) { // 1 2 2 3 3 4 4 5 6
       // int[] arr={1,3,6,2,5,4,3,2,4};
        //int[] arr={-2,2,5,5,8,10};
        //int[] arr={0,6,0,0};
        int[] arr={3,3,3,3,3};
        //int[] arr={};
        System.out.println(pairSum(arr,6 ));
    }
}
//    public static int pairSum(int[] arr, int k) {
//        mergeSort(arr);
//        int count=0;
//        int i=0, j=arr.length-1;
//        while(i<j){
//            int sum=arr[i]+arr[j];
//            if(sum>k){
//                j--;
//            }
//            else if(sum<k){
//                i++;
//            }
//            else{
//                int counti=1;
//                int countj=1;
//                if(arr[i]==arr[i+1]){
//                    while(i<arr.length-2) {
//                        if (arr[i] == arr[i + 1]) {
//                            counti++;
//                            i++;
//                        } else {
//                            i++;
//                            break;
//                        }
//                    }
//                    if(counti== arr.length){
//                        return (counti)*2;
//                    }
//                }
//                if(arr[j]==arr[j-1] ){
//                    while(j>=0){
//                        if(arr[j]==arr[j-1]){
//                            countj++;
//                            j--;
//                        }else {
//                            j--;
//                            break;
//                        }
//                    }
//                }
//                if(counti!=1 || countj!=1){
//                    if(counti!=1 && countj!=1){
//                        count+=counti*countj;
//                    }
//                    else if(counti!=1){
//                        count+=counti;
//                        j--;
//                    }
//                    else{
//                        count+=countj;
//                        i++;
//                    }
//                }
//                else{
//                    count++;
//                    i++;
//                    j--;
//                }
//
//            }
//        }
//        return count;
//    }