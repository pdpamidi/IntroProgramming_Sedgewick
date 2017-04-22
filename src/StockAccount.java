/**
 * Created by Pruthvi on 4/20/2017.
 */

import sun.security.provider.SHA;

/**
 * API:
 * StockAccount(String filename)
 * double valueOf()
 * void buy(int amount, String symbol)
 * void sell(int amount, String symbol)
 * void save(String filename)
 * void printReport()
 */
public class StockAccount {
    //Instance variables that act as data structure
    private final String name;
    private double cash;
    private int n;
    private String[] stocks;
    private int[] shares;

    public StockAccount(String filename){
        //Data Structure from the specified file
        In in = new In(filename);
        name = in.readLine();
        cash = in.readDouble();
        n = in.readInt();
        shares = new int[n];
        stocks = new String[n];
        for (int i=0; i<n; i++){
            shares[i] = in.readInt();
            stocks[i] = in.readString();
        }
    }

    //Print a detailed report of stocks poised and valuation
    //Uses StockQuote to connect to yahoo finance and grab stock price
    public void printReport(){
        StdOut.println(name);
        double total = cash;
        for (int i=0; i<n; i++){
            int amount = shares[i];
            double price = StockQuote.priceOf(stocks[i]);
            total+= amount*price;
            StdOut.printf("%4d %5s ", amount, stocks[i]);
            StdOut.printf("%9.2f %11.2f\n", price, amount*price);
        }
        StdOut.printf("%21s %10.2f\n", "Cash: ", cash);
        StdOut.printf("%21s %10.2f\n", "Total: ", total);
    }

    public static void main(String [] args){
        StockAccount account = new StockAccount(args[0]);
        account.printReport();
    }
}
