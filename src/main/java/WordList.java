import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int count = 0;
    for ( int i = 0; i < myList.size(); i++) {
      if (myList.get(i).size() == len) {
        count ++;
      }
    }
    return count;
  }

  public void removeWordsOfLength(int len)
  {
      ArrayList <String> arr = new ArrayList <String> ();
    for ( int i = 0; i < myList.size(); i++) {
      if (myList. get (i).size() != len) {
        arr.add(i);
      }
    }
    return arr;
    
  }
}
