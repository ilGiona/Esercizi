public class Timer{
	public static void main(String [] args){
			final int MINUTES_PER_HOUR = 60;
    			final int MINUTES_PER_DAY = 24 * MINUTES_PER_HOUR;
			
			int time1=1942;
			int time2=1941;
						
			int ora1=time1/100;
			int ora2=time2/100;
			
			int min1=ora1*MINUTES_PER_HOUR+time1%100;
			int min2=ora2*MINUTES_PER_HOUR+time2%100;
			
			int diff = min2 - min1;
			diff = (diff + MINUTES_PER_DAY) % MINUTES_PER_DAY;
    
			int oradiff = diff / MINUTES_PER_HOUR;
			int mindiff = diff % MINUTES_PER_HOUR;
			
			System.out.println("Ora inizio = "+ora1+":"+time1%100);
			System.out.println("Ora fine = "+ora2+":"+time2%100);
			System.out.print("Tempo trascorso: ");
			System.out.print(oradiff + " ore e " + mindiff + " minuti.\n");
	}
}
