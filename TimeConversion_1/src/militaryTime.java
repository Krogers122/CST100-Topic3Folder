
public class militaryTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		   /** Military time constructor
	      @param t the military time
	   */
		public class Time {

			   // instance data members - values for each different time object
			   private int hours;
			   private int minutes;
			   private boolean morning; 
		public Time() {   // default constructor, time is midnight

			      hours = 12;
			      minutes = 0;
			      morning = true;
			   }

		public Time(int h, int m, char ap) {
		      setHours(h);
		      setMinutes(m);
		      setWhen(ap);
		   }
		public Time(int t) { // t is military time
	      int h = t / 100;
	      setMinutes(t % 100);
	      
	      if (h == 0) {
	         hours = 12;
	         morning = true;
	      }
	      else if (h > 12) {
	         setHours(h - 12);
	         morning = false;
	      } 
	      else if (h < 12) {
	         setHours(h);
	         morning = true;
	      } 
	      else { // h == 12 == noon
	         hours = 12;
	         morning = false;
	      }
	   }
	}
}


