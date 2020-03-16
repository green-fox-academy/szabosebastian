import java.util.HashMap;

public class Telephone_book {
  public static void main(String[] args) {
    HashMap<String, String> telephoneBook = new HashMap<String, String>() {{
      put("William A. Lathan", "405-709-1865");
      put("John K. Miller", "402-247-8568");
      put("Hortensia E. Foster", "606-481-6467");
      put("Amanda D. Newland", "319-243-5613");
      put("Brooke P. Askew", "307-687-2982");
    }};

    System.out.println("John K. Miller phone number is: " + telephoneBook.get("John K. Miller"));

    String number = "307-687-2982";
    for (String value : telephoneBook.keySet()) {
      if (number.equals(telephoneBook.get(value))) {
        System.out.println("307-687-2982 is " + value + "'s number.");
      }
    }

    if (telephoneBook.get("Chris E. Myers") == null) {
      System.out.println("We don't know Chris E. Myers number.");
    } else {
      System.out.println("We know Chris E. Myers number.");
    }
  }
}
