public class Printer {
    private int sheetsRemaining;
    private int toner;

    public Printer(int sheetsOfPaper, int toner) {
        this.sheetsRemaining = sheetsOfPaper;
        this.toner = toner;
    }

    public int getSheetsRemaining() {
        return this.sheetsRemaining;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        if (this.sheetsRemaining >= numberOfPages * numberOfCopies) {
            this.sheetsRemaining -= numberOfPages * numberOfCopies;
            this.toner -= numberOfPages;
        }
    }

    public void refill() {
        this.sheetsRemaining = 100;
    }

    public int getTonerRemaining() {
        return this.toner;
    }
}
