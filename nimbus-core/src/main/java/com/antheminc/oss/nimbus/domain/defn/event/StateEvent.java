/**
 *  Copyright 2016-2018 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.antheminc.oss.nimbus.domain.defn.event;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.antheminc.oss.nimbus.domain.Event;

/**
 * @author Soham Chakravarti
 *
 */
public final class StateEvent {

	@Retention(RUNTIME)
	@Target(ANNOTATION_TYPE)
	@Event
	@Inherited
	public @interface OnStateLoad {

	}
	
	@Retention(RUNTIME)
	@Target(ANNOTATION_TYPE)
	@Event
	@Inherited
	public @interface OnStateChange {

	}
	
	@Retention(RUNTIME)
	@Target(ANNOTATION_TYPE)
	@Event
	@Inherited
	public @interface OnTxnExecute {

	}
}
