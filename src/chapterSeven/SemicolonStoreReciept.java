package chapterSeven;

public class SemicolonStoreReciept {

    public static void invoice(String name, String cashier){
        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
                TEL: 08134232226
                Date: 18-Dec-23 8:48:11 pm
                Cashier: %s%n
                Customer Name: %s%n""",cashier, name);
    }
}
