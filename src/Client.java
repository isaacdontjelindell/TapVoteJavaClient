import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: isaac
 * Date: 10/25/13
 * Time: 11:22 AM
 */
public class Client {
    public static void main(String args[]) {
        System.out.println("Getting survey info for survey 1:");
        getSurveyInfo(1);

        System.out.println("Getting survey results for survey 1:");
        getSurveyResults(1);
    }

    public static void getSurveyResults(int surveyId) {
        // make GET to /getSurveyResults
        try {
            Content content = Request.Get("http://localhost:8000/getSurveyResults?surveyId="+surveyId).execute().returnContent();
            System.out.println(content.toString());
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public static void getSurveyInfo(int surveyId) {
        // make GET to /getSurveyInfo
        try {
            Content content = Request.Get("http://localhost:8000/getSurveyInfo?surveyId="+surveyId).execute().returnContent();
            System.out.println(content.toString());
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public static void vote(int answerId, int questionId) {
        // make POST to /vote
    }

    public static void createSurvey() {

    }


}
