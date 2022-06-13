package Exception;

public class Cohort11Exception extends RuntimeException{
    public Cohort11Exception(){
        super();
    }
    public Cohort11Exception(String name){
        super(name);
    }
    public Cohort11Exception(Throwable ex){
        super(ex);
    }
    public Cohort11Exception(String name, Throwable ex){
        super(name, ex);
    }

}
