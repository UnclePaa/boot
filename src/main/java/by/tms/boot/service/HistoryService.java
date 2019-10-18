package by.tms.boot.service;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("historyService")
public class HistoryService {
    private List<String> history = new LinkedList<>();

    public void add(String result) {
        history.add(result);
    }

    public List<String> getList() {
        return history;
    }
}