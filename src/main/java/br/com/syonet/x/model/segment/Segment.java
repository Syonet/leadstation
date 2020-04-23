package br.com.syonet.x.model.segment;

import java.io.Serializable;

public class Segment implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SegmentType
    private String type;
    private SegmentOptions options;

    public String getType () {
        return type;
    }

    public void setType ( String type ) {
        this.type = type;
    }

    public SegmentOptions getOptions () {
        return options;
    }

    public void setOptions ( SegmentOptions options ) {
        this.options = options;
    }
}
