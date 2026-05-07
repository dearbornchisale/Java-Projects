import java.time.LocalDate;

public class Expense {
    private final double amount;
    private final Category category;
    private final LocalDate date;
    private final String note;

    public Expense(double amount, Category category, LocalDate date, String note) {
        if (amount < 0) {
            throw new InvalidExpenseException("Amount should be greater than 0. Got: " + amount);
        }

        if (category == null) {
            throw new InvalidExpenseException("Category cannot be null");
        }

        if (date == null) {
            throw new InvalidExpenseException("Date can not be null");
        } else if (date.isAfter(LocalDate.now())) {
            throw new InvalidExpenseException("Date cannot be in the futuere. Got " + date);
        }

        if (note != null && note.length() > 100) {
            throw new InvalidExpenseException(
                    "Note must be 100 character of less. Current number of current is " + note.length());
        }

        this.amount = amount;
        this.category = category;
        this.date = date;
        this.note = (note == null) ? "" : note.trim();
    }

    public double getAmount() {
        return amount;
    }

    public Category getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return String.format("$%.2f | $s | $s | $s",  amount, category, date, note);
    }

}
