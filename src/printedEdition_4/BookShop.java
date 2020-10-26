package printedEdition_4;

/**
 * Класс Книжный магазин - предназанчен для хранения книг и журналов
 * @author Симонова В.В.
 */
public class BookShop {

    /** Поле для хранения списка печатных изданий книжного магазина*/
    private PrintedEdition[] printedEditions;

    /**
     * Создает книжный магазин со списком печатныъ изданий
     * @param printedEditions - список печатных изданий книжного магазина
     */
    public BookShop(PrintedEdition[] printedEditions) {
        this.printedEditions = printedEditions;
    }

    /**
     * Возвращает строку с информацией о количество печатных изданий магазина (отдельно книг и отдельно журналов)
     * @return строку с информацией о количестве печатных изданий (книг и журналов) магазина
     */
    public String countBooks(){
        int books = 0;
        int magazines = 0;
        for(PrintedEdition printedEdition: printedEditions){
            if(printedEdition instanceof Book) books++;
            else magazines++;
        }

        return "Кол-во книг в магазине: "+books+". Кол-во журналов в магазине: "+magazines;
    }


}
