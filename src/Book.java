abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return "The title is: " + title;
    }
}

