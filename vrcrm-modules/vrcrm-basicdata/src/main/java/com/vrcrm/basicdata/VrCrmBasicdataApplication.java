package com.vrcrm.basicdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vrcrm.common.security.annotation.EnableCustomConfig;
import com.vrcrm.common.security.annotation.EnableRyFeignClients;
import com.vrcrm.common.swagger.annotation.EnableCustomSwagger2;


/**
 * 基础数据
 *
 * @author vrcrm
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class VrCrmBasicdataApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(VrCrmBasicdataApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  基础数据模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");
    }
}