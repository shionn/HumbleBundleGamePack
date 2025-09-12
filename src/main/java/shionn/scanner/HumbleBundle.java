package shionn.scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.json.JSONArray;

import shionn.scanner.pojo.Bundle;

public class HumbleBundle {


	public static void main(String[] args) throws InterruptedException, ParseException, IOException {
		List<Bundle> bundles = new Scanner().doParsing();
		try (FileWriter w = new FileWriter("data/game-bundles.json")) {
			w.write(new JSONArray(bundles).toString(4));
		}
	}


}
