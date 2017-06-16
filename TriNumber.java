package main;

/**
 * Created by gabe.clark on 6/16/17.
 */
public class TriNumber {
    long triNum = 1;
    int divisors;

    void findTriNumWithDivisorsGreaterThan(int target){
        int k = 1;
        do{
            generateTriNum(k);
            countDivisors();
            ++k;
        } while(divisors <= target);
    }

    void generateTriNum(int k){
        triNum = k * (k+1) / 2;
    }

    void countDivisors(){
        divisors = 0;
        for(int i = 1; i <= Math.sqrt(triNum + 1); i++){
           if(triNum % i == 0){
               if(triNum / i == i){
                   divisors++;
               } else {
                    divisors += 2;
               }
           }
        }
    }
}
