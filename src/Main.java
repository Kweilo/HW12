public class Main {
    public static void main(String[] args) {
        Author Kate = new Author("Kate", "Lebovski");
        Author Moon = new Author("Moon" , "Berry");

        Book lastStand = new Book("Last Stand", 1988, Kate);
        Book danDan = new Book("Dan Dan", 2024, Moon);
        danDan.setYear(2013);

        System.out.println();;

        System.out.println("Kate.getName() = " + Kate.getName());
        System.out.println("Kate.getLastName() = " + Kate.getLastName());

        System.out.println("lastStand.getTitle() = " + lastStand.getTitle());
        System.out.println("lastStand.getYear() = " + lastStand.getYear());
        System.out.println("lastStand.getAuthor() = " + lastStand.getAuthor().getName()+" "+ lastStand.getAuthor().getLastName());

        System.out.println();

        System.out.println("Moon.getName() = " + Moon.getName());
        System.out.println("Moon.getLastName() = " + Moon.getLastName());

        System.out.println("danDan.getTitle() = " + danDan.getTitle());
        System.out.println("danDan.getYear() = " + danDan.getYear());
        System.out.println("danDan.getAuthor() = " + danDan.getAuthor().getName()+" "+ danDan.getAuthor().getLastName());
    }
}