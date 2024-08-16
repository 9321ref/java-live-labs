package week04;

public class MortgageCalculator {

    public static void main(String[] args) {

        int loanAmount =500000;
        int loanTermInYears=30;
        String loanType="Fixed";

        double annualInterestRate =0.0;

     // Determine the annual interest rates for different loan types:

        if(loanType == "Fixed" && loanTermInYears == 30){
           annualInterestRate =7.5;
        }else if(loanType == "Fixed" && loanTermInYears == 15){
            annualInterestRate = 6.9;
        }else if (loanType == "FHA" && loanTermInYears == 30){
            annualInterestRate = 7.24;
        }else if (loanType == "FHA" && loanTermInYears == 15) {
            annualInterestRate = 6.62;
        } else if (loanType == "VA" && loanTermInYears == 30) {
            annualInterestRate = 6.75;
        }else if (loanType == "VA" && loanTermInYears == 15){
            annualInterestRate =5.99;
        }

//----

    }
}
