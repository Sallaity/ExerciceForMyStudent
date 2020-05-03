public class Main {
    public static void main(String[] args) {
         String arr = { "Tony", "Alex", "Cameron"}

        System.out.println("This is the last element of my array : " + arr[3]);
        // for each name inside my array print my names
        for (String name : arr) {
            System.out.println(arr[name]);
        }
    }
}
