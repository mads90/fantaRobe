package ddl.components;

import org.apache.wicket.markup.html.panel.Panel;

public class DPanel extends Panel {

	private static final long serialVersionUID = 1L;

	public DPanel(String id) {
		super(id);
		setOutputMarkupId(true);
		setOutputMarkupPlaceholderTag(true);
	}
	@Override
	protected void onInitialize() {
		super.onInitialize();
		
        
	}
}
