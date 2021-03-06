package com.agan.weibo.service;


import com.agan.weibo.common.Constants;
import com.agan.weibo.common.PageResult;
import com.agan.weibo.entity.Content;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Slf4j
@Service
public class PushContentService extends ContentService{


    /**
     * 用户发微博
     */
    public void post(Content obj){
        this.addContent(obj);
    }

}
