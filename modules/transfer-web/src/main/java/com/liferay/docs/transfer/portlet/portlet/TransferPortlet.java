package com.liferay.docs.transfer.portlet.portlet;

import com.liferay.docs.transfer.model.Entry;
import com.liferay.docs.transfer.model.Transfer;
import com.liferay.docs.transfer.portlet.constants.TransferPortletKeys;
import com.liferay.docs.transfer.service.EntryLocalService;
import com.liferay.docs.transfer.service.TransferLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=false", "com.liferay.portlet.scopeable=true",
		"javax.portlet.display-name=Transfer", "javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/transferwebportlet/view.jsp",
		"javax.portlet.resource-bundle=content.Language", "javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supports.mime-type=text/html",
		"javax.portlet.name=" + TransferPortletKeys.TRANSFER, }, service = Portlet.class)
public class TransferPortlet extends MVCPortlet {
	
	public void addEntry(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Entry.class.getName(), request);

		String userName = ParamUtil.getString(request, "name");
		String email = ParamUtil.getString(request, "email");
		String message = ParamUtil.getString(request, "message");
		long transferId = ParamUtil.getLong(request, "transferId");
		long entryId = ParamUtil.getLong(request, "entryId");
		String type = ParamUtil.getString(request, "type");
		String category = ParamUtil.getString(request, " category");
		String contract = ParamUtil.getString(request, " contract");
		String unit = ParamUtil.getString(request, "unit");
		String branch = ParamUtil.getString(request, "branch");
		String unit2 = ParamUtil.getString(request, "unit2");
		String branch2 = ParamUtil.getString(request, " branch2");
		String comments = ParamUtil.getString(request, "comments");

		if (entryId > 0) {

			try {

				_entryLocalService.updateEntry(serviceContext.getUserId(), transferId, entryId, userName, email,
						message, type, category, contract, unit, branch, unit2, branch2, comments, serviceContext);

				SessionMessages.add(request, "entryAdded");

				response.setRenderParameter("transferId", Long.toString(transferId));

			} catch (Exception e) {
				System.out.println(e);

				SessionErrors.add(request, e.getClass().getName());

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "/transferwebportlet/edit_entry.jsp");
			}

		} else {

			try {
				_entryLocalService.addEntry(serviceContext.getUserId(), transferId, userName, email, message, type,
						category, contract, unit, branch, unit2, branch2, comments, serviceContext);

				SessionMessages.add(request, "entryAdded");

				response.setRenderParameter("transferId", Long.toString(transferId));

			} catch (Exception e) {
				SessionErrors.add(request, e.getClass().getName());

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "/transferwebportlet/edit_entry.jsp");
			}
		}
	}

	public void deleteEntry(ActionRequest request, ActionResponse response) throws PortalException {
		long entryId = ParamUtil.getLong(request, "entryId");
		long transferId = ParamUtil.getLong(request, "transferId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Entry.class.getName(), request);

		try {

			response.setRenderParameter("transferId", Long.toString(transferId));

			_entryLocalService.deleteEntry(entryId, serviceContext);
		}

		catch (Exception e) {
			Logger.getLogger(TransferPortlet.class.getName()).log(Level.SEVERE, null, e);
		}
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Transfer.class.getName(), renderRequest);

			long groupId = serviceContext.getScopeGroupId();

			long transferId = ParamUtil.getLong(renderRequest, "transferId");

			List<Transfer> transfers = _transferLocalService.getTransfers(groupId);

			if (transfers.isEmpty()) {
				Transfer transfer = _transferLocalService.addTransfer(serviceContext.getUserId(), "Main",
						serviceContext);

				transferId = transfer.getTransferId();
			}

			if (transferId == 0) {
				transferId = transfers.get(0).getTransferId();
			}

			renderRequest.setAttribute("transferId", transferId);
		} catch (Exception e) {
			throw new PortletException(e);
		}

		super.render(renderRequest, renderResponse);
	}

	@Reference(unbind = "-")
	protected void setEntryService(EntryLocalService entryLocalService) {
		_entryLocalService = entryLocalService;
	}

	@Reference(unbind = "-")
	protected void setTransferService(TransferLocalService transferLocalService) {
		_transferLocalService = transferLocalService;
	}

	private EntryLocalService _entryLocalService;
	private TransferLocalService _transferLocalService;
}
