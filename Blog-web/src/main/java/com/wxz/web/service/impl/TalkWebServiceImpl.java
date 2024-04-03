package com.wxz.web.service.impl;

import com.wxz.web.mapper.TalkWebMapper;
import com.wxz.web.service.TalkWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TalkWebServiceImpl implements TalkWebService {

    @Autowired
    private TalkWebMapper talkWebMapper;
}
