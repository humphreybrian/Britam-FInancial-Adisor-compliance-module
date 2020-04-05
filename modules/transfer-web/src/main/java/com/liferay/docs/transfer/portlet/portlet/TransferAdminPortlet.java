package com.liferay.docs.transfer.portlet.portlet;

import com.liferay.docs.transfer.model.Transfer;
import com.liferay.docs.transfer.portlet.constants.TransferPortletKeys;
import com.liferay.docs.transfer.service.TransferLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.scopeable=true", "javax.portlet.display-name=Transfers",
		"javax.portlet.expiration-cache=0", "javax.portlet.init-param.portlet-title-based-navigation=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/transferadminportlet/view.jsp",
		"javax.portlet.name=" + TransferPortletKeys.TRANSFER_ADMIN, "javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=administrator", "javax.portlet.supports.mime-type=text/html",
		"com.liferay.portlet.add-default-resource=true" }, service = Portlet.class)

public class TransferAdminPortlet extends MVCPortlet {
	public void addTransfer(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Transfer.class.getName(), request);

		String name = ParamUtil.getString(request, "name");

		try {
			_transferLocalService.addTransfer(serviceContext.getUserId(), name, serviceContext);
		} catch (PortalException pe) {

			Logger.getLogger(TransferAdminPortlet.class.getName()).log(Level.SEVERE, null, pe);

			response.setRenderParameter("mvcPath", "/transferadminportlet/edit_transfer.jsp");
		}
	}

	private TransferLocalService _transferLocalService;

	@Reference(unbind = "-")
	protected void setTransferService(TransferLocalService transferLocalService) {
		_transferLocalService = transferLocalService;
	}

	public void updateTransfer(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Transfer.class.getName(), request);

		String name = ParamUtil.getString(request, "name");
		long transferId = ParamUtil.getLong(request, "transferId");

		try {
			_transferLocalService.updateTransfer(serviceContext.getUserId(), transferId, name, serviceContext);

		} catch (PortalException pe) {

			Logger.getLogger(TransferAdminPortlet.class.getName()).log(Level.SEVERE, null, pe);

			response.setRenderParameter("mvcPath", "/transferadminportlet/edit_transfer.jsp");
		}
	}

	public void deleteTransfer(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Transfer.class.getName(), request);

		long transferId = ParamUtil.getLong(request, "transferId");

		try {
			_transferLocalService.deleteTransfer(transferId, serviceContext);
		} catch (PortalException pe) {

			Logger.getLogger(TransferAdminPortlet.class.getName()).log(Level.SEVERE, null, pe);
		}
	}

}
