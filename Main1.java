public class Main1 {
    public static void main(String[] args) {
        Cache<String> cache = new Cache<>(3);

        cache.add("A");
        cache.add("B");
        cache.add("C");
        System.out.println(cache.exists("B"));

        cache.add("D");
        System.out.println(cache.getFirst());
        System.out.println(cache.getLast());

        cache.remove("C");
        System.out.println(cache.getItemByIndex(0));
    }
}
