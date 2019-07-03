public class ExceptionHandling {

    String msg="";
    public ExceptionHandling(){

    }
    public String throwexception(String msg)
    {
        String str;
        try {
            Exception e=new Exception();

            throw e;
        }
        catch(Exception e) {
            str=msg;
        }
        finally {
            return msg+"reached finally";
        }
    }
}
