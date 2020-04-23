package br.com.syonet.x.http.core.api;

import br.com.syonet.x.util.DirUtils;

public class LeadStationApiBuilder {
	private String url;
	private String token;
	private DirUtils dirUtils;
	private boolean useSslSocketFactory = false;

	public LeadStationApiBuilder url(String url) {
		this.url = url;
		return this;
	}

	public LeadStationApiBuilder useSslSocketFactory(boolean useSslSocketFactory) {
		this.useSslSocketFactory = useSslSocketFactory;
		return this;
	}

	public LeadStationApiBuilder token(String token) {
		this.token = token;
		return this;
	}

	public LeadStationApiBuilder dirUtils(DirUtils dirUtils) {
		this.dirUtils = dirUtils;
		return this;
	}

	public LeadStationAPI build() {
		return new LeadStationAPI(url, token, dirUtils, useSslSocketFactory );
	}

}
