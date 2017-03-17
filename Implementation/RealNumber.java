public class RealNumber
{
    private double number;

    public RealNumber()
    {
   	 number = 1.0;
    }

    public RealNumber(double inNumber)
    {
   	 number=inNumber;    
    }

    public RealNumber(RealNumber inRealNumber)
    {
   	 number=inRealNumber.getNumber();
    }

    public double getNumber()
    {
   	 return number;
    }
    
    public boolean equals(RealNumber inRealNumber)
    {
   	 double tolerance=0.00001;
	 boolean isEqual;
   	 if(Math.abs(number-inRealNumber.getNumber())<tolerance)
   	 {
   		 isEqual=true;
   	 }
	else
	{
		isEqual=false;
	}
   	 return isEqual;
    }

    public String toString()
    {
   	 String outStr;
   	 outStr="" + Math.round(number*10000.0)/10000.0;
   	 return outStr;
    }

    public void setRealNumber(double inNumber)
    {
   	 number=inNumber;
    }

    public void add(RealNumber inRealNumber)
    {
   	 number=number+inRealNumber.getNumber();
    }
    
    public void subtract(RealNumber inRealNumber)
    {
   	 number=number-inRealNumber.getNumber();
    }
   	 
    public void multiply(RealNumber inRealNumber)
    {
   	 number=number*inRealNumber.getNumber();
    }

    public void divide(RealNumber inRealNumber)
    {
   	 if(inRealNumber.getNumber()>0)
   	 {
   		 number=number/inRealNumber.getNumber();
   	 }
    }    
}
