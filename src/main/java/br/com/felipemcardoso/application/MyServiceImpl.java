package br.com.felipemcardoso.application;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class MyServiceImpl implements MyService {

    private static Logger logger = LogManager.getLogger(MyServiceImpl.class);

    public MyServiceImpl() {
    }

    @Transactional
    public void voila() {
        List<String> test = new ArrayList<>();

        System.out.println("Voila");
        logger.error("Voila Log");
    }
}
