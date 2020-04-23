package br.com.syonet.x.model.customer;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class CustomerFile implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID id;
    private UUID customerId;
    private String name;
    private long size;
    private Date uploadedAt;

    private boolean downloading;

    public UUID getId () {
        return id;
    }

    public void setId ( UUID id ) {
        this.id = id;
    }

    public UUID getCustomerId () {
        return customerId;
    }

    public void setCustomerId ( UUID customerId ) {
        this.customerId = customerId;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public long getSize () {
        return size;
    }

    public void setSize ( long size ) {
        this.size = size;
    }

    public Date getUploadedAt () {
        return uploadedAt;
    }

    public void setUploadedAt ( Date uploadedAt ) {
        this.uploadedAt = uploadedAt;
    }

    public boolean isDownloading () {
        return downloading;
    }

    public void setDownloading ( boolean downloading ) {
        this.downloading = downloading;
    }
}
