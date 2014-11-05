import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarGodina{

	public static void main(String[] args) {
        int godina = 2014;
        int mesec = 1;

        GregorianCalendar[] svimeseci = new GregorianCalendar[12];
        String[] svidani = new String[7];
		svidani[0] = "Pon";
		svidani[1] = "Uto";
		svidani[2] = "Sre";
		svidani[3] = "Cet";
		svidani[4] = "Pet";
		svidani[5] = "Sub";
		svidani[6] = "Ned";
        int brojac;
		for(int i = 1; i < svimeseci.length + 1; i++){
          brojac = i - 1;
          svimeseci[brojac] = new GregorianCalendar(godina, i, 1);
          int daniumesecu =  svimeseci[brojac].getActualMaximum(Calendar.DAY_OF_MONTH);
          int danunedelji =  svimeseci[brojac].get(Calendar.DAY_OF_WEEK);

          for(int i1 = 0; i1 < svidani.length; i1++){
			System.out.print(svidani[i1]+"\t");
		  }
          System.out.println();
          for(int i1 = 1; i1 < danunedelji; i1++){
		    System.out.print("\t");
		  }
	      for(int i1 = 1; i1 <= daniumesecu; i1++){
			System.out.print(i1 + "\t");
			if(danunedelji % 7 == 0){
				System.out.println();
			}
			danunedelji = danunedelji + 1;
		 }
		 System.out.println();
		}

	}

}