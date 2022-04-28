public class Main {
    public static void main(String[] args) {
        MySyngltone.instance().print();
        MySyngltone.instance();

        Book book = new BookBuilder().setAuthor("aaa").setDescription("ffff").setGenre("bbbb").setPublishingYear(1500).setTitle("rrrr").bookBuilder();
        System.out.println(book);
    }
}
