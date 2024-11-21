

public class Generic_Practise  {

    public static void main(String[] args) {

        Generic_Example <String> ob=new Generic_Example("123");
        //Generic_Example<String> obb=new Generic_Example<>("abcd");
        //ob.getValue();
//        String b= ob.Value(String.valueOf(987));


        System.out.println("value of argument:"+ob.getValue());
        //System.out.println("value of argument:"+obb);

    }
}