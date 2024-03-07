package org.ccd.authservice._global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class WebclientConfig {
	public WebClient webclient(){
		// URI Encoding
		DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory();
		factory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.VALUES_ONLY);

		// Buffer Size
		ExchangeStrategies strategies = ExchangeStrategies.builder()
			.codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(-1)).build();

		return WebClient.builder()
			.uriBuilderFactory(factory)
			.exchangeStrategies(strategies)
			.build();
	}
}
