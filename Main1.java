public class Main {
    public static void main(String[] args) {
        Cache<String> cache = new Cache<>(3);

        cache.add("A");
        cache.add("B");
        cache.add("C");
        System.out.println(cache.exists("B")); // true

        cache.add("D"); // Удаляет A
        System.out.println(cache.getFirst()); // B
        System.out.println(cache.getLast());  // D

        cache.remove("C");
        System.out.println(cache.getItemByIndex(0)); // B
    }
}
