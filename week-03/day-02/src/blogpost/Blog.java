package blogpost;

import java.util.ArrayList;
import java.util.List;

public class Blog {
  protected List<BlogPost> listOfBlogPost;

  public Blog() {
    this.listOfBlogPost = new ArrayList<BlogPost>();
  }

  public void addPost(BlogPost blogPost){
    listOfBlogPost.add(blogPost);
  }

  public void deleteBlogPost(int index) {
    for (BlogPost posts:listOfBlogPost) {
    }
    listOfBlogPost.remove(index);
  }

  public void update(int index, BlogPost blogpost) {
      listOfBlogPost.add(index,blogpost);
  }
}
