public class CompareLenght {
    public static void main(String[] args) {
        int [] firstArrayOfNumbers = {1,2,3,};
        int [] secondArrayOfNumbers = {4,5};

        if (firstArrayOfNumbers.length < secondArrayOfNumbers.length) {
            System.out.println("secondArrayOfNumbers is longer");
        } else {
            System.out.println("secondArrayOfNumbers is not longer");
        }
    }
}
