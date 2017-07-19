package ddl.test;


import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes.Method;
import org.apache.wicket.ajax.attributes.CallbackParameter;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnEventHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.StringValue;

import ddl.ws.ChatMessage;
import ddl.ws.ChatMessage.MessageDecoder;
import ddl.ws.ChatMessage.MessageEncoder;

public  class WSTarget extends WebPage {
	private static final long serialVersionUID = 1L;
	  private String value = "";
	  private String value2 = "Pippo";
	  int i=0;
	public WSTarget(final PageParameters parameters) {
		super(parameters);
		 Form<Void> form = new Form("form");
		
		 final Label label = new Label("label", new PropertyModel(WSTarget.this, "value"));
         label.setOutputMarkupId(true);
         label.setOutputMarkupPlaceholderTag(true);
         final Label labella = new Label("labella", new PropertyModel(WSTarget.this, "value2"));
         labella.setOutputMarkupId(true);
         labella.setOutputMarkupPlaceholderTag(true);
         form.add(label);
         form.add(labella);
         add(form);

         label.add(new DemoCallback(){
             @Override
             protected void onCallback(String fromClient, AjaxRequestTarget target) {
            	 i++;
            	 String one = "ciao";
            	 String two = "Pluto";
            	 value = one;
            	 value2= two;
                 value = value+i;
                 value2= value2+i;
                 target.add( labella);
             }
         });
//         label.setVisible(false);
//         labella.add(new DemoCallback(){
//             @Override
//             protected void onCallback(String fromClient, AjaxRequestTarget target) {
//            	 i++;
//                 value = fromClient+i;
//                 
//                 target.add(labella);
//             }
//         }); 
     
    }
	 class DemoCallback extends AbstractDefaultAjaxBehavior {

        @Override
        public void renderHead(Component component, IHeaderResponse response) {
            super.renderHead(component, response);

            StringBuffer script = new StringBuffer();
//            script.append("alert('Callback will follow!');\n");
            script.append("var dataForServer='From client with love.';\n");
            script.append(getCallbackFunctionBody(CallbackParameter
                    .explicit("dataForServer")));

            response.render(OnEventHeaderItem.forScript(
                    "'" + component.getMarkupId() + "'", "click", script.toString()));
        }

        @Override
        protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
            super.updateAjaxAttributes(attributes);
            attributes.setMethod(Method.POST);
        }

        protected void onCallback(String fromClient, AjaxRequestTarget target) {
            System.out.println("Viene overraidato...");
        }

		@Override
		protected void respond(AjaxRequestTarget target) {
			StringValue parameterValue = RequestCycle.get().getRequest()
                    .getPostParameters().getParameterValue("dataForServer");
            onCallback(parameterValue.toString(), target);
		}
    }
}
