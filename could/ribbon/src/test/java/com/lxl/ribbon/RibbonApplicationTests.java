package com.lxl.ribbon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RibbonApplicationTests {

    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++ ){
            Random r = new Random();
            int a = (r.nextInt(11));
            System.out.print(a+"---");
            if(a == 100){
                System.out.println("+++++++++++"+"这是100"+"+++++++++++");
            }
        }
    }

}
