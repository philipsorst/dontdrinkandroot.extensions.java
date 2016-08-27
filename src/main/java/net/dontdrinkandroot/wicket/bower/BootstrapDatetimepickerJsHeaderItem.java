package net.dontdrinkandroot.wicket.bower;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.markup.head.JavaScriptReferenceHeaderItem;
import org.apache.wicket.request.resource.PackageResourceReference;

import net.dontdrinkandroot.wicket.bootstrap.headeritem.DontdrinkandrootBootstrap33JsHeaderItem;


public class BootstrapDatetimepickerJsHeaderItem extends JavaScriptReferenceHeaderItem
{

	public BootstrapDatetimepickerJsHeaderItem()
	{
		super(
				new PackageResourceReference(
						BootstrapDatetimepickerJsHeaderItem.class,
						"eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"),
				null,
				"bootstrap-datetimepicker.min.js",
				true,
				null,
				null);
	}

	@Override
	public List<HeaderItem> getDependencies()
	{
		List<HeaderItem> deps = new ArrayList<HeaderItem>();
		deps.add(new DontdrinkandrootBootstrap33JsHeaderItem(true));
		deps.add(new MomentJsHeaderItem());

		return deps;
	}
}
