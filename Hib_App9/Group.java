import java.io.Serializable;
import java.util.List;

public class Group implements Serializable{
	private int id;
	private String name;
	private List stories;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getStories() {
		return stories;
	}
	public void setStories(List stories) {
		this.stories = stories;
	}
	

}
