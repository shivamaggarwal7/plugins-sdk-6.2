/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package de.uhh.l2g.plugins.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import de.uhh.l2g.plugins.model.Video_Facility;
import de.uhh.l2g.plugins.service.Video_FacilityLocalServiceUtil;

/**
 * The extended model base implementation for the Video_Facility service. Represents a row in the &quot;LG_Video_Facility&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Video_FacilityImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Video_FacilityImpl
 * @see de.uhh.l2g.plugins.model.Video_Facility
 * @generated
 */
public abstract class Video_FacilityBaseImpl extends Video_FacilityModelImpl
	implements Video_Facility {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a video_ facility model instance should use the {@link Video_Facility} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Video_FacilityLocalServiceUtil.addVideo_Facility(this);
		}
		else {
			Video_FacilityLocalServiceUtil.updateVideo_Facility(this);
		}
	}
}