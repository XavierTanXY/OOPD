import io.*;
public class Menu
{
   	 
    public static void main(String args [])
    {
    }

    public static void displayChoice()
    {
   	 int choice;
   	 System.out.println("Please choose between real number or complex number");
   	 System.out.println("For real number, please enter '1' ");
   	 System.out.println("For complex number, please enter '2' ");

   	 choice=ConsoleInput.readInt("1 or 2");

   	 if(choice==1)
   	 {
   		 displayRealOption();
   	 }
   	 else
   	 {
   		 displayComplexOption();
   	 }
   	 
    
    }
    

    public static void displayRealOption()
    {    
   	 boolean quit;
   	 int option;
   	 double numOne,numTwo;
   	 RealNumber r1,r2;

   	 numOne=ConsoleInput.readDouble("please enter first real number");
   	 r1=new RealNumber(numOne);
   	 numTwo=ConsoleInput.readDouble("please enter second real number");
   	 r2=new RealNumber(numTwo);

   	 System.out.println("Please choose the option");
   	 option=ConsoleInput.readInt("Please enter '1' for addition, '2' for subtraction, '3' for multiplication, '4' for division, '5' for quit");
   	 
   	 do
   	 {
   		 switch(option)
   		 {
   			 case 1: Calculation.add(r1,r2);
   				 break;
   			 case 2: Calculation.subtract(r1,r2);
   				 break;
   			 case 3: Calculation.multiply(r1,r2);
   				 break;
   			 case 4: Calculation.divide(r1,r2);
   				 break;
   			 case 5: quit=true;
   				 break;    
   		 }
   	 }
   	 while(quit=false);
    }


    public static void displayComplexOption()
    {
   	 boolean quit;
   	 int option;
   	 double realNumOne,realNumTwo,imagNumOne,imagNumTwo;
   	 ComplexNumber c1,c2;
   	 
   	 realNumOne=ConsoleInput.readDouble("please enter first real part");
   	 imagNumOne=ConsoleInput.readDouble("please enter first imaginary part");
   	 c1=new ComplexNumber(realNumOne,imagNumOne);

   	 realNumTwo=ConsoleInput.readDouble("please enter second real part");
   	 imagNumTwo=ConsoleInput.readDouble("please enter second imaginary part");
   	 c2=new ComplexNumber(realNumTwo,imagNumTwo);
   	 
   	 System.out.println("Please choose the option");
   	 option=ConsoleInput.readInt("Please enter '1' for addition, '2' for subtraction, '3' for multiplication, '4' for division or '5' for quit");
   	 
   	 do
   	 {
   		 switch(option)
   		 {
   			 case 1: Calculation.add(c1,c2);
   				 break;
   			 case 2: Calculation.subtract(c1,c2);
   				 break;
   			 case 3: Calculation.multiply(c1,c2);
   				 break;
   			 case 4: Calculation.divide(c1,c2);
   				 break;
   			 case 5: quit=true;
   					 break;   	 
   		 }
   	 }
   	 while(quit=false);
    
    }
   	 
}

