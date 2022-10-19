package org.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

@Configuration
public class TilesConfig {

    @Bean
    public TilesConfigurer tilesConfigurer() {

        final TilesConfigurer configurer = new TilesConfigurer();

        configurer.setDefinitions(new String[]{"/WEB-INF/tiles/tiles.xml"});
        configurer.setCheckRefresh(true);

        return configurer;
    }
}