public class operators {

    public static void main(String[] args) {

        // Arithmetic Operators
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

        // Relational Operators
        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);

        // Logical Operators
        boolean isRaining = true;
        boolean isSunny = false;

        System.out.println(isRaining && isSunny);
        System.out.println(isRaining || isSunny);
        System.out.println(!isRaining);

        // Assignment Operators
        int ratingPoints = 100;

        ratingPoints += 20;
        System.out.println(ratingPoints);

        ratingPoints -= 10;
        System.out.println(ratingPoints);

        ratingPoints *= 2;
        System.out.println(ratingPoints);

        ratingPoints /= 4;
        System.out.println(ratingPoints);

        ratingPoints %= 30;
        System.out.println(ratingPoints);

      //unary operators 
      int activeUsers = 100;

     int prefix = ++activeUsers;
      int postfix = activeUsers++;

     System.out.println(prefix);
      System.out.println(postfix);
      System.out.println(activeUsers);










    }
}













