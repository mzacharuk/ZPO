import com.google.gson.Gson;
import org.apache.commons.text.similarity.LongestCommonSubsequenceDistance;

import java.io.*;
import java.sql.Timestamp;
import java.util.Scanner;

public class PolAngQuiz {
    private QuizData answersData = new QuizData();
    private QuizData jsonData;

    int nQuestions = 5;
    double testResult = 0;
    String nickname = "";
    Timestamp startTimestamp;
    Timestamp endTimestamp;

    void startQuiz()
    {
        getData();
        setName();

        startTimestamp = new Timestamp(System.currentTimeMillis());
        for (int i = 1; i <= nQuestions;)
        {
            if (nextQuestion())
            {
                ++i;
            }
        }
        endTimestamp = new Timestamp(System.currentTimeMillis());

        printResult();
        sendResult();

    }

    private void printResult()
    {
        long time = (endTimestamp.getTime() - startTimestamp.getTime())/1000;
        long nanos = ((endTimestamp.getTime() - startTimestamp.getTime())/100) - time*10;
        System.out.println("RESULT [ " + testResult + " / " + nQuestions + " ]"
                + "TIME: " + time + "." + nanos + "s");
    }

    private void setName()
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Your Name -> ");
        nickname = scanner.next();
    }

    private void sendResult()
    {
        Gson gson = new Gson();
        String jsonObject = gson.toJson(answersData);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nickname +".json")))
        {
            bw.write(jsonObject);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    private boolean nextQuestion()
    {
        Scanner scanner = new Scanner (System.in);
        String key = jsonData.getRandomKey();
        String answer;
        if (!key.equals("") && !answersData.checkContains(key))
        {
            System.out.print(key + " -> ");
            answer = scanner.next();
            answersData.setValues(key, new String[]{answer});

            for (String s: jsonData.getValues(key))
            {
                if (s.equalsIgnoreCase(answer))
                {
                    ++testResult;
                }else if(levenstheinCheck(answer,s)){
                    testResult+=0.5;
                }
            }

            return true;
        }
        return false;
    }

    private void getData()
    {
        Gson gson = new Gson();

        try (Reader reader = new FileReader("PolAngTest.json"))
        {
            jsonData = gson.fromJson(reader, QuizData.class);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private boolean levenstheinCheck(String userAnswear, String answear){

        LongestCommonSubsequenceDistance lcsd = new LongestCommonSubsequenceDistance();
        int countLcsd = lcsd.apply(userAnswear.toLowerCase(), answear.toLowerCase());
        System.out.println("DEBUG ONLY: levensthein length: "+countLcsd);
        if(countLcsd==1){
            return true;
        }else{
            return false;
        }

    }
}
