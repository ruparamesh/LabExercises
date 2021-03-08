import java.util.Arrays;

class Exercise2 {
 String[] sortStrings(String[] arr){
     Arrays.sort(arr);
     int mid = 0;
     mid = arr.length / 2;

     if (arr.length % 2 != 0){
     mid = (arr.length / 2) + 1;
     }
 

     for(int j=0; j<=arr.length-1; j++){
         if(j>=mid){
             arr[j] = arr[j].toUpperCase();
         }
     }
     return arr;
 }

 public static void main(String[] args){
 String[] st = {"hi", "hello", "good", "bye", "yes"};

 Exercise2 ex2 = new Exercise2();
 String[] temp = ex2.sortStrings(st);

 for(String S: temp){
 System.out.println(S);}
 }
}