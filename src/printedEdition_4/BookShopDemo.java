package printedEdition_4;

public class BookShopDemo {
    public static void main(String[] args) {
        Book book1 = new Book(10000, 100, "Пушкин","поэма","Руслан и Людмила");
        Book book2 = new Book(10000, 100, "Пушкин","поэма","Руслан и Людмила");
        Book book3 = new Book(10000, 100, "Пушкин","поэма","Руслан и Людмила");
        Book book4 = new Book(10000, 100, "Пушкин","поэма","Руслан и Людмила");
        Book book5 = new Book(10000, 100, "Пушкин","поэма","Руслан и Людмила");
        Book book6 = new Book(10000, 100, "Пушкин","поэма","Руслан и Людмила");

        Magazine magazine1 = new Magazine(100,20,"Aминадав Каневский", 3, "Мурзилка");
        Magazine magazine2 = new Magazine(100,20,"Aминадав Каневский", 3, "Мурзилка");
        Magazine magazine3 = new Magazine(100,20,"Aминадав Каневский", 3, "Мурзилка");
        Magazine magazine4 = new Magazine(100,20,"Aминадав Каневский", 3, "Мурзилка");
        Magazine magazine5 = new Magazine(100,20,"Aминадав Каневский", 3, "Мурзилка");
        Magazine magazine6 = new Magazine(100,20,"Aминадав Каневский", 3, "Мурзилка");
        Magazine magazine7 = new Magazine(100,20,"Aминадав Каневский", 3, "Мурзилка");
        Magazine magazine8 = new Magazine(100,20,"Aминадав Каневский", 3, "Мурзилка");

        BookShop bookShop = new BookShop(new PrintedEdition[]{book1, magazine8, magazine4, book2, book3, magazine1,magazine2, magazine3, book4, magazine5, book5,magazine6, magazine7, book6});
        System.out.println(bookShop.countBooks());
    }
}
