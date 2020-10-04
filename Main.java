class Main {
   public static void main(String[] args) {
        // kindly use appropriate data types for your declaration
        //declare an array variable and assign the days of the month debtor defaulted,
        byte daysDefaulted[] = {2, 15, 18, 20, 22, 25};

        // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
        float amountToPayPerDay = 300f;
        float amountPaid = 1350f;

        // declare all the variables needed for your calculations
        byte x = 0;
        float amountToPay = 0;
        float totalAmount = 0;
        float extraAmount;
        float leftToPay;
        byte daysNotPaid;
        byte daysPaid;
        byte daysDefaultedNo = 6;

        // calculate and print total amount the debtor is to pay using for each loop
        for (byte p : daysDefaulted) {
            totalAmount += amountToPayPerDay;
            System.out.println("The total amount to pay is " + "$" + totalAmount);
        }

        System.out.println(" ");

        // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day.
        daysPaid = (byte) (amountPaid/amountToPayPerDay);
        System.out.println("The number of days the debtor paid for is: " + daysPaid);

        for ( x = 0; x < daysDefaultedNo && x < daysPaid; x++){
            System.out.println("day " + daysDefaulted[x] + " has been paid for");
        }
        
        if (amountPaid % amountToPayPerDay > 0){
            leftToPay = amountToPayPerDay - (amountPaid % amountToPayPerDay);
            System.out.println("You didn't complete payments for Day " + daysDefaulted[daysPaid]);
            System.out.println("The amount left to pay for that day is " + "$" + leftToPay);
        }

        System.out.println(" ");

        // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
        if (totalAmount > amountPaid){
            amountToPay = totalAmount - amountPaid;
            daysNotPaid = (byte) (daysDefaultedNo - daysPaid);

            System.out.println("The amount left to pay is: " + "$" + amountToPay);
            System.out.println("The number of days you didn't pay for is " + daysNotPaid);
        }
        else if (totalAmount == amountPaid){
            System.out.println("You paid the exact amount");
        }
        else {
            extraAmount = amountPaid - totalAmount;
            System.out.println("You paid over the amount by " + "$" + extraAmount );
        }

    }
}
