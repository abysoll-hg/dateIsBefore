public class Grader {
   public int grade(String user, String color) {
      int score = 0;
      char[] last = user.toCharArray();
      if (("a".equalsIgnoreCase(user.substring(0,1)) || "e".equalsIgnoreCase(user.substring(0,1)) || "i".equalsIgnoreCase(user.substring(0,1)) || "o".equalsIgnoreCase(user.substring(0,1)) || "u".equalsIgnoreCase(user.substring(0,1))) && !(color.equals("white"))) {
         score += 50;
      }
      if ((int) last[user.length()-1] < 105 || !color.equals("white")) {
         score += 3000;
      }
      return score;
   }
   public static void main(String[] Args) {
      Grader g = new Grader();
      System.out.println(g.grade("EasyPeasy", "black"));
      System.out.println(g.grade("APeace", "white"));
      System.out.println(g.grade("WhirledPeas", "white"));
      System.out.println(g.grade("Oscar", "red"));
      System.out.println(g.grade("Amy", "white"));
      System.out.println(g.grade("Ben", "blue"));
   }
}