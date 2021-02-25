class Exercise5{
int calculateSum(int n){
int s1,s2,s3;
s1=((n/3))*(2*3+(n/3-1)*3);
s2=((n/5))*(2*5+(n/5-1)*5);
s3=((n/(3*5)))*(2*(3*5)+(n/(3*5)-1)*(3*5))/2;
return s1+s2+s3;
}
public static void main(String[] args){
Exercise5 ex=new Exercise5();
int sum = ex.calculateSum(8);
System.out.println("Sum: "+sum);
}
}