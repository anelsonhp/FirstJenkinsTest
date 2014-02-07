package mytests;

import org.apache.commons.codec.digest.DigestUtils;

public class Jenkins {
  
  public static void main(String[] args) {
    new Jenkins().print();
  }
  
  public Jenkins() {
    super();
  }
  
  public void print() {
    System.out.println(DigestUtils.sha256Hex("TESTTEST"));
  }
}
