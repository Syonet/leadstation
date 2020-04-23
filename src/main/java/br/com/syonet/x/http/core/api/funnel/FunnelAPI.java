package br.com.syonet.x.http.core.api.funnel;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.ArrayList;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.funnel.Funnel;

public class FunnelAPI {
	private FunnelAPICalls api;

	public FunnelAPI(FunnelAPICalls api) {
		this.api = api;
	}

	public ArrayList<Funnel> getFunnels() throws APICoreException, AppException {
		return executeCall(this.api.getFunnels()).getContent();
	}
}