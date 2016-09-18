package com.kalerkantho.Model;

import android.text.TextUtils;

import com.kalerkantho.Utils.AppConstant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wlaptop on 8/14/2016.
 */
public class CommonNewsItem {
    private String id;
    private String cat_id;
    private String title;
    private String image;
    private String datetime;
    private String summery;
    private String caption;
    private String start_time;
    private String category;
    private String url;
    private String category_name;
    private String details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getSummery() {
        return summery;
    }

    public void setSummery(String summery) {
        this.summery = summery;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getBanglaDateString() {
        String banglaDate="";

        if(!(TextUtils.isEmpty(datetime)))
        {


            // show date and time in bangla
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date ddd = null;
            try {

                ddd = dt.parse(datetime);

            } catch (ParseException e) {
                e.printStackTrace();
            }

            SimpleDateFormat fullDate = new SimpleDateFormat("dd MMM, yyyy hh:mm");


            banglaDate=fullDate.format(ddd);


        }

        return banglaDate;
    }
}
