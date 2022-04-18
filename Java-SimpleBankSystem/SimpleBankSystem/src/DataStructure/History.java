package DataStructure;

import java.util.ArrayList;
import java.util.Date;

public class History {
    private ArrayList<HistoryEntry> entries = new ArrayList<HistoryEntry>();

    public void addEntry(HistoryEntry entry) {
        entries.add(entry);
    }

    public void createEntry(int balance, int mutation, Date timestamp) {
        HistoryEntry entry = new HistoryEntry(balance, mutation, timestamp);
        addEntry(entry);
    }

    public ArrayList<HistoryEntry> getEntries() {
        return entries;
    }

    public void setEntries(ArrayList<HistoryEntry> entries) {
        this.entries = entries;
    }
}
