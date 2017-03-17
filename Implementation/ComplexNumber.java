public class ComplexNumber extends RealNumber
{
    private double imagPart;
    
    public ComplexNumber()
    {
   	 super();
   	 imagPart=1.0;
    }

    public ComplexNumber(double inNumber,double inImagPart)
    {
   	 super(inNumber);
   	 imagPart=inImagPart;
    }

    public ComplexNumber(ComplexNumber inComplexNumber)
    {
   	 super(inComplexNumber);
   	 imagPart=inComplexNumber.getImagPart();
    }
    
    public double getImagPart()
    {
   	 return imagPart;
    }

    public boolean equals(ComplexNumber inComplexNumber)
    {
   	 boolean isEqual;
   	 double tolerance=0.00001;
   	 
   	 if(super.equals(inComplexNumber) && Math.abs(imagPart-inComplexNumber.getImagPart())<tolerance)
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
   	 
   	 outStr=super.toString() + " + " + Math.round(imagPart*10000.0)/10000.0 + " i ";
   	 return outStr;
    }    
   	 
    public void setComplexNumber(double inNumber, double inImagPart)
    {
   	 super.setRealNumber(inNumber);
   	 imagPart=inImagPart;
    }

    public void add(ComplexNumber inComplexNumber)
    {
   	 setRealNumber(super.getNumber()+inComplexNumber.getNumber());
   	 imagPart=imagPart+inComplexNumber.getImagPart();
   		 
    }

    public void subtract(ComplexNumber inComplexNumber)
    {
   	 setRealNumber(super.getNumber()-inComplexNumber.getNumber());
   	 imagPart=imagPart-inComplexNumber.getImagPart();
    }

    public void multiply(ComplexNumber inComplexNumber)
    {
   	 double tempRealNumber;
   	 tempRealNumber=getNumber();
   	 setRealNumber(tempRealNumber*inComplexNumber.getNumber()-imagPart*inComplexNumber.getImagPart());
   	 imagPart=(imagPart*inComplexNumber.getNumber()+tempRealNumber*inComplexNumber.getImagPart());
    }

    public void divide(ComplexNumber inComplexNumber)
    {
   	double otherNumber;
   	 double otherImagPart;
   	 double tempRealNumber;
   	 tempRealNumber=getNumber();

   	 if((inComplexNumber.getNumber()>0) && (inComplexNumber.getImagPart()>0))
   	 {
   		 otherNumber=inComplexNumber.getNumber();
   		 otherImagPart=inComplexNumber.getImagPart();
   		 setRealNumber((tempRealNumber*otherNumber+imagPart*otherImagPart)/(Math.pow(otherNumber,2)+Math.pow(otherImagPart,2)));
   		 imagPart=(imagPart*otherNumber-tempRealNumber*otherImagPart)/(Math.pow(otherNumber,2)+Math.pow(otherImagPart,2));
   	 }
    	

   	 
    }
}
