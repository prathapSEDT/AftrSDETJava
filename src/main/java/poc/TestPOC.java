package poc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestPOC {
    public static void main(String[] args) {
        List<Hdfc> hdfcList=Arrays.asList(

                new Hdfc("raj","hyd",Arrays.asList(1,5)),
                new Hdfc("krish","banglore",Arrays.asList(11,15)),
                new Hdfc("rahul","hyd",Arrays.asList(11,95))

        );
        Optional result=hdfcList.stream().map(user->user.getPhonenumbers().stream()).flatMap(
                phnostream->phnostream.filter(phno->phno==95)
        ).findAny();

        result.ifPresent(System.out::println);



    }






}
