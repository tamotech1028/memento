import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> history = new Stack<>();

    public void save(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor) {
        if (!history.isEmpty()) {
            history.pop();
            Memento memento = history.isEmpty() ? null : history.peek();
            textEditor.restore(memento);
        }
    }

}