package poc.compa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompa {
    public static void main(String[] args) {
        List<Emp_Details> emp_detailsList=new ArrayList<Emp_Details>();

        emp_detailsList.add(new Emp_Details("aaj","BZA",9800));
        emp_detailsList.add(new Emp_Details("aRahul","NLR",1800));
        emp_detailsList.add(new Emp_Details("akrish","GNT",100));
        emp_detailsList.add(new Emp_Details("amma","GNT",10));
        emp_detailsList.add(new Emp_Details("araja","IOP",10000));
        Collections.sort(emp_detailsList);
        System.out.println(emp_detailsList);

    }
}
