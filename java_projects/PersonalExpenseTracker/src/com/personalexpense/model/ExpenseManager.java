import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ExpenseManager {
   private final ArrayList<Expense> expenses; 

   public ExpenseManager(){
        expenses= new ArrayList<>(); 
    }

    public void addExpense( Expense e){
        expenses.add(e);
    }

    public void removeExpense(int index){
        if(index >= 0 && index < expenses.size()){
            expenses.remove(index);
        }else{
            throw new InvalidExpenseException("Invalid expense index: " + index );
        }
    }

    public List<Expense> getAllExpenses(){
        return Collections.unmodifiableList(new ArrayList<>(expenses));
    }

    public List<Expense>  getExpenseByCategory(Category category){
        if(category == null){
            return getAllExpenses(); 
        }

        return expenses.stream()
                .filter(e -> e.getCategory() == category)
                .collect(Collectors.toList());
    }

    public List<Expense> getExpensesByMonth(int year, int month){
        return expenses.stream()
                    .filter(e -> e.getDate().getYear() == year && e.getDate().getMonthValue() == month)
                    .collect(Collectors.toList());
    }

    public double getTotal(List<Expense> list){
        return list.stream().mapToDouble(Expense::getAmount).sum(); 
    }

    public double getTotalAll(){
        return getTotal(expenses);
    }

    public int getCount(){
        return expenses.size();
    }
}
