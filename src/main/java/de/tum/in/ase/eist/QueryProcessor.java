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
        if (query.contains(" plus ") && query.contains("is ")) {
            String one = query.substring(query.indexOf("is ") + 3, query.indexOf(" plus"));
            String two = query.substring(query.indexOf(" plus ") + 6);
            int o = Integer.parseInt(one);
            int t = Integer.parseInt(two);
            int res = o + t;
            return String.valueOf(res);
        }
        if (query.contains(" multiplied by ") && query.contains("is ")) {
            String one = query.substring(query.indexOf("is ") + 3, query.indexOf(" multiplied by"));
            String two = query.substring(query.indexOf(" multiplied by ") + 14);
            int o = Integer.parseInt(one);
            int t = Integer.parseInt(two);
            int res = o * t;
            return String.valueOf(res);
        }
        return "";
    }

    public static void main(String[] args) {
        QueryProcessor queryProcessor = new QueryProcessor();
        queryProcessor.process("what is 10 mutliplied by 10");
    }
}
