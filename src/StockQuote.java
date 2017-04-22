/**
 * Created by Pruthvi on 4/11/2017.
 */
public class StockQuote {
    private static String readHTML(String symbol){
        In page = new In("http://finance.yahoo.com/quote/" + symbol);
        return page.readAll();
    }

    public static double priceOf(String symbol){
        String html = readHTML(symbol);
        int p     = html.indexOf("data-reactid=\"248\"", 0);      // "price.0" index
        int from  = html.indexOf(">", p);            // ">" index
        int to    = html.indexOf("</span>", from);   // "</span>" index
        String price = html.substring(from + 1, to);

        // remove any comma separators
        return Double.parseDouble(price.replaceAll(",", ""));
    }

    public static void main(String[] args){
        String symbol = args[0];
        double price = priceOf(symbol);
        StdOut.println(price);

    }
}
