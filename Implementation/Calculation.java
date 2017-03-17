public class Calculation
{
    public static void main(String args [])
    {
    }

    public static void add(RealNumber r1,RealNumber r2)
    {
   	 RealNumber oldr1=new RealNumber(r1);
   	 r1.add(r2);
   	 System.out.println(oldr1.toString() + " + " + r2.toString() + " = " + r1.toString());
   	 System.out.println("Please enter new choice");
   	 Menu.displayChoice();
    }

    public static void subtract(RealNumber r1,RealNumber r2)
    {
   	 RealNumber oldr1=new RealNumber(r1);
   	 r1.subtract(r2);
   	 System.out.println(oldr1.toString() + " - " + r2.toString() + " = " + r1.toString());
   	 System.out.println("Please enter new choice");
   	 Menu.displayChoice();
    }

    public static void multiply(RealNumber r1,RealNumber r2)
    {
   	 RealNumber oldr1=new RealNumber(r1);
   	 r1.multiply(r2);
   	 System.out.println(oldr1.toString() + " x " + r2.toString() + " = " + r1.toString());
   	 System.out.println("Please enter new choice");
   	 Menu.displayChoice();
    }

    public static void divide(RealNumber r1,RealNumber r2)
    {
   	 RealNumber oldr1=new RealNumber(r1);
   	 r1.divide(r2);
   	 System.out.println(oldr1.toString() + " / " + r2.toString() + " = " + r1.toString());
   	 System.out.println("Please enter new choice");
   	 Menu.displayChoice();
    }

    public static void add(ComplexNumber c1,ComplexNumber c2)
    {
   	 ComplexNumber oldc1=new ComplexNumber(c1);
   	 c1.add(c2);
   	 System.out.println(oldc1.toString() + " + " + c2.toString() + " = " + c1.toString());
   	 System.out.println("Please enter new choice");
   	 Menu.displayChoice();
    }
    
    public static void subtract(ComplexNumber c1,ComplexNumber c2)
    {
   	 ComplexNumber oldc1=new ComplexNumber(c1);
   	 c1.subtract(c2);
   	 System.out.println(oldc1.toString() + " - " + c2.toString() + " = " + c1.toString());
   	 System.out.println("Please enter new choice");
   	 Menu.displayChoice();
    }
    
    public static void multiply(ComplexNumber c1,ComplexNumber c2)
    {
   	 ComplexNumber oldc1=new ComplexNumber(c1);
   	 c1.multiply(c2);
   	 System.out.println(oldc1.toString() + " x " + c2.toString() + " = " + c1.toString());
   	 System.out.println("Please enter new choice");
   	 Menu.displayChoice();
    }

    public static void divide(ComplexNumber c1,ComplexNumber c2)
    {
   	 ComplexNumber oldc1=new ComplexNumber(c1);
   	 c1.divide(c2);
   	 System.out.println(oldc1.toString() + " / " + c2.toString() + " = " + c1.toString());
   	 System.out.println("Please enter new choice");
   	 Menu.displayChoice();
    }


}
