public class BuckWheatStocks {
    public static void main(String[] args) {
        int stocks = 100;
        int storageOfOneKilogram = 100;
        int eatsInOneMonth = 6;
        int payment = storageOfOneKilogram;

        do {
            System.out.println( "payment =" + payment);
            payment = ( storageOfOneKilogram - (stocks - eatsInOneMonth));
        } while (stocks < 0);


    }
}
