public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
        int dailyAverage =0;
        double monthlyAverage=0;
        int eggCount =0;
        double monthlyProfit =0;
        		//Monday
        		eggCount+=100; //Collect 100 eggs 
        //Tuesday 
        eggCount+=121; //collect 121 eggs 
        //Wednesday 
        eggCount += 117; // collect 117 eggs
        //Calculate daily Average
        
        dailyAverage = eggCount/3;
        System.out.println("Daily Average:   " +dailyAverage);
        //Calculate monthly average
        monthlyAverage = dailyAverage*30;
        System.out.println("Monthly Average: " +monthlyAverage);
        //calculate monthly profit 
        monthlyProfit = monthlyAverage*0.18; 
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
