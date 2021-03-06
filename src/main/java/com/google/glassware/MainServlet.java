/*
 * Copyright (C) 2013 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.glassware;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.batch.BatchRequest;
import com.google.api.client.googleapis.batch.json.JsonBatchCallback;
import com.google.api.client.googleapis.json.GoogleJsonError;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpHeaders;
import com.google.api.services.mirror.model.Command;
import com.google.api.services.mirror.model.Contact;
import com.google.api.services.mirror.model.MenuItem;
import com.google.api.services.mirror.model.MenuValue;
import com.google.api.services.mirror.model.NotificationConfig;
import com.google.api.services.mirror.model.TimelineItem;
import com.google.common.collect.Lists;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//HTML PARSER JSOUP IMPORT

import java.io.IOException;
 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;





/**
 * Handles POST requests from index.jsp
 *
 * @author Jenny Murphy - http://google.com/+JennyMurphy
 */
public class MainServlet extends HttpServlet {

  /**
   * Private class to process batch request results.
   * <p/>
   * For more information, see
   * https://code.google.com/p/google-api-java-client/wiki/Batch.
   */
  private final class BatchCallback extends JsonBatchCallback<TimelineItem> {
    private int success = 0;
    private int failure = 0;

    @Override
    public void onSuccess(TimelineItem item, HttpHeaders headers) throws IOException {
      ++success;
    }

    @Override
    public void onFailure(GoogleJsonError error, HttpHeaders headers) throws IOException {
      ++failure;
      LOG.info("Failed to insert item: " + error.getMessage());
    }
  }

  private static final Logger LOG = Logger.getLogger(MainServlet.class.getSimpleName());
  public static final String CONTACT_ID = "com.google.glassware.contact.java-quick-start";
  public static final String CONTACT_NAME = "Java Quick Start";

  //////this is where i try adn connec the Jsoup with mirror
    public static void main(String[] args) {
 
	Document doc;
	try {
 
		doc = Jsoup.connect("http://www.calottery.com/win/winning-numbers").get();
 
		// get page title
		String title = doc.title();
		System.out.println("title : " + title);
                System.out.println("\"<article class=\"cover-only\">\"");
 System.out.println(" +\"<section>\"");
    System.out.println("+\"<p class=\"text-auto-size\"><img src=\"http://static.sc-www.calottery.com/~/media/HomePage/logo-calottery.png\" alt=\"logo for landing image\" width=\"340\" height=\"180\" align=\"center\">\"");
          
         System.out.println(" + \"</p>\"");
          
 System.out.println( "+\"</section>\"");
 System.out.println( "+\"<footer>\"");
   System.out.println( "+\"<p>Tap for more Options</p>\"");
 System.out.println( "+\"</footer>\"");
System.out.println("+\"</article>\"");
System.out.println("+\"<article class=\"auto-paginate\">\"");
                
                
                
                
                
                
                
 
                
          //      -----------------------------------------------------------
                Elements links = doc.select("ul.winning_number");
            //    Elements pngs = doc.select("img[src$=.png]");
                //,a[href*=\"/play/draw-games/powerball/winning-numbers]                
                //,a[href]
              //  Elements game = doc.select ("a[href]");
                int i = 0;
              String[] myStringArray = new String[]{"<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Powerball/powerball_logo_landing_page.png\" width=\"148\" height=\"87\" align=\"middle\">","<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Mega-Millions/megamillions_landing_page_logo.png\" width=\"148\" height=\"87\" align=\"middle\">","<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/SuperLotto-Plus/superlottoplus-jackpot.png\" width=\"148\" height=\"87\" align=\"middle\">","<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Fantasy-5/fantasy-5-jackpot.png\" width=\"148\" height=\"87\" align=\"middle\">","<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Daily-4/daily-4-jackpot.png\" width=\"148\" height=\"87\" align=\"middle\">","<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Daily-3/daily-3-jackpot.png\" width=\"148\" height=\"87\" align=\"middle\">","<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Daily-Derby/daily-derby-jackpot.png\" width=\"148\" height=\"87\" align=\"middle\">","<img src=\" http://static.sc-www.calottery.com/~/media/Play/draw_games/Hot-Spot/hot-spot-bullseye-jackpot.png\" width=\"148\" height=\"87\" align=\"middle\">"};
              System.out.println();
                for (Element link : links) {
                        String image = link.attr("ul.winning_number");
			// get the value from href attribute
                       // System.out.println("<article class=\"auto-paginate\">");
		//	System.out.println("link : " + link.attr("href")+ image);
                //THIS IS WHERE GET THE WINNIG NUI<BER DFARW NUMBER ANSD THE DATE 
                        System.out.println("+\"<p>"+myStringArray[i]+link.text()+   "</p>\"");
                        i++;          
                }
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                System.out.println("+\"</article>\";");
                
                
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
  }
 

  
  
  
  
  
  
  
  private static final String PAGINATED_HTML =
  

        
        
    
    
/*
      "<article class='auto-paginate'>"
      + "<h2 class='blue text-large'>California Lottery Results</h2>"
      + "<p>Tap to<em class='yellow'>VIEW</em>Public Website"
      + "powerball/winning-numbers"
      + "link : Draw Entry is Closed Results Coming Soon!"
      +"mega-millions/winning-numbers"
        +"link : 37 46 48 70 74 1"
        +"superlotto-plus/winning-numbers"
        +"link : Draw Entry is Closed Results Coming Soon!"
        +"fantasy-5/winning-numbers"
        +"link : 1 2 13 26 33"
        +"daily-4/winning-numbers"
        +"link : 3 5 8 8"
        +"daily-3/winning-numbers"
        +"link : 1 3 4"
        +"link : 4 4 3"
        + "California Lottery, tap to view the website!</p>"
        + "</article>";
  */
  //--------------------------------------------------------------------------
  
  /*
  "<article>"
  +"<section>"
    +"<table class=\"align-justify\">"
      +"<tbody>"
        +"<tr>"
          +"<td>PowerBall</td>"
          +"<td><font size=\"3\">37 46 48 70 74 </font></td>"
          +"<td class=\"red\">1</td>"
        +"</tr>"
        +"<tr>"
          +"<td>MegaMillion</td>"
          +"<td>37 46 48 70 74 1</td>"
          +"<td class=\"green\">1</td>"
        +"</tr>"
        +"<tr>"
          +"<td>GOOG</td>"
          +"<td>727.58</td>"
          +"<td class=\"red\">-12.41 (1.68%)</td>"
        +"</tr>"
      +"</tbody>"
    +"</table>"
  +"</section>"
+"</article>";
  
  */
         /* 
          "<article class=\"cover-only\">"
  +"<section>"
    +"<p class=\"text-auto-size\"><img src=\"http://static.sc-www.calottery.com/~/media/HomePage/logo-calottery.png\" alt=\"logo for landing image\" width=\"340\" height=\"180\" align=\"center\">"
          
          + "</p>"
          
  +"</section>"
  +"<footer>"
    +"<p>Tap for more Options</p>"
  +"</footer>"
+"</article>"+
"<article class=\"auto-paginate\">"
 +" <li class=\"clearfix\">"
          
          
          //this IS WHERE I HAVE THE CARD GENEEREATED
						
                       +" <a href=\"http://www.calottery.com/play/draw-games/powerball/Winning-Numbers/\">"
                            +"<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Powerball/powerball_logo_landing_page.png\" alt=\"logo for landing image\" width=\"170\" height=\"90\" align=\"middle\"><FONT COLOR=\"white\"> <FONT SIZE=5>37 46 48 70 74 1"
                       +" </a>"
					   +" <a href=\"http://www.calottery.com/play/draw-games/powerball/Winning-Numbers/\">"
                            +"<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Powerball/powerball_logo_landing_page.png\" alt=\"logo for landing image\" width=\"170\" height=\"90\" align=\"middle\"><FONT COLOR=\"white\"> <FONT SIZE=5>37 46 48 70 74 1"
                       +" </a>"
					   +" <a href=\"http://www.calottery.com/play/draw-games/powerball/Winning-Numbers/\">"
                            +"<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Powerball/powerball_logo_landing_page.png\" alt=\"logo for landing image\" width=\"170\" height=\"90\" align=\"middle\"><FONT COLOR=\"white\"> <FONT SIZE=5>37 46 48 70 74 1"
                       +" </a>"

                   +" </li>"
  
+"</article>";
  */
  //THIS IS PRETTY MUCH THE FINAL VERSION 
          
  "<article class=\"cover-only\">"
 +"<section>"
+"<p class=\"text-auto-size\"><img src=\"http://static.sc-www.calottery.com/~/media/HomePage/logo-calottery.png\" alt=\"logo for landing image\" width=\"340\" height=\"180\" align=\"center\">"
 + "</p>"
+"</section>"
+"<footer>"
+"<p>Tap for more Options</p>"
+"</footer>"
+"</article>"
+"<article class=\"auto-paginate\">"

+"<p><img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Powerball/powerball_logo_landing_page.png\" width=\"148\" height=\"87\" align=\"middle\">2 24 28 32 59 25</p>"
+"<p><img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Mega-Millions/megamillions_landing_page_logo.png\" width=\"148\" height=\"87\" align=\"middle\">1 6 10 46 58 13</p>"
+"<p><img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/SuperLotto-Plus/superlottoplus-jackpot.png\" width=\"148\" height=\"87\" align=\"middle\">4 14 19 36 41 3</p>"
+"<p><img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Fantasy-5/fantasy-5-jackpot.png\" width=\"148\" height=\"87\" align=\"middle\">6 11 14 19 39</p>"
+"<p><img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Daily-4/daily-4-jackpot.png\" width=\"148\" height=\"87\" align=\"middle\">7 4 2 0</p>"
+"<p><img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Daily-3/daily-3-jackpot.png\" width=\"148\" height=\"87\" align=\"middle\">9 1 9</p>"
+"<p><img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Daily-Derby/daily-derby-jackpot.png\" width=\"148\" height=\"87\" align=\"middle\">0 2 1</p>"
+"</article>";
  
  
  /*
          
          //SIMPLEST BEST YET-Full
		  
		       "<article class=\"cover-only\">"
  +"<section>"
    +"<p class=\"text-auto-size\"><img src=\"http://static.sc-www.calottery.com/~/media/HomePage/logo-calottery.png\" alt=\"logo for landing image\" width=\"340\" height=\"180\" align=\"center\">"
          
          + "</p>"
          
  +"</section>"
  +"<footer>"
    +"<p>Tap for more Options</p>"
  +"</footer>"
+"</article>"
+"<article class=\"auto-paginate\">"
 //+" <li class=\"clearfix\">"
		  
		  
		  
		  
   +"<p>"
         +"<a href=\"http://www.calottery.com/play/draw-games/powerball/Winning-Numbers/\">"
         +"<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Powerball/powerball_logo_landing_page.png\" alt=\"logo for landing image\" width=\"148\" height=\"87\" align=\"middle\"><FONT COLOR=\"white\"> <FONT SIZE=5>37 46 48 70 74 1"
         +"</a>"
      +"</p>"
      //<!-- Winning-Numbers -->
      +"<p>"
         +"<a href=\"http://www.calottery.com/play/draw-games/powerball/Winning-Numbers/\">"
         +"<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Mega-Millions/megamillions_landing_page_logo.png\" alt=\"logo for landing image\" width=\"148\" height=\"87\" align=\"middle\"><FONT COLOR=\"white\"> <FONT SIZE=5>37 46 48 70 74 1"
         +"</a>"
      +"</p>"
      +"<p>"
         +"<a href=\"http://www.calottery.com/play/draw-games/powerball/Winning-Numbers/\">"
         +"<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/SuperLotto-Plus/superlottoplus-jackpot.png\" alt=\"logo for landing image\" width=\"148\" height=\"87\" align=\"middle\"><FONT COLOR=\"white\"> <FONT SIZE=5>37 46 48 70 74 1"
         +"</a>"
      +"</p>"
      +"<p>"
         +"<a href=\"http://www.calottery.com/play/draw-games/powerball/Winning-Numbers/\">"
         +"<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Fantasy-5/fantasy-5-jackpot.png\" alt=\"logo for landing image\" width=\"148\" height=\"87\" align=\"middle\"><FONT COLOR=\"white\"> <FONT SIZE=5>37 46 48 70 74 1"
         +"</a>"
      +"</p>"
      +"<p>"
         +"<a href=\"http://www.calottery.com/play/draw-games/powerball/Winning-Numbers/\">"
         +"<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Daily-4/daily-4-jackpot.png\" alt=\"logo for landing image\" width=\"148\" height=\"87\" align=\"middle\"><FONT COLOR=\"white\"> <FONT SIZE=5>37 46 48 70 74 1"
         +"</a>"
      +"</p>"
      +"<p>"
         +"<a href=\"http://www.calottery.com/play/draw-games/powerball/Winning-Numbers/\">"
         +"<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Daily-3/daily-3-jackpot.png\" alt=\"logo for landing image\" width=\"148\" height=\"87\" align=\"middle\"><FONT COLOR=\"white\"> <FONT SIZE=5>37 46 48 70 74 16"
         +"</a>"
      +"</p>"
      +"<p>"
         +"<a href=\"http://www.calottery.com/play/draw-games/powerball/Winning-Numbers/\">"
         +"<img src=\"http://static.sc-www.calottery.com/~/media/Play/draw_games/Daily-Derby/daily-derby-jackpot.png\" alt=\"logo for landing image\" width=\"148\" height=\"87\" align=\"middle\"><FONT COLOR=\"white\"> <FONT SIZE=5>37 46 48 70 74 1"
         +"</a>"
      +"</p>"
      +"<p>"
         +"<a href=\"http://www.calottery.com/play/draw-games/powerball/Winning-Numbers/\">"
         +"<img src=\" http://static.sc-www.calottery.com/~/media/Play/draw_games/Hot-Spot/hot-spot-bullseye-jackpot.png\"  alt=\"logo for landing image\" width=\"148\" height=\"87\" align=\"middle\"><FONT COLOR=\"white\"> <FONT SIZE=5>37 46 48 70 74 1"
         +"</a>"
      +"</p>"
  
  
  +"</article>";
  
  */
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
      /*    
         
 "<section>"
          +"<div class=\"info\">"
        +"<p>"
            +"<a href=\"http://www.calottery.com/play/draw-games/powerball/winning-numbers\" class=\"see-all\"> "                
            +"</a>"
        +"</p>"
       +" <p> "          
        +"<ul class=\"winning_number\">"
            +"<li><span>4</span></li><li><span>20</span></li><li><span>34</span></li><li><span>39</span></li><li><span>58</span></li><li class=\"bullseye\"><span>31</span></li>"
       +" </ul>"
   +"</div>"
  +"</section>";

    */      
          
    
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
  
  
  
  
   //  private static final String bundleId = 
  
  
  
  
  
  
  
  
  

  /**
   * Do stuff when buttons on index.jsp are clicked
   */
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

    String userId = AuthUtil.getUserId(req);
    Credential credential = AuthUtil.newAuthorizationCodeFlow().loadCredential(userId);
    String message = "";

    if (req.getParameter("operation").equals("insertSubscription")) {

      // subscribe (only works deployed to production)
      try {
        MirrorClient.insertSubscription(credential, WebUtil.buildUrl(req, "/notify"), userId,
            req.getParameter("collection"));
        message = "Application is now subscribed to updates.";
      } catch (GoogleJsonResponseException e) {
        LOG.warning("Could not subscribe " + WebUtil.buildUrl(req, "/notify") + " because "
            + e.getDetails().toPrettyString());
        message = "Failed to subscribe. Check your log for details";
      }

    } else if (req.getParameter("operation").equals("deleteSubscription")) {

      // subscribe (only works deployed to production)
      MirrorClient.deleteSubscription(credential, req.getParameter("subscriptionId"));

      message = "Application has been unsubscribed.";

    } else if (req.getParameter("operation").equals("insertItem")) {
      LOG.fine("Inserting Timeline Item");
      TimelineItem timelineItem = new TimelineItem();

      if (req.getParameter("message") != null) {
        timelineItem.setText(req.getParameter("message"));
      }

      // Triggers an audible tone when the timeline item is received
      timelineItem.setNotification(new NotificationConfig().setLevel("DEFAULT"));

      if (req.getParameter("imageUrl") != null) {
        // Attach an image, if we have one
        URL url = new URL(req.getParameter("imageUrl"));
        String contentType = req.getParameter("contentType");
        MirrorClient.insertTimelineItem(credential, timelineItem, contentType, url.openStream());
      } else {
        MirrorClient.insertTimelineItem(credential, timelineItem);
      }

      message = "A timeline item has been inserted.";

    } else if (req.getParameter("operation").equals("insertPaginatedItem")) {
      LOG.fine("Inserting Timeline Item");
      TimelineItem timelineItem = new TimelineItem();
      timelineItem.setHtml(PAGINATED_HTML);
    //  timelineItem.setBundleId(bundleId);

      List<MenuItem> menuItemList = new ArrayList<MenuItem>();
      menuItemList.add(new MenuItem().setAction("OPEN_URI").setPayload(
          "http://www.calottery.com/win/winning-numbers"));
      timelineItem.setMenuItems(menuItemList);

      // Triggers an audible tone when the timeline item is received
      timelineItem.setNotification(new NotificationConfig().setLevel("DEFAULT"));

      MirrorClient.insertTimelineItem(credential, timelineItem);

      message = "A timeline item has been inserted.";

    } else if (req.getParameter("operation").equals("insertItemWithAction")) {
      LOG.fine("Inserting Timeline Item");
      TimelineItem timelineItem = new TimelineItem();
      timelineItem.setText("Tell me what you had for lunch :)");

      List<MenuItem> menuItemList = new ArrayList<MenuItem>();
      // Built in actions
      menuItemList.add(new MenuItem().setAction("REPLY"));
      menuItemList.add(new MenuItem().setAction("READ_ALOUD"));

      // And custom actions
      List<MenuValue> menuValues = new ArrayList<MenuValue>();
      menuValues.add(new MenuValue().setIconUrl(WebUtil.buildUrl(req, "/static/images/drill.png"))
          .setDisplayName("Drill In"));
      menuItemList.add(new MenuItem().setValues(menuValues).setId("drill").setAction("CUSTOM"));

      timelineItem.setMenuItems(menuItemList);
      timelineItem.setNotification(new NotificationConfig().setLevel("DEFAULT"));

      MirrorClient.insertTimelineItem(credential, timelineItem);

      message = "A timeline item with actions has been inserted.";

    } else if (req.getParameter("operation").equals("insertContact")) {
      if (req.getParameter("iconUrl") == null || req.getParameter("name") == null) {
        message = "Must specify iconUrl and name to insert contact";
      } else {
        // Insert a contact
        LOG.fine("Inserting contact Item");
        Contact contact = new Contact();
        contact.setId(req.getParameter("id"));
        contact.setDisplayName(req.getParameter("name"));
        contact.setImageUrls(Lists.newArrayList(req.getParameter("iconUrl")));
        contact.setAcceptCommands(Lists.newArrayList(new Command().setType("TAKE_A_NOTE")));
        MirrorClient.insertContact(credential, contact);

        message = "Inserted contact: " + req.getParameter("name");
      }

    } else if (req.getParameter("operation").equals("deleteContact")) {

      // Insert a contact
      LOG.fine("Deleting contact Item");
      MirrorClient.deleteContact(credential, req.getParameter("id"));

      message = "Contact has been deleted.";

    } else if (req.getParameter("operation").equals("insertItemAllUsers")) {
      if (req.getServerName().contains("glass-java-starter-demo.appspot.com")) {
        message = "This function is disabled on the demo instance.";
      }

      // Insert a contact
      List<String> users = AuthUtil.getAllUserIds();
      LOG.info("found " + users.size() + " users");
      if (users.size() > 10) {
        // We wouldn't want you to run out of quota on your first day!
        message =
            "Total user count is " + users.size() + ". Aborting broadcast " + "to save your quota.";
      } else {
        TimelineItem allUsersItem = new TimelineItem();
        allUsersItem.setText("Hello Everyone!");
        //allUsersItem.setBundleId(bundleId);

        BatchRequest batch = MirrorClient.getMirror(null).batch();
        BatchCallback callback = new BatchCallback();

        // TODO: add a picture of a cat
        for (String user : users) {
          Credential userCredential = AuthUtil.getCredential(user);
          MirrorClient.getMirror(userCredential).timeline().insert(allUsersItem)
              .queue(batch, callback);
        }

        batch.execute();
        message =
            "Successfully sent cards to " + callback.success + " users (" + callback.failure
                + " failed).";
      }


    } else if (req.getParameter("operation").equals("deleteTimelineItem")) {

      // Delete a timeline item
      LOG.fine("Deleting Timeline Item");
      MirrorClient.deleteTimelineItem(credential, req.getParameter("itemId"));

      message = "Timeline Item has been deleted.";

    } else {
      String operation = req.getParameter("operation");
      LOG.warning("Unknown operation specified " + operation);
      message = "I don't know how to do that";
    }
    WebUtil.setFlash(req, message);
    res.sendRedirect(WebUtil.buildUrl(req, "/"));
  }
}
