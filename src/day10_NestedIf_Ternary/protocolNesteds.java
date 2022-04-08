package day10_NestedIf_Ternary;

public class protocolNesteds {
    public static void main(String[] args) {
        int statusCode = 501;
        String status = "";

        status = (statusCode == 200 || statusCode == 201 || statusCode == 202 || statusCode == 301 || statusCode == 303 || statusCode == 307
                || statusCode == 400 || statusCode == 401 || statusCode == 403 || statusCode == 404 || statusCode == 410 || statusCode == 500
                || statusCode == 503) ?
                (statusCode == 200) ? "OK" : (statusCode == 201) ? "Created" : (statusCode == 202) ? "Accepted" : (statusCode == 301) ? "Moved Permanently" :
                        (statusCode == 303) ? "See Other+" : (statusCode == 304) ? "Not Modified" : (statusCode == 307) ? "Temporary Redirect" :
                                (statusCode == 400) ? "Bad Request" : (statusCode == 401) ? "Unauthorized" : (statusCode == 403) ? "Forbidden" :
                                        (statusCode == 404) ? "Not Found" : (statusCode == 410) ? "Gone" : (statusCode == 500) ? "Internal Service Error" :
                                                "Service Unavailable" :
                "not correct";
        System.out.println(status);


    }

}
