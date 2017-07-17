package ddl.behavior;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.CallbackParameter;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.util.string.StringValue;

public class JSComponentBehavior extends AbstractDefaultAjaxBehavior{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void respond(AjaxRequestTarget target) {
	    final StringValue parameterValue = RequestCycle.get().getRequest().getQueryParameters().getParameterValue("yourName");
	    System.out.println(String.format("Hello %s", parameterValue.toString()));
	}

	@Override
	public void renderHead(Component component, IHeaderResponse response) {
	    super.renderHead(component, response);
	    response.render(OnDomReadyHeaderItem.forScript(String.format("initMyComponent('#%s', %s)", component.getMarkupId(), getCallbackFunction(CallbackParameter.explicit("yourName")))));
	}}