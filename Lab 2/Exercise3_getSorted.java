import java.util.Arrays;
import java.util.Collections;
class Exercise3_getSorted {
       
  public static void main(String[] args) {
   
    Integer[] arr = {15,9,2,16,30,47,51};
    Arrays.sort(arr, Collections.reverseOrder());
    for (int i = 0; i < arr.length; i++){
       System.out.print(arr[i]+ " ");
	}
}

}