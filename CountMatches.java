public class CountMatches {
    public static int numberOfMatches(int n){
        int out = 0;
        while (n > 1){

            out += n/2;
            n = (n/2) + (n%2);
        }
        return out;
    }
    public static void main(String[] args) {
        System.out.println(numberOfMatches(14));
    }
}
