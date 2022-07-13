package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Finn";
        }
        if (query.contains(" plus ")) {
            String one = query.substring(query.indexOf(": "), query.indexOf(" plus"));
            String two = query.substring(query.indexOf(" plus "));
            int o = Integer.parseInt(one);
            int t = Integer.parseInt(two);
            int res = o + t;
            return String.valueOf(res);
        }
        return "";
    }
}
