import java.util.*;

public class QuizData {
    private Map<String, String[]> dataMap = new HashMap<>();

    public boolean checkContains(String key)
    {
        return dataMap.containsKey(key);
    }

    public String[] getValues(String key)
    {
        return dataMap.get(key);
    }

    public void setValues(String key, String[] values)
    {
        dataMap.put(key,values);
    }

    public String getRandomKey()
    {
        Random rand = new Random();
        List<String> keys = new ArrayList<>(dataMap.keySet());
        if(!keys.isEmpty())
        {
            return keys.get(rand.nextInt(keys.size()));
        }
        return "";
    }
}