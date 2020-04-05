package com.liferay.docs.transfer.application.list;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.docs.transfer.portlet.constants.TransferPortletKeys;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
@Component(
	    immediate = true,
	    property = {
	        "panel.app.order:Integer=300",
	        "panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT
	    },
	    service = PanelApp.class
	)
public class TransferAdminPanelApp extends BasePanelApp {

	@Override
    public String getPortletId() {
        return TransferPortletKeys.TRANSFER_ADMIN;
    }

    @Override
    @Reference(
        target = "(javax.portlet.name=" + TransferPortletKeys.TRANSFER_ADMIN + ")",
        unbind = "-"
    )
    public void setPortlet(Portlet portlet) {
        super.setPortlet(portlet);
    }

}
