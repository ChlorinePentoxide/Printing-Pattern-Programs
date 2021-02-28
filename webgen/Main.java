import java.util.*;
import java.io.*;

public class Main {
	
	private static String[] configureVariables;
	private static String[] configureValues;
	
	public static void main(String[] args) {
		parseConfigure("config");
		System.out.println(Arrays.toString(configureVariables));
		System.out.println(Arrays.toString(configureValues));
	}
	
	public static void parseConfigure(String file) {
		Vector<String> contents = read(file);
		Vector<String> vnames = new Vector<>(1,1);
		Vector<String> vval = new Vector<>(1,1);
		for(int i=0; i<contents.size();i++) {
			String e = contents.elementAt(i);
			if(e.contains(" ")) {
				String variableName = "";
				for(int j=0;j<e.indexOf(' ');j++) variableName += e.charAt(j);
				String variableValue = e.replace(variableName, "").trim();
				vnames.addElement(variableName);
				vval.addElement(variableValue);
			}
		}
		configureVariables = new String[vnames.size()];
		configureValues = new String[vval.size()];
		for(int i=0;i<configureVariables.length;i++) configureVariables[i] = vnames.elementAt(i);
		for(int i=0;i<configureValues.length;i++) configureValues[i] = vval.elementAt(i);
	}
	
	public static Vector<String> read(String file) {
		Vector<String> c = new Vector<>(1,1);
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(file)));
			while(true) {
				String st = br.readLine();
				if(st == null) break;
				c.addElement(st);
			}
			br.close();
		} catch(IOException ioe) {}
		return c;
	}
	
	
}