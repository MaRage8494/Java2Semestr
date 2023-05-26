package prakt8.Memento;

import java.util.Stack;

public class GameHistory {
    public Stack<HeroMemento> History;

    public Stack<HeroMemento> getHistory() {
        return History;
    }

    public void setHistory(Stack<HeroMemento> history) {
        History = history;
    }

    public GameHistory()
    {
        History = new Stack<HeroMemento>();
    }
}
