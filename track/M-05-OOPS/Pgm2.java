
class Book {

    private int pageNum;

    public void setData(int x) {
        if (x > 0) {
            pageNum = x;
        } else {
            System.out.println("Please enter the valid number of pages.");
        }
    }

    public int getData() {
        return pageNum;
    }
}

public class Pgm2 {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setData(-100);
        System.out.println(b1.getData());
    }
}
