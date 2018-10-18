/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.function.context.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.cloud.function.context.config.ContextFunctionCatalogInitializer;

/**
 * A test context loader for Spring Boot applications that use the
 * {@link ContextFunctionCatalogInitializer}.
 * 
 * @author Dave Syer
 *
 */
public class FunctionalTestContextLoader extends SpringBootContextLoader {

	@Override
	protected SpringApplication getSpringApplication() {
		return new FunctionalSpringApplication();
	}
}