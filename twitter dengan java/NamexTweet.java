import java.io.IOException;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class NamexTweet {
    private final static String CONSUMER_KEY = "kk1ps6umr0US2UjuIEYRhp6J7";
    private final static String CONSUMER_KEY_SECRET = "u1GkfoSUjw1g7KnkbTLVF07nvgDL4fJyx1jf7rr4D0APGFgl1G";

    public void start() throws TwitterException, IOException {

	Twitter twitter = new TwitterFactory().getInstance();
	twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_KEY_SECRET);

	// here's the difference
	String accessToken = getSavedAccessToken();
	String accessTokenSecret = getSavedAccessTokenSecret();
	AccessToken oathAccessToken = new AccessToken(accessToken,
		accessTokenSecret);

	twitter.setOAuthAccessToken(oathAccessToken);
	// end of difference

	twitter.updateStatus("hallo");

	System.out.println("\nMy Timeline:");

	// I'm reading your timeline
	ResponseList<Status> list = twitter.getHomeTimeline();
	for (Status each : list) {

	    System.out.println("Sent by: @" + each.getUser().getScreenName()
		    + " - " + each.getUser().getName() + "\n" + each.getText()
		    + "\n");
	}

    }

    private String getSavedAccessTokenSecret() {
	// consider this is method to get your previously saved Access Token
	// Secret
	return "JFRAUrlUcWkBdRtFkni06XCQ33Joslxo4nyXZYwgrkFlc";
    }

    private String getSavedAccessToken() {
	// consider this is method to get your previously saved Access Token
	return "361050465-ZkCYKOcPqFW11dO5OquflZ23gTSS99v81XTEJSn1";
    }

    public static void main(String[] args) throws Exception {
	new NamexTweet().start();
    }
}