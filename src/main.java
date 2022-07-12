import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        DecimalFormat df = new DecimalFormat("###.##");
      double creditPayment1year = service.calculate(1_000_000, 12);
      System.out.println("Ежемесячный платеж на 1год " +(df.format(creditPayment1year)));

      double creditPayment2years = service.calculate(1_000_000, 24);
      System.out.println("Ежемесячный платеж на 2года " +(df.format(creditPayment2years)));

      double creditPayment3years = service.calculate(1_000_000, 36);
      System.out.println ("Ежемесячный платеж на 3года " +(df.format(creditPayment3years)));



    }
}