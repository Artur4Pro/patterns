public class MySyngltone {
    private MySyngltone() {
        System.out.println("Connected");
    }

    private static MySyngltone mySyngltone;

    public static MySyngltone instance() {
        if (mySyngltone != null) {
            return mySyngltone;
        }
        return mySyngltone = new MySyngltone();
    }
    public void print(){
        System.out.println("Hiiii");
    }
}
