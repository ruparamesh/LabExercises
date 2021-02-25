class Exercise8{

boolean checkNumber(int n)
    {
boolean result = true;
        if (n == 0)
            result = false;
         
        while (n != 1)
        {
            if (n % 2 != 0)
                result = false;
            n = n / 2;
        }
        
return result;
    }

public static void main(String[] args){
Exercise8 ex=new Exercise8();
boolean result = ex.checkNumber(64);
if(result==true){
System.out.println("No is a power of 2 ");
}
else{
System.out.println("No is not a power of 2 ");
}

}

}