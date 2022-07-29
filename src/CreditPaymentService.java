public class CreditPaymentService {
    public double calculate(double creditAmount, double creditMonths) {
        double formulaPart = (creditAmount * (9.99 / (12 * 100)));
        double formulaPart2 = creditMonths * (-1);
        double formulapart3 = 1 + (9.99 / (12 * 100));
        double formulaPart4 = Math.pow(formulapart3, formulaPart2);
        double formulaPart5 = 1 - formulaPart4;
        double monthPayment = formulaPart / formulaPart5;
        return monthPayment;
    }


}


