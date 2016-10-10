/**
 * Copyright (c) 2012 Sohu. All Rights Reserved
 */
package com.sohu.tv.cha1;

import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;

public class JsonUtil {

    public static String model2Json(Blog blog) {
        String jsonData = null;
        try {
            XContentBuilder jsonBuilder = XContentFactory.jsonBuilder();
            jsonBuilder.startObject().field("id", blog.getId()).field("title", blog.getTitle())
            .field("posttime", blog.getPosttime()).field("content",blog.getContent()).endObject();
            jsonData = jsonBuilder.string();
            System.out.println(jsonData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }
}
