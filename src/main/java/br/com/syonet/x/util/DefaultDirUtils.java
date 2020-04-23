package br.com.syonet.x.util;

import java.io.File;
import java.io.InputStream;

import br.com.syonet.x.exception.NotImplementedException;
import br.com.syonet.x.model.customer.CustomerFile;
import br.com.syonet.x.model.opportunity.OpportunityFile;

public class DefaultDirUtils implements DirUtils {

    @Override
	public File getImageFile ( String imageName ) {
        throw new NotImplementedException();
    }

    @Override
	public File getFile ( CustomerFile customerFile ) {
        throw new NotImplementedException();
    }

    @Override
	public File getFile ( OpportunityFile opportunityFile ) {
        throw new NotImplementedException();
    }

    @Override
	public String getFileNameExtension ( String fileName ) {
        throw new NotImplementedException();
    }

    @Override
	public File getTempImageFile () {
        throw new NotImplementedException();
    }

    @Override
	public File getTempVideoFile () {
        throw new NotImplementedException();
    }

    @Override
	public File getTempFile ( String fileName ) {
        throw new NotImplementedException();
    }

    @Override
	public String generateRandomImageFileName () {
        throw new NotImplementedException();
    }

    @Override
	public boolean copyFile ( InputStream is, File newFile ) {
        throw new NotImplementedException();
    }

	@Override
	public String getFileType(File file) {
        throw new NotImplementedException();
	}
}
