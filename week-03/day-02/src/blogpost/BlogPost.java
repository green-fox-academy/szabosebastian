package blogpost;

public class BlogPost {
  String authorName;
  String title;
  String text;
  int publicationDate;

  public BlogPost (String authorName, String title, String text, int publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }
}
