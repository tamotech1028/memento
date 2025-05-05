public class MementoSample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.type("私は");
        caretaker.save(editor);

        editor.type("朝ごはんを");
        caretaker.save(editor);

        editor.type("食べました");
        caretaker.save(editor);
        System.out.println(editor.getText());

        caretaker.undo(editor);
        caretaker.undo(editor);

        editor.type("晩御飯を");
        caretaker.save(editor);
        editor.type("食べていません");
        caretaker.save(editor);

        System.out.println(editor.getText());

    }
}