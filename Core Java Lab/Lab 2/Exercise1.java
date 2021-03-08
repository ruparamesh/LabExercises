class Exercise1{

static int getSecondSmallest (int[] arr){
int temp;
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}

}

}
return arr[1];
}

public static void main(String[] args){
int[] a={1,5,8,9,2};
int result=getSecondSmallest(a);
System.out.println("the second smallest number is "+result);
}

}