package Svanadze.slprocessor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SLProcessor {

	public static String process(List<String> textLines) {
		String result = null;
		StringBuilder sb = new StringBuilder();

		Map<String, String> variables = new HashMap<String, String>();
		for (String line : textLines) {
			if (line.trim().startsWith("$")) {
				String[] arr = line.split(" ");
				variables.put(arr[1], arr[3]);
			} else {
				sb.append(line).append("\n");
			}
		}
		result = sb.toString();
		for (Map.Entry<String, String> e : variables.entrySet()) {
			result = result.replaceAll("\\$" + e.getKey() + "[\\,\\-\\n\\s]", e.getValue() + " ");
		}
		return result;
	}
}
