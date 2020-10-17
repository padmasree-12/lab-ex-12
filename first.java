/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author padma
 */
public class first {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer n[]={4,8,6,1,5,0,3};
           t<Integer> ob=new t<>(n);
            System.out.println("Count of odd integers");
            ob.count();
            Integer num[]={8,5,0,9,2,5,3};
            t1<Integer> obj=new t1<Integer>();
            obj.swap(num,2,3);
            System.out.println("Swaping in integer array"+Arrays.toString(num)); 
            Character c1[]={'g','u','i','t','a','r'};
            t1<Character> obj1=new t1<Character>();
            obj1.swap(c1,1,3);
            System.out.println("Swaping in char array"+Arrays.toString(c1));
            String s[]={"pink","orange","violet","yellow","blue"};
            t1<String> obj2=new t1<String>();
            obj2.swap(s,1,2);
            System.out.println("Swaping in string array"+Arrays.toString(s));
            Double d[]={2.0,88.0,45.0,423.0};
            t1<Double> obj3=new t1<Double>();
            obj3.swap(d,0,2);
            System.out.println("Swaping in double array"+Arrays.toString(d));
             Scanner obj4=new Scanner(System.in);
             System.out.println("\nEnter start value of range");
             int start=obj4.nextInt();
             System.out.println("\nEnter end value of range");
             int finish=obj4.nextInt();
           
             System.out.println("The maximal element in the range "+ obj.maximalelement(num, start, finish));//obj for accessing class test4
          
             System.out.println("The maximal element in the range "+ obj.maximalelement(s, start, finish));//obj for accessing class test4
            
             System.out.println("The maximal element in the range is"+ obj.maximalelement(d, start, finish));//obj for accessing class test4
            
             System.out.println("The maximal element in the range is"+ obj.maximalelement(c1, start, finish));//obj for accessing class test4
    }
}
class t<T extends Number>//class for odd count
{
    T[] value;
    int count=0;

    public t(T[] value) {
        this.value = value;
    }

  
 
  public void count()//generic method to count odd integers in an array
    {
      for(int i=0;i<value.length;i++)
      {
          if(((value[i].doubleValue()) % 2) != 0)
          {
             count=count+1;
          }
    }
       System.out.println(count);
}
}



class t1<T extends Comparable>
{
    int temp;
   
    public <T> void swap(T[] a,int i,int j)//generic method to swap the positions of two elements in the array
    {
        
       for(int o=0;o<a.length;o++)
       {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
       }      
}



   
    public <T extends Comparable> T maximalelement(T[] value,int start,int finish)//generic method to find maximal element in the range in the array
{
   T max=value[start];
   int i;
   for(i=start+1;i<finish;i++)
   {
       if(value[i].compareTo(max)>0)
       {
           max=value[i];
       }
       
   }
   return max;
}
}

      
    
    

