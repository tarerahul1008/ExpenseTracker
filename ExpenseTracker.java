import java.util.Scanner;

public class ExpenseTracker
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sponsor's name:");
        String sponsorName = scanner.nextLine();

        System.out.println("Did the sponsor spend money including themselves? (yes/no):");
        String spentMoney = scanner.nextLine();

        System.out.println("Enter the total member count:");
        int memberCount = scanner.nextInt();
        scanner.nextLine();

        if (spentMoney.equalsIgnoreCase("yes"))
        {
            memberCount++;
        }

        String[] memberNames = new String[memberCount];
        
        for (int i = 0; i < memberCount; i++) 
        {
            if (i == memberCount - 1 && spentMoney.equalsIgnoreCase("yes"))
            {
                memberNames[i] = sponsorName;
            } 
            else 
            {
                System.out.println("Enter the name of member " + (i + 1) + ":");
                memberNames[i] = scanner.nextLine();
            }
        }

        System.out.println("Expense recording for " + sponsorName + ":");

        System.out.println("Enter the expense amount for " + sponsorName + ":");
        double sponsorExpense = scanner.nextDouble();

        double totalExpense;
        double individualShare;

        if (spentMoney.equalsIgnoreCase("no"))
        {
            totalExpense = sponsorExpense;
            individualShare = totalExpense / (memberCount -1);
        }
        else
        {
            totalExpense = sponsorExpense;
            individualShare = totalExpense / memberCount;
        }
if (spentMoney.equalsIgnoreCase("yes"))
{
        System.out.println("Summary:");

        for (String member : memberNames)
        {
            System.out.println(member + " needs to pay " + individualShare);
        }

        if (spentMoney.equalsIgnoreCase("yes"))
        {
            System.out.println(sponsorName + " Finally needs to pay " + "-"+((sponsorExpense - (individualShare ))));
           
        } 	
        }


if (spentMoney.equalsIgnoreCase("no"))
{
        System.out.println("Summary:");

        for (String member : memberNames)
        {
            System.out.println(member + " needs to pay " + (totalExpense/memberCount));
        }

        if (spentMoney.equalsIgnoreCase("no")) {
            System.out.println(sponsorName + " Finally needs to pay " + "-"+((sponsorExpense - (individualShare ))));
           
        } 	
        }



          

        }
        
    }

