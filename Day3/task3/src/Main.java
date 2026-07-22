import java.util.LinkedHashSet;

public class Main {
  public static void main() {
      int [] number= {5,2,1,5,7,2,8,1};
      LinkedHashSet<Integer> set=new LinkedHashSet<>();
      for(int num:number )
          set.add(num);
      for (int num:set)
          System.out.println(num);

    }
}
