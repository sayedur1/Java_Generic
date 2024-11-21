

public class Generic_Example <T extends String> {
    private T param1,param2;
    Generic_Example(T param1){

        this.param1=param1;
    }

    //    public T   Value(T argue)
//    {
//        this. param2=argue;
//        return param2;
//    }
    public T getValue(){
        return param1;
    }

}
