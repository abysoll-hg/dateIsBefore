public class Main {
   public boolean dateIsBefore(int month, int day, int month1, int day1) {
      int[] thirtyDays = {4,6,9,11};
      int[] thirtyOneDays = {1,3,5,7,8,10,12};
      for (int i = 0; i < thirtyDays.length; i++) {          
            if (thirtyDays[i] == month && (day > 30 || day < 1)) {
                return false;
            }
        }
        for (int j = 0; j < thirtyOneDays.length; j++) {
            if (thirtyOneDays[j] == month && (day > 31 || day < 1)) {
                return false;
            }
        }
        if (month == 2 && (day > 29 || day < 1)) {
            return false;
        }

        for (int i = 0; i < thirtyDays.length; i++) {
            if (thirtyDays[i] == month1 && (day1 > 30 || day1 < 1)) {
                return false;
            }
        }
        for (int j = 0; j < thirtyOneDays.length; j++) {
            if (thirtyOneDays[j] == month1 && (day1 > 31 || day1 < 1)) {
                return false;
            }
        }
        if (month1 == 2 && (day1 > 29 || day1 < 1)) {
            return false;
        }
      if (month > 12 || month < 1 || month1 > 12 || month1 < 0) {
         return false;
      }
      
      if (month < month1) {
         return true;
      }
      else if (month == month1) {
         if (day < day1) {
            return true;
         }
      }
      return false;
   }
   public static void main(String[] Args) {
      Main m = new Main();
      System.out.println(m.dateIsBefore(6,3,9,20));
      System.out.println(m.dateIsBefore(10,1,2,25));
      System.out.println(m.dateIsBefore(8,15,8,15));
      System.out.println(m.dateIsBefore(8,15,8,16));
   }
}