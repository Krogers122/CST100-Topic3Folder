public class ClockDisplay 
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayInternationalString;
    private String displayUSString;
 
     
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplayInternational();
        updateDisplayUS();
       
    }
 
    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }
 
    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplayInternational();
        updateDisplayUS();
    }
 
    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplayInternational();
        updateDisplayUS();       
    }
 
    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getInternationalTime()
    {
        return displayInternationalString;
    }
     
    public String getUSTime()
    {
        return displayUSString;
    }
     
        /**
     * Update the internal string that represents the display.
     */
    private void updateDisplayInternational()
    {
        displayInternationalString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
         
      } 
       
    private void updateDisplayUS()
    {
         
        if(hours.getValue() < 12)
         {
             displayUSString = hours.getDisplayValue() + ":" +
            minutes.getDisplayValue() + " am";
         }
                 
       else if(hours.getValue() > 12 && hours.getValue() <24)
          {
            displayUSString = Integer.toString(hours.getValue() - 12) + ":" + 
            minutes.getDisplayValue() + " pm";
          }
       else if(hours.getValue() == 0) 
         {
            hours.setValue(12); 
            displayUSString = hours.getDisplayValue() + ":"+
            minutes.getDisplayValue() + " am";    
                       
         }  
              
       else
        {
         hours.setValue(12);
         displayUSString = hours.getDisplayValue() + ":" + 
                    minutes.getDisplayValue() + " pm";
       }
   }
}