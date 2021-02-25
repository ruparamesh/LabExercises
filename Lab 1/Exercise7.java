class Exercise7{

boolean checkNumber(int n){
boolean result = false;
while(n>0) {
            int lastDigit = n % 10;
            n /= 10;
            int nextLastDigit = n % 10;
            
            if(nextLastDigit<=lastDigit) {
                result=true;
            }
            else {
                result=false;
                break;
            }
            
        }
return result;
}

public static void main(String[] args){
Exercise7 ex=new Exercise7();
boolean result = ex.checkNumber(123456);
if(result==true){
System.out.println("No is in increasing number");
}
else{
System.out.println("No is not in increasing number");
}

}

}