package br.com.syonet.x.http.core.api;

import br.com.syonet.x.http.core.api.brand.BrandAPI;
import br.com.syonet.x.http.core.api.brand.BrandAPICalls;
import br.com.syonet.x.http.core.api.customer.CustomerTagAPI;
import br.com.syonet.x.http.core.api.customer.CustomerTagAPICalls;
import br.com.syonet.x.http.core.api.customer.CustomerTimelineAPI;
import br.com.syonet.x.http.core.api.customer.CustomerTimelineAPICalls;
import br.com.syonet.x.http.core.api.form.FieldAPI;
import br.com.syonet.x.http.core.api.form.FieldAPICalls;
import br.com.syonet.x.http.core.api.funnel.FunnelAPI;
import br.com.syonet.x.http.core.api.funnel.FunnelAPICalls;
import br.com.syonet.x.http.core.api.lead.LeadAPI;
import br.com.syonet.x.http.core.api.lead.LeadAPICalls;
import br.com.syonet.x.http.core.api.lossReason.LossReasonAPI;
import br.com.syonet.x.http.core.api.lossReason.LossReasonAPICalls;
import br.com.syonet.x.http.core.api.notification.NotificationAPI;
import br.com.syonet.x.http.core.api.notification.NotificationAPICalls;
import br.com.syonet.x.http.core.api.opportunity.OpportunityAPI;
import br.com.syonet.x.http.core.api.opportunity.OpportunityAPICalls;
import br.com.syonet.x.http.core.api.opportunity.OpportunityFileAPI;
import br.com.syonet.x.http.core.api.opportunity.OpportunityFileAPICalls;
import br.com.syonet.x.http.core.api.opportunity.OpportunityProductAPI;
import br.com.syonet.x.http.core.api.opportunity.OpportunityProductAPICalls;
import br.com.syonet.x.http.core.api.opportunity.OpportunityTimelineAPI;
import br.com.syonet.x.http.core.api.opportunity.OpportunityTimelineAPICalls;
import br.com.syonet.x.http.core.api.phase.PhaseAPI;
import br.com.syonet.x.http.core.api.phase.PhaseAPICalls;
import br.com.syonet.x.http.core.api.product.ProductAPI;
import br.com.syonet.x.http.core.api.product.ProductAPICalls;
import br.com.syonet.x.http.core.api.scheduling.SchedulingAPI;
import br.com.syonet.x.http.core.api.scheduling.SchedulingAPICalls;
import br.com.syonet.x.http.core.api.source.SourceAPI;
import br.com.syonet.x.http.core.api.source.SourceAPICalls;
import br.com.syonet.x.http.core.api.subscription.SubscriptionAPI;
import br.com.syonet.x.http.core.api.subscription.SubscriptionAPICalls;
import br.com.syonet.x.http.core.api.team.TeamAPI;
import br.com.syonet.x.http.core.api.team.TeamAPICalls;
import br.com.syonet.x.http.core.api.template.TemplateAPI;
import br.com.syonet.x.http.core.api.template.TemplateAPICalls;
import br.com.syonet.x.http.core.api.user.UserAPI;
import br.com.syonet.x.http.core.api.user.UserAPICalls;
import br.com.syonet.x.http.core.internal.subscription.SubscriptionAPIInternal;
import br.com.syonet.x.http.core.internal.subscription.SubscriptionAPIInternalCalls;
import br.com.syonet.x.http.core.internal.user.UserAPIInternal;
import br.com.syonet.x.http.core.internal.user.UserAPIInternalCalls;
import br.com.syonet.x.util.DirUtils;

public class LeadStationApiBuilder {
	private String url;
	private String token;
	private DirUtils dirUtils;
	private boolean useSslSocketFactory = false;

	public LeadStationApiBuilder setUrl(String url) {
		this.url = url;
		return this;
	}

	public LeadStationApiBuilder useSslSocketFactory(boolean useSslSocketFactory) {
		this.useSslSocketFactory = useSslSocketFactory;
		return this;
	}

	public LeadStationApiBuilder setToken(String token) {
		this.token = token;
		return this;
	}

	public LeadStationApiBuilder dirUtils(DirUtils dirUtils) {
		this.dirUtils = dirUtils;
		return this;
	}

	private <R> R build(Class<R> clazz) {
		return APICore.create(clazz, 4, url, token, useSslSocketFactory);
	}

	public UserAPI user() {
		return new UserAPI(this.build(UserAPICalls.class));
	}

	public TemplateAPI template() {
		return new TemplateAPI(this.build(TemplateAPICalls.class));
	}

	public TeamAPI team() {
		return new TeamAPI(this.build(TeamAPICalls.class));
	}
	
	public SubscriptionAPI subscription() {
		return new SubscriptionAPI(this.build(SubscriptionAPICalls.class));
	}
	
	public SourceAPI source() {
		return new SourceAPI(this.build(SourceAPICalls.class));
	}

	public SchedulingAPI sheduling() {
		return new SchedulingAPI(this.build(SchedulingAPICalls.class));
	}
	
	public ProductAPI product() {
		return new ProductAPI(this.build(ProductAPICalls.class));
	}
	
	public PhaseAPI phase() {
		return new PhaseAPI(this.build(PhaseAPICalls.class));
	}
	
	public OpportunityAPI opportunity() {
		return new OpportunityAPI(this.build(OpportunityAPICalls.class));
	}
	
	public OpportunityFileAPI opportunityFile() {
		return new OpportunityFileAPI(this.build(OpportunityFileAPICalls.class), this.dirUtils);
	}
	
	public OpportunityProductAPI opportunityProduct() {
		return new OpportunityProductAPI(this.build(OpportunityProductAPICalls.class));
	}
	
	public OpportunityTimelineAPI opportunityTimeLine() {
		return new OpportunityTimelineAPI(this.build(OpportunityTimelineAPICalls.class));
	}
	
	public NotificationAPI notification() {
		return new NotificationAPI(this.build(NotificationAPICalls.class));
	}
	
	public LossReasonAPI lossReason() {
		return new LossReasonAPI(this.build(LossReasonAPICalls.class));
	}
	
	public LeadAPI lead() {
		return new LeadAPI(this.build(LeadAPICalls.class));
	}
	
	public FunnelAPI funnel() {
		return new FunnelAPI(this.build(FunnelAPICalls.class));
	}
	
	public FieldAPI fieldApi() {
		return new FieldAPI(this.build(FieldAPICalls.class));
	}
	
	public CustomerTimelineAPI customerTimeLine() {
		return new CustomerTimelineAPI(this.build(CustomerTimelineAPICalls.class));
	}
	
	public CustomerTagAPI customerTagAPI() {
		return new CustomerTagAPI(this.build(CustomerTagAPICalls.class));
	}
	
	public CustomerTimelineAPI customerTimelineAPI() {
		return new CustomerTimelineAPI(this.build(CustomerTimelineAPICalls.class));
	}
	
	public BrandAPI brand() {
		return new BrandAPI(this.build(BrandAPICalls.class));
	}
	
	public SubscriptionAPIInternal subscriptionInternal() {
		return new SubscriptionAPIInternal(this.build(SubscriptionAPIInternalCalls.class));
	}

	public UserAPIInternal userInternal() {
		return new UserAPIInternal(this.build(UserAPIInternalCalls.class));
	}
}
