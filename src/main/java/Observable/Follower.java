package Observable;

public class Follower implements FollowerInterface {

	private String followerName;
	public TwitterUser twitterUser=new TwitterUser();
	
	public Follower(String followerName) {
		super();
		this.followerName = followerName;
	}

	@Override
	public void update()
	{
		
		System.out.println("Hey!  "+followerName  +" snew Tweet is uploaded as  "+"\""+twitterUser.title+"\"");
	}
	
	@Override
	public void followUser(TwitterUser fname)
	{
		
	   twitterUser=fname;
	}
	
}
