package Observable;

public interface TwitterUserInterface {

	void Follow(Follower fname);

	void unFollow(FollowerInterface fname);

	void notifyFollowers();

	void update(String title);

}