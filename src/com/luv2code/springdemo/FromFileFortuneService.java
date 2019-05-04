package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FromFileFortuneService implements FortuneService {

	private String fileName = "fortune-data.txt";
	private List<String> theFortunes;
	Random random = new Random();

	public FromFileFortuneService() {
		URL url = ClassLoader.getSystemResource(fileName);

		File theFile = new File(url.getPath());

		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());

		// initialize array list
		theFortunes = new ArrayList<String>();

		// read fortunes from file
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		int index = random.nextInt(theFortunes.size());
		return theFortunes.get(index);
	}

}
