public class WaterBottle {
    static void numWaterBottles(int numBottles, int numExchange) {
        int oBottles = numBottles;
     int ans = numBottles;
     while(numBottles>=numExchange){
        int newBottle = numBottles/numExchange;
        int remBottle = numBottles%numExchange;
        ans += newBottle;
        numBottles =newBottle+ remBottle;
     }   
   System.out.println("Total water bottles that can be drunk with " + oBottles + " bottles and exchange rate of " + numExchange + " is: " + ans);
}
    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
        numWaterBottles(numBottles,numExchange);
    }
}
