package DataStructure;

import java.util.ArrayList;
import java.util.Date;

public class History {
    private ArrayList<HistoryEntry> entries = new ArrayList<HistoryEntry>();

    public void addEntry(HistoryEntry entry) {
        entries.add(0, entry);
    }

    public void createEntry(int balance, int mutation) {
        HistoryEntry entry = new HistoryEntry(balance, mutation, new Date());
        addEntry(entry);
    }
    public ArrayList<String[]> getAllStringEntries() {
        ArrayList<String[]> list = new ArrayList<String[]>();

        for (int i = 0; i < entries.size(); i++) {
            HistoryEntry entry = entries.get(i);
            list.add(entry.getStringEntry());
        }
        return list;
    }
    public ArrayList<HistoryEntry> getEntries() {
        return entries;
    }

    public void setEntries(ArrayList<HistoryEntry> entries) {
        this.entries = entries;
    }
}
