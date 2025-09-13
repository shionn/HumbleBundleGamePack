package shionn.scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import shionn.scanner.pojo.Bundle;

public class HumbleBundle {


	public static void main(String[] args) throws InterruptedException, ParseException, IOException {
		List<Bundle> bundles = new Scanner().doParsing();
		try (FileWriter w = new FileWriter("data/game-bundles.json")) {
			new ObjectMapper().writerWithDefaultPrettyPrinter().writeValue(w, bundles);
		}
	}


}
