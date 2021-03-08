class Exercise6{

int calculateDifference(int n){
int sumSquare = (n*(n+1)*(2*n+1))/6;
int sqSum = (n*(n+1))/2;
int squareSum = sqSum*sqSum;
int Sum = sumSquare - squareSum;
return Sum;
}
public static void main(String[] args){
Exercise6 ex=new Exercise6();
int Sum = ex.calculateDifference(8);
System.out.println("Difference: "+Sum);
}
}

