package DataStructure;

import java.util.Date;

public class HistoryEntry {
    private int balance;
    private int mutation;
    private Date timestamp;

    public HistoryEntry(int balance, int mutation, Date timestamp) {
        this.balance = balance;
        this.mutation = mutation;
        this.timestamp = timestamp;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMutation() {
        return mutation;
    }

    public void setMutation(int mutation) {
        this.mutation = mutation;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
