import java.util.*;

//import java.io.OutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.PrintWriter;
//import java.util.StringTokenizer;
//import java.io.IOException;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.InputStream;
public class StringToInt {

    public static int convertStringToInt(String input){
        // Write your code here
        if(input.length()==0){
            return 0;
        }
        char x= input.charAt(0);
        int y= Integer.parseInt(String.valueOf(x));
        System.out.println(y);
        return (int) (y*Math.pow(10, input.length()-1)+ convertStringToInt(input.substring(1)));

    }

    public static void main(String[] args) {
//        String str="1234";
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(num);
//        InputStream inputStream = System.in;
//
//        InputReader in = new InputReader(inputStream);
//
//        int n = in.nextInt();
//        int k = in.nextInt();
        //System.out.println(str.length());
    }
}
