import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarNikola {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite godinu: ");
		int godina = sc.nextInt();
		
		System.out.println("Unesite mesec: ");
		int mesec = sc.nextInt();
	    mesec = mesec - 1;
	   
        GregorianCalendar cal = new GregorianCalendar(godina, mesec, 1);
        int daniumesecu = cal.getActualMaximum(Calendar.DAY_OF_MONTH); 
        int danunedelji = cal.get(Calendar.DAY_OF_WEEK);
       
		String[] svidani = new String[7];
		svidani[0] = "Pon";
		svidani[1] = "Uto";
		svidani[2] = "Sre";
		svidani[3] = "Cet";
		svidani[4] = "Pet";
		svidani[5] = "Sub";
		svidani[6] = "Ned";
		

		for(int i = 0; i < svidani.length; i++){
			System.out.print(svidani[i]+"\t");
		}
		System.out.println();
		for(int i = 1; i < danunedelji; i++){
		  System.out.print("\t");
		}
		
		for(int i = 1; i <= daniumesecu; i++){
			System.out.print(i + "\t");
			if(danunedelji % 7 == 0){
				System.out.println();
			}
			danunedelji = danunedelji + 1;
			
		}
	}

}
