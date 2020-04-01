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
    for (int i = 0; i < index; i++) {
      listOfBlogPost.add(blogpost);
    }
  }
}
