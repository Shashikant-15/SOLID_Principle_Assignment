package LSP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    class main_LSP {
    public static void main(String[] args) {
        List<Member> myList = new ArrayList<>();

        myList.add(new LifetimeMember("Shashikant",new Date()));
        myList.add(new AnnualMember("Tanti",new Date()));

        for (Member c: myList){
            c.addToDatabase();

        }
    }
}

