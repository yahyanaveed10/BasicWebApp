package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class QueryProcessor {


    public String process(String query) {
		query = query.toLowerCase();
        if(query.contains("what")) {
            String[] strings = query.split("%20");
            Pattern pattern = Pattern.compile("[^0-9]");
            String regex = "\\d+";
            List<String> list = new ArrayList();
            for (String s : strings) {
                if (s.matches(regex)) ;
                {
                    String numberOnly = pattern.matcher(s).replaceAll("");
                            list.add(s);
                }
            }
        }
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "yahya";
        }    if(query.contains("what")) {
            String[] strings = query.split("%20");
            Pattern pattern = Pattern.compile("[^0-9]");
            String regex = "\\d+";
         //   List<String> list = new ArrayList();
            String lastArray = "what is ";
            for (String s : strings) {
                if (s.matches(regex)) ;
                {
                    lastArray += " ";
                    String numberOnly = pattern.matcher(s).replaceAll("");
                  //  list.add(s);
                    lastArray += s ;
                }
            }

           return lastArray;
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
