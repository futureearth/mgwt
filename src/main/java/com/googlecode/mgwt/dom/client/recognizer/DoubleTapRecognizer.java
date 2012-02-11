/*
 * Copyright 2012 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.dom.client.recognizer;

import com.google.gwt.event.shared.HasHandlers;
import com.googlecode.mgwt.dom.client.event.touch.TouchCancelEvent;
import com.googlecode.mgwt.dom.client.event.touch.TouchEndEvent;
import com.googlecode.mgwt.dom.client.event.touch.TouchHandler;
import com.googlecode.mgwt.dom.client.event.touch.TouchMoveEvent;
import com.googlecode.mgwt.dom.client.event.touch.TouchStartEvent;

public class DoubleTapRecognizer implements TouchHandler {

	public static final int DEFAULT_DISTANCE = 15;
	public static final int DEFAULT_TIME_IN_MS = 300;

	private final HasHandlers source;
	private final int distance;
	private final int time;

	public DoubleTapRecognizer(HasHandlers source) {
		this(source, DEFAULT_DISTANCE, DEFAULT_TIME_IN_MS);
	}

	public DoubleTapRecognizer(HasHandlers source, int distance) {
		this(source, distance, DEFAULT_TIME_IN_MS);
	}

	public DoubleTapRecognizer(HasHandlers source, int distance, int time) {
		this.source = source;
		this.distance = distance;
		this.time = time;

	}

	@Override
	public void onTouchStart(TouchStartEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTouchMove(TouchMoveEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTouchEnd(TouchEndEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTouchCanceled(TouchCancelEvent event) {
		// TODO Auto-generated method stub

	}

}
