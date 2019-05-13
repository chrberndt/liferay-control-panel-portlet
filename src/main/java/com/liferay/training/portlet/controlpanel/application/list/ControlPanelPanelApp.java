package com.liferay.training.portlet.controlpanel.application.list;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.training.portlet.controlpanel.constants.ControlPanelPortletKeys;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=1200",
		"panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT
	},
	service = PanelApp.class
)
public class ControlPanelPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return ControlPanelPortletKeys.CONTROL_PANEL;
	}
	
	@Override
	@Reference(
		target = "(javax.portlet.name=" + ControlPanelPortletKeys.CONTROL_PANEL + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}
