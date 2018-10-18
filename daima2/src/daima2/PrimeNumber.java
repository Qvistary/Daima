package daima2;
public class PrimeNumber{
    public static void main(String[] args)
    {
        int maxNumber=50;
        int arraySize=maxNumber/3;
        int primeNo[]=new int[arraySize];
        int index,num,i,primeCount;
        primeNo[0]=2;
        primeCount=1; 
        index=1; 
        num=3; 
        do{
          i=0;
          while(i<primeCount&&(num%primeNo[i]!=0))  
             i++;
          if(i==primeCount)         
          {
            primeNo[i]=num; 
            index++;           
            primeCount++;           
          }
          num+=2;          
        }while (num<maxNumber);
        System.out.println("所有 2~"+maxNumber+" 之间的素数是 :");
        for(i=0;i<primeNo.length;i++)
        {
         System.out.print(" "+primeNo[i]);
         if((i+1)%10==0) System.out.println();
        }
        System.out.println();
        System.out.println("素数个数是:" +primeCount );
    }
}
