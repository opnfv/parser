/*******************************************************************************
 * Copyright (c) 2017 Politecnico di Torino and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/

package it.polito.escape.verify.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import it.polito.escape.verify.exception.InternalServerErrorException;
import it.polito.escape.verify.model.Configuration;

public class CustomConfigurationSerializer extends JsonSerializer<Configuration> {

	@Override
	public void serialize(Configuration conf, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		try {
			jgen.writeObject(conf.getConfiguration());
		} catch (IOException e) {
			throw new InternalServerErrorException("I/O error serializing a configuration object: " + e.getMessage());
		}

	}

}
