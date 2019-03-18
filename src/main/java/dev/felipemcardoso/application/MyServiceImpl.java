package dev.felipemcardoso.application;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class MyServiceImpl implements MyService {

    private static Logger logger = LoggerFactory.getLogger(MyService.class);

    public MyServiceImpl() {
    }

    @Transactional
    public void voila() {
        List<String> test = new ArrayList<>();

        System.out.println("Voila");
        logger.error("Voila Log");
    }
}
