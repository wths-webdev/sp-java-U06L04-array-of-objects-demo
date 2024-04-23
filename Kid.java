public class Kid {
    private String first; private boolean nice;
    public Kid(){
        first = "";
        nice = true;
    }
    public Kid(String f){
        first = f;
        nice = true;
    }
    public Kid(String f, boolean n){
        first = f;
        nice = n;
    }
    public String getFirstName(){
        return first;
    }
    public boolean getNice(){
        return nice;
    }
    public void setFirstName(String f){
        first = f;
    }
    public void setNice(boolean b){
        nice = b;
    }
}
