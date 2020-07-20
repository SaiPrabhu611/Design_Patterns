package Observable;

public class Twitter {

	public static void main(String args[])
	{
		TwitterUser NarendraModi=new TwitterUser();
		
		
		Follower t1=new Follower("Sanketh Reddy"); 
		Follower t2=new Follower("Vinneth"); 
		Follower t3=new Follower("Ramesh"); 
		Follower t4=new Follower("Uday"); 
		Follower t5=new Follower("Rohan"); 
	
		NarendraModi.Follow(t1);
		NarendraModi.Follow(t2);
		NarendraModi.Follow(t3);
		NarendraModi.Follow(t4);
		NarendraModi.Follow(t5);
		
		
		NarendraModi.unFollow(t5);
		
		
		
		t1.followUser(NarendraModi);
		t2.followUser(NarendraModi);
		t3.followUser(NarendraModi);
		t4.followUser(NarendraModi);
		t5.followUser(NarendraModi);
		
		
		
		NarendraModi.update("Happy Womans day to all inspiring womans of the world");
	}
	
}
