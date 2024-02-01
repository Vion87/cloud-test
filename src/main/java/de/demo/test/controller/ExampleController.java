package de.demo.test.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import de.demo.test.storage.MicroStream;

@Controller("/")
public class ExampleController
{
	@Get
	public String root()
	{
		return "Data root, created @ " + MicroStream.root().getData();
	}
}
