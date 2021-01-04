public class Square {

    public void drawSquare(int number, String sign) throws InvalidNumberException {
        if (number > 50 || number < 0)
            throw new InvalidNumberException();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(sign + "\t");
            }
            System.out.print("\n");
        }
    }
}
