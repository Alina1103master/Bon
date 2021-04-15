public class Main {
    public static void main(String[] args) {
 int starting = 350;
 int payment = 1300;
 int bonus;
 if ( payment >= 1000 ) {
 bonus = starting + payment + (payment / 100);
 } else {
     bonus = starting + payment;
 }
 System.out.println( "Баланс = " + bonus + " рублей " + "." + " Бонус = " + payment / 100 + " рублей.");
 }
    }