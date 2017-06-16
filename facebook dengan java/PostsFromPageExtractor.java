import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

public class PostsFromPageExtractor {

/**
 * A simple Facebook4J client which
 * illustrates how to access group feeds / posts / comments.
 * 
 * @param args
 * @throws FacebookException 
 */
public static void main(String[] args) throws FacebookException {

    // Generate facebook instance.
    Facebook facebook = new FacebookFactory().getInstance();
    // Use default values for oauth app id.
    facebook.setOAuthAppId("1313332295425026", "4cfb776a5cc6f10adc2cc810efb38e73");
    // Get an access token from: 
    // https://developers.facebook.com/tools/explorer
    // Copy and paste it below.
    String accessTokenString = "EAACEdEose0cBAHaiS5rR48BOMvrqTg4ZChpxjA7gyZBY8KZAkKMqCLxTci6ppMgKP0Mjc9CRQoDZBmTZCzAL6Y4N3cyNyVd6j4bQDlosd6N219MduRfcco2BDe2SWZCUiprHRo5VhzVFfRKQYK0Tx5T00LOxoBN1ZAuIZAnL2Kd7bBWN8kWyAZA8dwfE8CxybhwwZD";
    AccessToken at = new AccessToken(accessTokenString);
    // Set access token.
    facebook.setOAuthAccessToken(at);

    // We're done.
    // Access group feeds.
    // You can get the group ID from:
    // https://developers.facebook.com/tools/explorer

    //Set limit to 25 feeds.
    facebook.postStatusMessage("Hello World from Facebook4J.");

   //facebook.likePost("1378558255556606");
            //facebook.commentPhoto("447474898935911", "It's a nice photo!");
        }           
    }
