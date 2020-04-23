package br.com.syonet.x.util;

import java.io.File;
import java.io.InputStream;

import br.com.syonet.x.model.customer.CustomerFile;
import br.com.syonet.x.model.opportunity.OpportunityFile;

public interface DirUtils {

	File getImageFile(String imageName);

	File getFile(CustomerFile customerFile);

	File getFile(OpportunityFile opportunityFile);

	String getFileNameExtension(String fileName);

	File getTempImageFile();

	File getTempVideoFile();

	File getTempFile(String fileName);

	String generateRandomImageFileName();

	boolean copyFile(InputStream is, File newFile);

	String getFileType(File file);

}