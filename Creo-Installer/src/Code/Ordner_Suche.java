package Code;

import java.io.File;
import java.util.ArrayList;

public class Ordner_Suche{
	public ArrayList<File> searchFile(File dir, String find) {

		File[] files = dir.listFiles();
		ArrayList<File> matches = new ArrayList<File> ();
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().equalsIgnoreCase(find)) { // �berpr�ft ob der Dateiname mit dem Suchstring
										 // �bereinstimmt. Gro�-/Kleinschreibung wird
										 // ignoriert.
					matches.add(files[i]);
				}
				if (files[i].isDirectory()) {
					matches.addAll(searchFile(files[i], find)); // f�gt der ArrayList die ArrayList mit den
										    // Treffern aus dem Unterordner hinzu
				}
			}
		}
		return matches;
	}
}