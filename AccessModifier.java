class Logger{
    public String format;
 
    public String getFormat() {
       return this.format;
    }
 
    public void setFormat(String format) {
       this.format = format;
       System.out.println(this.format);
    }
 }
public class AccessModifier{
  public static void main(String[] args) {
   Logger obj=new Logger();
   obj.setFormat("nothing to write");
   System.out.println(obj.getFormat());
  }
}