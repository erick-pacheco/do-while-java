class Main {
  public static void main(String[] args) {
    int num = 1;

    /* Sample Code */
    do {
      log(num);
      num++;
    } while (num <= 10);

    /*
     * Test: create a do-while loop that prints out the numbers from 20 - 1
     * (inclusive).
     */
    int myTestInt = 20;
    do {
      log(myTestInt);
      myTestInt--;
    } while (myTestInt >= 1);
  }

  public static void log(Object message) {
    System.out.println(message);
  }
}
