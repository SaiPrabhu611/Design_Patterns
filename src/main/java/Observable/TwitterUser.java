package Observable;

import java.util.ArrayList;
import java.util.List;

public class TwitterUser implements TwitterUserInterface {

	
	private List<Follower> follower=new ArrayList<>();
	String title;
	
	@Override
	public void Follow(Follower fname)
	{
		
		follower.add(fname);
		
	}

@Override
public void unFollow(FollowerInterface fname)
{
	follower.remove(fname);
}

@Override
public void notifyFollowers()
{
	for(FollowerInterface fname:follower)
	{
		
		fname.update();
	}

}
@Override
public void update(String title)
{
this.title=title;
notifyFollowers();


}

}


