package ddl;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.request.cycle.RequestCycle;

public final class AjaxUtil {

	private AjaxUtil() {

	}

	public static void top(AjaxRequestTarget target) {
		target.appendJavaScript("$('html, body').animate({scrollTop: 0}, 100);");
	}

	public static AjaxRequestTarget getTarget() {
		return RequestCycle.get().find(AjaxRequestTarget.class).get();
	}
}
