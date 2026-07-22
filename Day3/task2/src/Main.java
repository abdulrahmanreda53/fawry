import java.util.LinkedHashMap;
import java.util.Map;

public class Main{
  public static void main(String[] args) {
      String sentence="Java is great Java Collections are powerful Java is easy.";
      String[] words=sentence.split("");
      LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
      for (String word:words)
      {
          if(map.containsKey(word))
              map.put(word,map.get(word)+1);
          else
              map.put(word,1);
      }
      for (Map.Entry<String,Integer> entry:map.entrySet())
              System.out.println(entry.getKey()+"->"+entry.getValue());

    }
}