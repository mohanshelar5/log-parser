package com.credit.logparser.logparser.service;

import com.credit.logparser.logparser.conf.ApplicationData;
import com.credit.logparser.logparser.manager.LogAnalyserManager;
import com.credit.logparser.logparser.model.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogAnalyserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogAnalyserService.class);


    @Autowired
    private LogAnalyserManager manager;

    @Autowired
    private ApplicationData applicationData;

    public void execute(String... args) {
        Context context = Context.getInstance();
        if (args.length < 1) {
            throw new IllegalArgumentException("Please specify the filepath.");
        }
        context.setLogFilePath(args[0]);
        manager.parseAndPersistEvents(context);
    }

}
