/*******************************************************************************
 * Copyright (c) 2017 Politecnico di Torino and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/

package it.polito.escape.verify.deserializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import it.polito.escape.verify.exception.InternalServerErrorException;
import it.polito.escape.verify.model.Configuration;

public class ConfigurationCustomDeserializer extends JsonDeserializer<Configuration> {

	@Override
	public Configuration deserialize(JsonParser jp, DeserializationContext ctxt)	throws IOException,
																					JsonProcessingException {
		try {
			JsonNode root = jp.getCodec().readTree(jp);

			return new Configuration("", "", root);
		}
		catch (JsonProcessingException e) {
			throw new InternalServerErrorException("Error parsing configuration: " + e.getMessage());
		}
		catch (IOException e) {
			throw new InternalServerErrorException("I/O error parsing configuration: " + e.getMessage());
		}

	}

}
