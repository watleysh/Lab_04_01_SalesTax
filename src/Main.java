//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
        double purchasePrice = 33.33;
        final double SALES_TAX_RATE = .05;
        //bc it is a constant
        double salesTax= 0;
        double total =0;

        salesTax = purchasePrice * SALES_TAX_RATE;
        total = salesTax + purchasePrice;

        IO.println("The sales tax on " + purchasePrice + " is " + salesTax);
        IO.println("The total cost is " + total);

}
