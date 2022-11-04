package day28_arrays;

public class TaskWebsiteChecker {

    public static void main(String[] args) {

        String[] websites = {"bing.com" , "wikimedia.org","twitter.com","amazonaws.com","japanpost.jp", "mysql.com", "nasa.gov"," linkedin.com","ucla.edu", "github.io", "spotify.com","mozilla.org", "nasa.gov"," ucla.edu","github.io" , "mozilla.org", "comcast.net" ,"tamu.edu" ,"utexas.edu"};

        int com = 0;
        int org = 0;
        int gov = 0;
        int edu = 0;
        int other = 0;

                        for (int i = 0; i< websites.length; i++) {

                            if (websites[i].endsWith(".com")) {
                                com++;
                            }else if(websites[i].endsWith(".org"))  {
                                org++;

                            }else if (websites[i].endsWith(".gov")) {
                                gov++;
                            } else if (websites[i].endsWith(".edu")) {
                                edu++;
                            } else {
                                other++;
                            }

                        }

        System.out.println("Number of com " + com + "\nNumber of org: " + org + "\nNumber of gov: " + gov + "\nNumber of edu: " + edu + "\nNumber of other: " + other);
    }
}

/*
Website checker
Given some urls determine how many .com, .org, and .edu websites
there are. Also keep track of an ‘other’ category for websites that have
a different domain
Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com,
nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com,
comcast.net, tamu.edu, utexas.edu,

 */