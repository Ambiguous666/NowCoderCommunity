package com.nowcoder.community;


import com.nowcoder.community.util.SensitiveFilter;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

//@SpringBootTest
//@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTest {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter(){
        String text = "这里可以※赌※博※，可以读博，可以吸毒，可以开票，还可啊啊啊啊啊";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }
}
