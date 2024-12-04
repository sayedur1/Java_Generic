

public class Generic_Example <T extends String> {
    private T param1,param2;
    Generic_Example(T param1){

        this.param1=param1;
    }



    public T getValue(){
        return param1;
    }

}
