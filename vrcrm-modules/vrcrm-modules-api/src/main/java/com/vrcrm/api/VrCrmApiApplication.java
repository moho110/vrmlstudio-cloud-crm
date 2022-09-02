package com.vrcrm.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vrcrm.common.security.annotation.EnableCustomConfig;
import com.vrcrm.common.security.annotation.EnableRyFeignClients;
import com.vrcrm.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.context.annotation.ComponentScan;

/**
 * 前端API
 *
 * @author vrcrm
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
@ComponentScan(basePackages = {"com.vrcrm.basicdata.*","com.vrcrm.buy.*","com.vrcrm.customer.*",
        "com.vrcrm.finance.*","com.vrcrm.hr.*","com.vrcrm.mytable.*","com.vrcrm.political.*","com.vrcrm.sales.*",
        "com.vrcrm.store.*","com.vrcrm.xsystem.*"})
public class VrCrmApiApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(VrCrmApiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  前端API模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
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