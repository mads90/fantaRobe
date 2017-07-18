package ddl.test;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class JSTestPage extends WebPage {

	private static final long serialVersionUID = 1L;
	public JSTestPage(final PageParameters parameters) {
		super(parameters);
		Form<Void> form = new Form<>("form");
		IModel<String> testo = new Model<>("ciaooooo");
		final Label label = new Label("label", testo);
		label.setOutputMarkupId(true);
		label.setOutputMarkupPlaceholderTag(true);

		final Label label2 = new Label("label2", "testo");
		label2.setOutputMarkupId(true);
		label2.setOutputMarkupPlaceholderTag(true);
                //item.add(new JQueryEffectBehavior(JQueryWidget.getSelector(item), Effect.Shake.toString(), new Options(), 10000, new EffectAdapter()));
//                label.add(new JQueryBehavior(JQueryWidget.getSelector(label)) {
//                    private static final long serialVersionUID = 1L;
//                    @Override
//                    protected String $() {
//                        return String.format("jQuery('%s').hide().toggle('highlight');", selector);
//                    };
//                });
		final AjaxButton button = new AjaxButton("btn", Model.of("effetto")) {
			
			private static final long serialVersionUID = 1L;

			@Override
			protected void onSubmit(AjaxRequestTarget target) {
				super.onSubmit(target);
				target.add(label, label2);
				 target.appendJavaScript(
				            "$('#" +label.getMarkupId() +"').css({'background':'blue'})");
				 target.appendJavaScript(
				            "$('#" +label2.getMarkupId() +"').effect('highlight')");
			}
		};
        add(form);
        form.add(label);
        form.add(label2);
        form.add(button);
	}
}
