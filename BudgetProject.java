

public class BudgetProject
{
    public static void main(String [] args)
    {
      
      final double salary = 3000.0; 
      final double savings_percent = 0.20;
      final double rent_percent = 0.30;
      final double grocery_percent = 0.15;
      final double entertainment_percent = 0.10;
          double savedamount;
          double rentamount;
          double groceriesamount;
          double entertainmentamount;
          double totalexpenses;
          double remainingbalace;
          savedamount = salary * savings_percent;
          rentamount = salary * rent_percent;
          groceriesamount = salary * grocery_percent;
          entertainmentamount = salary * entertainment_percent;
          totalexpenses = rentamount + groceriesamount + entertainmentamount;
          remainingbalace = salary - totalexpenses;
              System.out.println("monthly salary = " + salary);
              System.out.println("amount saved each month = " + savedamount);
              System.out.println("amount spent on rent = " + rentamount);
              System.out.println("amount spent on groceries = " + groceriesamount);
              System.out.println("amount spent on entertainment = " + entertainmentamount);
              System.out.println("total spent each month = " + totalexpenses);
              System.out.println("amount left " + remainingbalace);
      }
}

