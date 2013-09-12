/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.maven.sample;
import org.joda.time.*;
import cse.maven.sample.InvalidNicException;
/**
 *
 * @author VIDURA
 */
public class NicInterpreter {
    
   private String nicNum;
   private int year;
   private int month;
   private int day;
   private int numDays;
   private boolean isMale;
   private boolean isVoter;
   DateTime currentDate;
   
   

    public NicInterpreter(String nicNum)throws InvalidNicException {
        this.nicNum = nicNum;
      
        year = 1900+Integer.parseInt(nicNum.substring(0,2));
        numDays = Integer.parseInt(nicNum.substring(2,5));
        
   
        if(numDays>=500){
            isMale=false;
            numDays=numDays-500;
        }else{
            isMale=true;
        }
        
        currentDate = new DateTime();
        
        DateTime dati = new DateTime(2012,1,1,0,0,0);
        dati = dati.plusDays(numDays-1);
        month=dati.getMonthOfYear();
        day=dati.getDayOfMonth();
        DateTime DayT = new DateTime(year,month,day,0,0,0);
        
        
        if (DayT.plusYears(18).compareTo(currentDate)<0){
            isVoter=true;
        }
        else{
            isVoter=false;
        }
    }
        public String getGender(){
        if(isMale){
            return "Male";
        }else{
            return "Female";
        }
    }
    
    public String isVoter(){
        if(isVoter){
            return "True";
        }else{
            return "False";
        }
    }
    
    public int getYear(){
        return year;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getDate(){
        return day;
    }
    

    
}
