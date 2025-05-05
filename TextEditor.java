public class TextEditor {
    private String text = "";

    public String getText() {
        return text;
    }

    // 現在の状態を保存する（Mementoを返す）
    public Memento save(){
        return new Memento(text);
    }

    // 保存された状態に復元する
    public void restore(Memento memento){
        this.text = memento.getText();
    }

    // 文字列を追加入力する（例：「こんにちは」と打つ）
    public void type(String newText) {
        this.text += newText;
    }

}
