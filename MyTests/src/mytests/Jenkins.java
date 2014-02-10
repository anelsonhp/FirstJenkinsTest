package mytests;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;

public class Jenkins {
  
  public static void main(String[] args) {
    new Jenkins().print();
  }
  
  public Jenkins() {
    super();
  }
  
  public void print() {
    DiskFileItemFactory factory  = new DiskFileItemFactory();
    System.out.println(DigestUtils.sha256Hex("TESTTEST2"));
  }
}
