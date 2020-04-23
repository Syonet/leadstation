package br.com.syonet.x.http.core.api.lossReason;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.List;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.lossReason.LossReason;

public class LossReasonAPI {
	private LossReasonAPICalls api;

	public LossReasonAPI(LossReasonAPICalls api) {
		this.api = api;
	}

    public List< LossReason > getLossReasons () throws APICoreException, AppException {
        return executeCall( this.api.getLossReasons() ).getContent();
    }
}
