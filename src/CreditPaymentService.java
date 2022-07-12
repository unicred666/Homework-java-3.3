public class CreditPaymentService{
    public double calculate(double creditAmount, double creditMonths) {
        double q = (creditAmount * (9.99/(12*100)));
        double d = creditMonths * (-1);
        double z = 1+(9.99/(12*100));
        double y = Math.pow(z,d);
        double a = 1-y;
        double monthPayment = q/a;
        return monthPayment;
    }


}


