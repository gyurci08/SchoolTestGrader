package calculator;

import modell.Result;

public class CalculateGrade {







    public static int getGrade(int r1, int r2, int r3){
double toSwitch;
toSwitch=(1*r1+1*r2+3* r3)/5;

if(toSwitch>90) return 5;
else
if(toSwitch>80) return 4;
else
if(toSwitch>65) return 3;
else
if(toSwitch>49) return 2;
return 1;
    }



}
