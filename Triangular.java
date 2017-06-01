/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler12java;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Triangular {

    long searchNum = 1;
    long primeFactor = 1;
    long largeFactor = 1;
    int divisors = 1;
    // Have to continue generating numbers such that it will have 
    // over five hundred divisors (sentinel).
    
    // This is a two part problem, 
    // Part One: Generate a triangular number.
    // Part Two: Calculate # of divisors, can be achieved through a factor tree.
    
    public void findLargest(){
        
    }
    
    
    public void factorTree(long n){
        for(long i = 2; i < Math.sqrt(n); ++i){
            if(n % i == 0){
                primeFactor = i;
                largeFactor = n / primeFactor;
            }
        }
    }
}
