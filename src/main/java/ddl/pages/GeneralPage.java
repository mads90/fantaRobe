package ddl.pages;

import org.apache.wicket.markup.html.WebPage;

import ddl.Privilege;
import ddl.pojo.User;

public class GeneralPage extends WebPage {

	private Privilege privilege;
	private static final long serialVersionUID = 1L;
	public GeneralPage() {
		super();
		privilege = Privilege.GUEST;
	}
	public GeneralPage(User user) {
	}
}
