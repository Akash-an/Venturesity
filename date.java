

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class date {

	public static void main (String args[]) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the year\n");

        try{

        int year = scan.nextInt();

       if(!(validate(year))){
    	   throw new Exception();
       }

        Calendar cal = new GregorianCalendar();
        cal.set(year, 0, 1);


        int j;
        j= cal.get(Calendar.DAY_OF_WEEK);
        //System.out.println(j);


        int leep=0;
		if(year%4==0)
    	{
    		if(year%100==0)
    		{
    			if(year%400!=0)
    				leep = 0;
    			else leep = 1;
    		}
    		else leep = 1;
    	}

    	else leep = 0;

		int ans;
		if(j == 1)
			ans = 53;
		else if (leep ==1 && j ==7)
			ans = 53;
		else ans = 52;

		System.out.println("The number of Sundays in "+year+" is: "+ans);
        }catch(Exception e){
        	System.out.println("The input you have entered is not correct\n");

        }

    }


	private static boolean validate(int year) {

		if(year>9999 || year <0000)
		{
			System.out.println("The year must be between 0 and 9999");
			return false;
		}
		return true;

	}


}
