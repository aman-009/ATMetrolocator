package com.example.amanmehta.atmetrolocator;

/**
 * Created by amanmehta on 22/07/17.
 */

public class station {
    private String activity_name;
    private String activity_imgURL;

    public station(String activity_name, String activity_imgURL) {
        this.activity_name = activity_name;
        this.activity_imgURL = activity_imgURL;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }

    public String getActivity_imgURL() {
        return activity_imgURL;
    }

    public void setActivity_imgURL(String activity_imgURL) {
        this.activity_imgURL = activity_imgURL;
    }
}
