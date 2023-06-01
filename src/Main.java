public class Main {

    public static void main(String[] args) {
        int[] sales = new int[] {100, 200, 300, 400};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        System.out.println(max);
    }
}
