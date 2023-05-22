import java.util.Arrays;
public class SolutionTripleSum {
    public static int tripletSum(int[] arr, int num){
        Arrays.sort(arr);
        int n= arr.length;
        int numTriplets=0;
        for(int i=0; i<n; i++){
            int pairSumFor=num-arr[i];
            int numPairs=pairSum(arr, (i+1), n-1,pairSumFor);
            numTriplets+=numPairs;
        }
        return numTriplets;
    }

    public static int pairSum(int[] arr, int si, int ei, int num){
        int numPair=0;
        while(si<ei){
            if(arr[si]+arr[ei]<num){
                si++;
            }
            else if(arr[si]+arr[ei]>num){
                ei--;
            }
            else{
                int startEle=arr[si];
                int endEle=arr[ei];
                if(startEle==endEle){
                    int totalEle=(ei-si)+1;
                    numPair+=(totalEle*(totalEle-1)/2);
                    return numPair;
                }
                int tempSi=si+1;
                int tempEi=ei-1;
                while(tempSi<=tempEi && arr[tempSi]==startEle){
                    tempSi+=1;
                }
                while(tempEi>=tempSi && arr[tempEi]==endEle){
                    tempEi-=1;
                }
                int totalEleFromStart=tempSi-si;
                int totalEleFromEnd=ei-tempEi;
                numPair+=(totalEleFromStart*totalEleFromEnd);

                si=tempSi;
                ei=tempEi;
            }
        }
        return numPair;
    }
}